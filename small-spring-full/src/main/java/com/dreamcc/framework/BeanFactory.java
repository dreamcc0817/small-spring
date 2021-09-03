package com.dreamcc.framework;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

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
     * @param beanName bean名称
     * @return bean
     */
    Object getBean(String beanName);


    void registerBeanDefinition(String beanName,BeanDefinition bean);


}
