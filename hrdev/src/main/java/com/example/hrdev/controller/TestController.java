package com.example.hrdev.controller;

import com.example.hrdev.entity.TestVo;
import com.example.hrdev.entity.User;
import com.example.hrdev.service.TestService;
import com.example.hrdev.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/testController")
public class TestController {

    @Autowired
    private TestService testService;

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/test")
    public ModelAndView test(){
        TestVo test = testService.test();
        return new ModelAndView("shouyes");/**/
    }
}
