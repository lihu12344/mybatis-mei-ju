package com.example.demo.typehandler;

import com.example.demo.myenum.Sex;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(Sex.class)
@MappedJdbcTypes(JdbcType.INTEGER)
public class MyTypeHandler implements TypeHandler<Sex> {

    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, Sex sex, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i,sex.getId());
    }

    @Override
    public Sex getResult(ResultSet resultSet, int i) throws SQLException {
        return Sex.getSexById(resultSet.getInt(i));
    }

    @Override
    public Sex getResult(ResultSet resultSet, String s) throws SQLException {
        return Sex.getSexById(resultSet.getInt(s));
    }

    @Override
    public Sex getResult(CallableStatement callableStatement, int i) throws SQLException {
        return Sex.getSexById(callableStatement.getInt(i));
    }
}
