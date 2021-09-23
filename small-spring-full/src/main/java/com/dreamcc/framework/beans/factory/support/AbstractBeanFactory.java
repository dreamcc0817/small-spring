package com.dreamcc.framework.beans.factory.support;


import com.dreamcc.framework.beans.BeansException;
import com.dreamcc.framework.beans.factory.config.BeanDefinition;
import com.dreamcc.framework.beans.factory.config.BeanPostProcessor;
import com.dreamcc.framework.beans.factory.config.ConfigurableBeanFactory;
import com.dreamcc.framework.util.ClassUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cloud-cc
 * @ClassName AbstractBeanFactory
 * @Description AbstractBeanFactory抽象类
 * @date 2021/9/3 14:27
 * @Version 1.0
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements ConfigurableBeanFactory {

    private final List<BeanPostProcessor> beanPostProcessors = new ArrayList<BeanPostProcessor>();

    /** ClassLoader to resolve bean class names with, if necessary */
    private ClassLoader beanClassLoader = ClassUtils.getDefaultClassLoader();
    @Override
    public Object getBean(String beanName) {
        return doGetBean(beanName, null);
    }

    @Override
    public Object getBean(String beanName, Object... args) {
        return doGetBean(beanName, args);
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
        return (T) getBean(name);
    }

    protected <T> T doGetBean(final String name, final Object[] args) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return (T) bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) createBean(name, beanDefinition, args);
    }

    public abstract BeanDefinition getBeanDefinition(String beanName);

    public abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args);

    @Override
    public void addBeanPostProcessor(BeanPostProcessor beanPostProcessor) {
        this.beanPostProcessors.remove(beanPostProcessor);
        this.beanPostProcessors.add(beanPostProcessor);
    }

    /**
     * 在factory创建bean之前，返回一个BeanPostProcessors列表
     *
     * @return
     */
    public List<BeanPostProcessor> getBeanPostProcessors() {
        return this.beanPostProcessors;
    }

    public ClassLoader getBeanClassLoader() {
        return this.beanClassLoader;
    }
}
