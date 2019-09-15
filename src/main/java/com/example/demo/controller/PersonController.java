package com.example.demo.controller;

import com.example.demo.dao.PersonMapper;
import com.example.demo.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonMapper personMapper;

    @RequestMapping("/save2")
    public Person save(){
        Person person=new Person();
        person.setName("瓜田李下");
        person.setAge(24);

        personMapper.insert(person);
        return person;
    }

}
