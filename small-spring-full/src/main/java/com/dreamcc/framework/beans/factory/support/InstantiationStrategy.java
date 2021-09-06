package com.dreamcc.framework.beans.factory.support;

import com.dreamcc.framework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author cloud-cc
 * @ClassName InstantiationStrategy
 * @Description 实例化测试接口
 * @date 2021/9/6 11:41
 * @Version 1.0
 */
public interface InstantiationStrategy {

    /**
     * 实例化类
     *
     * @param beanDefinition
     * @param beanName
     * @param constructor
     * @param args
     * @return
     */
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object[] args);
}
