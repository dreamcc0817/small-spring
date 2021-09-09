package com.dreamcc.framework.beans.factory.config;

import com.dreamcc.framework.beans.BeansException;
import com.dreamcc.framework.beans.factory.AutowireCapableBeanFactory;
import com.dreamcc.framework.beans.factory.ListableBeanFactory;

/**
 * @author cloud-cc
 * @ClassName ConfigurableListableBeanFactory
 * @Description 分析和修改Bean以及预先实例化的操作接口
 * @date 2021/9/9 09:15
 * @Version 1.0
 */
public interface ConfigurableListableBeanFactory extends ConfigurableBeanFactory, ListableBeanFactory, AutowireCapableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

}
