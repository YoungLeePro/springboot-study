package com.yt.springbootmybatis.controller;

import com.yt.springbootmybatis.design.strategy.PayContextStrategy;
import com.yt.springbootmybatis.service.PaymentChannelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @USER: Young
 * @DATETIME: 2021/2/26
 * @DESCRIPTION:
 **/
@RestController
@RequestMapping("paymentChannel")
public class PaymentChannelController {
    @Resource
    private PaymentChannelService paymentChannelService;

    @Resource
    private PayContextStrategy payContextStrategy;

    @GetMapping("/getById/{id}")
    public Object getById(@PathVariable("id") Integer id){
        return paymentChannelService.getById(id);
    }

    @GetMapping("getByChannelId/{channelId}")
    public Object getByChannelId(@PathVariable("channelId") String channelId){
        return paymentChannelService.getByChannelId(channelId);
    }

    @GetMapping("/toPay/{payCode}")
    public String toPay(@PathVariable("payCode") String payCode) {
        return payContextStrategy.toPay(payCode);
    }
}
