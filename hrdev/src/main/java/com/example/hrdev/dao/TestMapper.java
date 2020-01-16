package com.example.hrdev.dao;

import com.example.hrdev.entity.TestVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

    TestVo test();
}
