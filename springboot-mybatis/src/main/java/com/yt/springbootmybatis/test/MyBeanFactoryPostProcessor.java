package com.yt.springbootmybatis.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @USER: Young
 * @DATETIME: 2021/2/11
 * @DESCRIPTION:
 **/
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        BeanDefinition aa = configurableListableBeanFactory.getBeanDefinition("aa");
        // 修改、设置bean信息
        aa.setScope("singleton");
    }
}
