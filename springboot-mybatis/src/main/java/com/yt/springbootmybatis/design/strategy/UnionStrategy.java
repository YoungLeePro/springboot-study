package com.yt.springbootmybatis.design.strategy;

/**
 * @USER: Young
 * @DATETIME: 2021/2/26
 * @DESCRIPTION:
 **/
public class UnionStrategy implements PayStrategy {
    @Override
    public String toPay() {
        return "请调用银联支付...";
    }
}
