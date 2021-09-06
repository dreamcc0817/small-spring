package com.dreamcc.framework.beans.factory.support;

import com.dreamcc.framework.beans.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author cloud-cc
 * @ClassName DefaultListableBeanFactory
 * @Description 核心实现类
 * @date 2021/9/3 14:40
 * @Version 1.0
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory{

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    @Override
    public BeanDefinition getBeanDefinition(String beanName) {
        return beanDefinitionMap.get(beanName);
    }

    public void registerBeanDefinition(String beanName, BeanDefinition bean) {
        beanDefinitionMap.put(beanName, bean);
    }
}
