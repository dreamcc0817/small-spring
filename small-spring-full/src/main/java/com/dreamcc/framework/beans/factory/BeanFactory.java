package com.dreamcc.framework.beans.factory;


import com.dreamcc.framework.beans.BeansException;

/**
 * @author cloud-cc
 * @ClassName BeanFactory
 * @Description
 * @date 2021/9/3 11:45
 * @Version 1.0
 */
public interface BeanFactory {

    /**
     * 获取Bean
     *
     * @param beanName bean名称
     * @return bean
     */
    Object getBean(String beanName);

    Object getBean(String beanName, Object... args);

    /**
     * 按类型获取Bean
     *
     * @param beanName
     * @param requiredType
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> T getBean(String beanName, Class<T> requiredType) throws BeansException;
}
