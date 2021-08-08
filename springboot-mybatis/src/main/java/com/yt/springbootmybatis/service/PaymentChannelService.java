package com.yt.springbootmybatis.service;

import com.yt.springbootmybatis.model.PaymentChannel;
import com.yt.springbootmybatis.model.User;

import java.util.List;

/**
 * @USER: Young
 * @DATETIME: 2021/2/5
 * @DESCRIPTION:
 **/
public interface PaymentChannelService {

    PaymentChannel getById(Integer id);

    PaymentChannel getByChannelId(String channelId);

}
