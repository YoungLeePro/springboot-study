package com.yt.springbootmybatis.design.strategy;

import org.springframework.stereotype.Component;

/**
 * @USER: Young
 * @DATETIME: 2021/2/26
 * @DESCRIPTION: 具体实现角色
 **/
@Component
public class AliPayStrategy implements PayStrategy {

    @Override
    public String toPay() {
        return "请调用支付宝支付接口";
    }
}
