package com.dreamcc.framework.beans.factory.config;

import com.dreamcc.framework.beans.BeansException;

/**
 * @author cloud-cc
 * @ClassName BeanPostProcessor
 * @Description 在Bean对象执行初始化方法之前，执行此方法
 * @date 2021/9/10 17:21
 * @Version 1.0
 */
public interface BeanPostProcessor {

    /**
     * 在Bean对象执行初始化方法之前，执行此方法
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    /**
     * 在Bean对象执行初始化方法之后，执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;
}