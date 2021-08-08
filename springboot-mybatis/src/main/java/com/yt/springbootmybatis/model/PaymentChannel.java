package com.yt.springbootmybatis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @USER: Young
 * @DATETIME: 2021/2/26
 * @DESCRIPTION:
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentChannel {
    private Integer id;
    /** 渠道名称 */
    private String channelName;
    /** 渠道ID */
    private String channelId;
    /**
     * 策略执行beanId
     */
    private String strategyBeanId;
}
