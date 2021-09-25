package com.yt.springbootredis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consistence")
public class ConsistenceController {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("/test")
    public String test(){
        redisTemplate.opsForValue().set("test", "hello redis");
        return redisTemplate.opsForValue().get("test").toString();
    }

    @GetMapping("/redis")
    public String redis(){
        return "redis";
    }

}
