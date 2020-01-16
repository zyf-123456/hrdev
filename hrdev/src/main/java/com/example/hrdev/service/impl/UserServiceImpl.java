package com.example.hrdev.service.impl;

import com.example.hrdev.dao.UserMapper;
import com.example.hrdev.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
    @Autowired
    private UserMapper userMapper;
    public User findUser(User user){
        return userMapper.findUser(user);
    }


}
