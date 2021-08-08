package com.yt.springbootmybatis.design.template;

/**
 * @USER: Young
 * @DATETIME: 2021/2/26
 * @DESCRIPTION:
 **/
public class Client {
    public static void main(String[] args) {
        // 制作红豆豆浆
        System.out.println("准备制作红豆豆浆");
        SoyaMilk blackBeanMilk = new BlackBeanMilk();
        blackBeanMilk.make();

        System.out.println("-------------------");
        System.out.println("准备制作花生豆浆");
        SoyaMilk peanutMilk = new PeanutMilk();
        peanutMilk.make();

        System.out.println("--------------------");
        System.out.println("准备制作纯豆浆");
        SoyaMilk pureMilk = new PureMilk();
        pureMilk.make();
    }
}
