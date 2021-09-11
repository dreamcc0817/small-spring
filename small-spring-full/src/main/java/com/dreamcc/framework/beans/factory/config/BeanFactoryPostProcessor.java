package com.dreamcc.framework.beans.factory.config;

import com.dreamcc.framework.beans.BeansException;

/**
 * @author cloud-cc
 * @ClassName BeanFactoryPostProcessor
 * @Description 在所有BeanDefinition加载完成后，实例化Bean对象之前，提供修改BeanDefinition属性的机制
 * @date 2021/9/10 17:11
 * @Version 1.0
 */
public interface BeanFactoryPostProcessor {

    /**
     * 在所有BeanDefinition加载完成后，实例化Bean对象之前，提供修改BeanDefinition属性的机制
     *
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
