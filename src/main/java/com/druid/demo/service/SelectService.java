package com.druid.demo.service;

import com.druid.demo.entry.Test;
import com.druid.demo.mapper.SelectMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SelectService {

    @Resource
    SelectMapper selectMapper;

    public List<Test> selectTest(){
        return selectMapper.selectTest();
    }
}
