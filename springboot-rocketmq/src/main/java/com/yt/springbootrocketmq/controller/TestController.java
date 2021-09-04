package com.yt.springbootrocketmq.controller;

import com.alibaba.fastjson.JSONObject;
import com.yt.springbootrocketmq.model.User;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyang
 */
@RestController
public class TestController {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @RequestMapping("sendMsg")
    public String sendMsg(){
        rocketMQTemplate.convertAndSend("myTest", JSONObject.toJSONString(new User(1, "llllll")));
        return null;
    }
}
