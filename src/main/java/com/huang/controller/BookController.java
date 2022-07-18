package com.huang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    //读取yaml中的单一数据
    @Value("${country}")
    private String country1;

    //读取yaml中的单一数据
    @Value("${user.name}")
    private String name1;

    //
    @Autowired
    private Environment env;

    @GetMapping
    public String getById(){
        System.out.println("Spring boot is running 8081");

        System.out.println("country=====>" + country1);
        System.out.println("name=====>" + name1);

        System.out.println("--------------");

        System.out.println(env.getProperty("country"));
        System.out.println(env.getProperty("server.port"));

        return "Spring boot is running 8081";
    }
}
