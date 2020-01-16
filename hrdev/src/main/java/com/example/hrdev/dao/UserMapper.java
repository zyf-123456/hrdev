package com.example.hrdev.dao;

import com.example.hrdev.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    public User findUser(@Param("user") User user);
}
