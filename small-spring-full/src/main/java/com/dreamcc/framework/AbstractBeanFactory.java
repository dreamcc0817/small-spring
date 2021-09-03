package com.dreamcc.framework;


/**
 * @author cloud-cc
 * @ClassName AbstractBeanFactory
 * @Description AbstractBeanFactory抽象类
 * @date 2021/9/3 14:27
 * @Version 1.0
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String beanName) {
        Object bean = getSingleton(beanName);
        if (bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName, beanDefinition);
    }

    public abstract BeanDefinition getBeanDefinition(String beanName);

    public abstract Object createBean(String beanName, BeanDefinition beanDefinition);
}
