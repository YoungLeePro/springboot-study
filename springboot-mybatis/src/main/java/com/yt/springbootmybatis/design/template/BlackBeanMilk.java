package com.yt.springbootmybatis.design.template;

/**
 * @USER: Young
 * @DATETIME: 2021/2/26
 * @DESCRIPTION:
 **/
public class BlackBeanMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        System.out.println("配料是上好的红豆...");
    }
}
