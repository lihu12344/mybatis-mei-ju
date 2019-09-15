package com.example.demo.pojo;

import com.example.demo.typehandler.MyTypeHandler;
import com.example.demo.myenum.Sex;
import tk.mybatis.mapper.annotation.ColumnType;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@Table(name = "user")
public class User implements Serializable {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    private String name;

    private Integer age;

    private Sex sex;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getId(), user.getId()) &&
                Objects.equals(getName(), user.getName()) &&
                Objects.equals(getAge(), user.getAge()) &&
                getSex() == user.getSex();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAge(), getSex());
    }

    @Override
    public String toString() {
        return this.getId()+" "+this.getName()+" "+this.getAge()+" "+this.getSex();
    }
}