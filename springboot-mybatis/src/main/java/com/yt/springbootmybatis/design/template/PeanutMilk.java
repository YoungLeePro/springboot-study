package com.yt.springbootmybatis.design.template;

/**
 * @USER: Young
 * @DATETIME: 2021/2/26
 * @DESCRIPTION:
 **/
public class PeanutMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        System.out.println("配料是花生...");
    }
}
