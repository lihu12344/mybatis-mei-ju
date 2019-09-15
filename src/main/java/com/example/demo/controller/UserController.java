package com.example.demo.controller;

import com.example.demo.dao.UserMapper;
import com.example.demo.myenum.Sex;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/save")
    public User save(){
        User user=new User();
        //user.setId(1);
        user.setName("瓜田李下");
        user.setAge(24);
        user.setSex(Sex.FeMale);

        userMapper.insert(user);
        System.out.println(user);

        return user;
    }

    @RequestMapping("/get")
    public User get(){
        return userMapper.selectByPrimaryKey(5);
    }
}
