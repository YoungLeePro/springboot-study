package com.yt.springbootmybatis.design.template;

/**
 * @USER: Young
 * @DATETIME: 2021/2/26
 * @DESCRIPTION: 抽象类，表示豆浆
 **/
public abstract class SoyaMilk {
    //模板方法，make，模板方法可以使用final修饰，不让子类去重写
    final void make(){
        select();
        // 如果为true，则添加配料
        if (customerWantCondiments()) {
            addCondiments();
        }
        soak();
        beat();
    }

    // 选材料
    void select(){
        System.out.println("第一步，选材料");
    }

    // 添加不同配料。抽象方法
    abstract void addCondiments();

    // 浸泡
    void soak(){
        System.out.println("第三步，浸泡");
    }

    // 打磨
    void beat(){
        System.out.println("第四步，打磨");
    }

    // 钩子方法，决定是否添加配料，默认添加
    boolean customerWantCondiments(){
        return true;
    }
}
