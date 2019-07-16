package com.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.web.dao")
public class SpringbootDemo3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemo3Application.class, args);
    }

}
