package com.druid.demo.controller;

import com.druid.demo.entry.Test;
import com.druid.demo.service.SelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MysqlConnController {

    @Autowired
    SelectService selectService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return "123123123123";
    }

    @RequestMapping(value = "/selectTest",method = RequestMethod.GET)
    public List<Test> selectTest(){
        return selectService.selectTest();
    }
}
