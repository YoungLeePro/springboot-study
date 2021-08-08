package com.yt.springbootmybatis.design.template;

/**
 * @USER: Young
 * @DATETIME: 2021/2/27
 * @DESCRIPTION:
 **/
public class PureMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        // 空实现即可
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
