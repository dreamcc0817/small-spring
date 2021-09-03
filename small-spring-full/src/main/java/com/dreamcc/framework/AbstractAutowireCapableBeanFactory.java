package com.dreamcc.framework;

/**
 * @author cloud-cc
 * @ClassName AbstractAutowireCapableBeanFactory
 * @Description TODO
 * @date 2021/9/3 14:35
 * @Version 1.0
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{

    @Override
    public Object createBean(String beanName, BeanDefinition beanDefinition) {
        Object bean = null;
        try {
            bean = beanDefinition.getBean().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return bean;
    }
}
