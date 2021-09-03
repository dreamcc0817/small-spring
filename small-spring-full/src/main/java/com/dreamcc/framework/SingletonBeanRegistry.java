package com.dreamcc.framework;

/**
 * @author cloud-cc
 * @ClassName SingletonBeanRegistry
 * @Description TODO
 * @date 2021/9/3 15:36
 * @Version 1.0
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
