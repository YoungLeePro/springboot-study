package com.yt.springbootmybatis.design.strategy;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.yt.springbootmybatis.mapper.PaymentChannelMapper;
import com.yt.springbootmybatis.model.PaymentChannel;
import com.yt.springbootmybatis.utils.SpringUtils;
import com.yt.springbootmybatis.utils.enums.BaseReturnInfo;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * @USER: Young
 * @DATETIME: 2021/2/26
 * @DESCRIPTION: 上下文
 **/
@Component
public class PayContextStrategy {

    @Resource
    private PaymentChannelMapper paymentChannelMapper;

    public String toPay(String payCode) {
        // 1.参数验证
        if (payCode == null || payCode == "") {
            return BaseReturnInfo.PAYCODE_IS_BLANK;
        }

        // 2.根据paycode查询
        PaymentChannel paymentChannel = paymentChannelMapper.getByChannelId(payCode);
        if (paymentChannel == null) {
            return BaseReturnInfo.PAYMENTCHANNEL_IS_NULL;
        }

        // 3.获取策略的beanId
        String strategyBeanId = paymentChannel.getStrategyBeanId();
        if (strategyBeanId == null) {
            return BaseReturnInfo.STRATEGYBEANID_IS_BLANK;
        }

        // 4.根据beanId在spring容器中查找对应的bean
        PayStrategy payStrategy = SpringUtils.getApplicationContext().getBean(strategyBeanId, PayStrategy.class);

        // 5.执行具体的策略
        String toPay = payStrategy.toPay();
        return toPay;
    }
}
