package com.druid.demo.mapper;

import com.druid.demo.entry.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SelectMapper {

    @Select("select * from test")
    List<Test> selectTest();

}
