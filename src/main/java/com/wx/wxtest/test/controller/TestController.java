package com.wx.wxtest.test.controller;

import com.wx.wxtest.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class TestController {

    @Autowired
    TestService testService;
    @Autowired
    HttpServletRequest request;

    @GetMapping("")
    public String testUrl(){
        String results = testService.getRequestMsg(request);
        return results;
    }
}
