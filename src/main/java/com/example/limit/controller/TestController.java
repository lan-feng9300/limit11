package com.example.limit.controller;

import com.example.limit.annotation.AccessLimit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @AccessLimit(sec = 15, limit = 3)
    @GetMapping("/test")
    public void get(){

        System.out.println("已经输出了");
    }
}
