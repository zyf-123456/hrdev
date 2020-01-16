package com.example.hrdev.service.impl;

import com.example.hrdev.dao.TestMapper;
import com.example.hrdev.entity.TestVo;
import com.example.hrdev.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestMapper testMapper;

    @Override
    public TestVo test() {
        return testMapper.test();
    }
}
