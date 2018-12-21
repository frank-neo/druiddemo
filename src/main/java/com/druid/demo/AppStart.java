package com.druid.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.druid.demo.mapper")
public class AppStart {
    public static void main (String[] args){

        SpringApplication.run(AppStart.class,args);

    }
}
