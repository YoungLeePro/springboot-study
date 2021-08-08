package com.yt.springbootmybatis.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

/**
 * @USER: Young
 * @DATETIME: 2021/2/13
 * @DESCRIPTION:
 **/
@Configuration
@ConditionalOnProperty(name = "enable.autoConfiguration")
public class MyStarterDemo {
    static {
        System.out.println("myStarter init。。.。.。");
    }
}
