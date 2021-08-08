package com.yt.springbootmybatis.service.impl;

import com.yt.springbootmybatis.mapper.PaymentChannelMapper;
import com.yt.springbootmybatis.mapper.UserMapper;
import com.yt.springbootmybatis.model.PaymentChannel;
import com.yt.springbootmybatis.model.User;
import com.yt.springbootmybatis.service.PaymentChannelService;
import com.yt.springbootmybatis.service.UserService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @USER: Young
 * @DATETIME: 2021/2/5
 * @DESCRIPTION:
 **/
@Service
public class PaymentChannelServiceImpl implements PaymentChannelService {

    @Resource
    private PaymentChannelMapper paymentChannelMapper;


    @Override
    public PaymentChannel getById(Integer id) {
        PaymentChannel paymentChannel = paymentChannelMapper.getById(id);
        return paymentChannel;
    }

    @Override
    public PaymentChannel getByChannelId(String channelId) {
        PaymentChannel paymentChannel = paymentChannelMapper.getByChannelId(channelId);
        return paymentChannel;
    }

}
