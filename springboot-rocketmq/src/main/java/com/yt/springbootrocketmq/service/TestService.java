package com.yt.springbootrocketmq.service;


import com.alibaba.fastjson.JSONObject;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

/**
 * @author liyang
 */
@Service
@RocketMQMessageListener(topic = "myTest", consumerGroup = "myGroup")
public class TestService implements RocketMQListener<String> {

    @Override
    public void onMessage(String s) {
        System.out.println("消费信息：" + JSONObject.toJSONString(s));
    }
}
