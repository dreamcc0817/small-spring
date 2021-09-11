package com.dreamcc.framework.common;

import com.dreamcc.framework.beans.BeansException;
import com.dreamcc.framework.beans.factory.PropertyValue;
import com.dreamcc.framework.beans.factory.PropertyValues;
import com.dreamcc.framework.beans.factory.config.BeanDefinition;
import com.dreamcc.framework.beans.factory.config.BeanFactoryPostProcessor;
import com.dreamcc.framework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author cloud-cc
 * @ClassName MyBeanFactoryPostProcessor
 * @Description 对Bean属性扩展
 * @date 2021/9/11 11:45
 * @Version 1.0
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition definition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = definition.getPropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("company","改为：字节跳动"));
    }
}
