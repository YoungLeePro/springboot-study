package com.yt.springbootbase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("tc")
@RestController
public class TestController {

    @GetMapping("test")
    public String test() {
        return "hello springboot";
    }
}
