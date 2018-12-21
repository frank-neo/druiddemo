package com.druid.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.druid.demo.mapper")
@ServletComponentScan//这行是为了避免扫描不到Druid的Servlet
public class AppStart {
    public static void main (String[] args){

        SpringApplication.run(AppStart.class,args);

    }
}
