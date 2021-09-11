package com.dreamcc.framework.context.support;

import com.dreamcc.framework.beans.BeansException;
import com.dreamcc.framework.beans.factory.config.ConfigurableListableBeanFactory;
import com.dreamcc.framework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author cloud-cc
 * @ClassName AbstractRefreshableApplicationContext
 * @Description 获取Bean工厂，加载资源
 * @date 2021/9/11 08:36
 * @Version 1.0
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext{

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory =  beanFactory;
    }

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }
}
