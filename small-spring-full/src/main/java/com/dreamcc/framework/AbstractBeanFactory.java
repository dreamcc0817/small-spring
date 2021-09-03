package com.dreamcc.framework;


/**
 * @author cloud-cc
 * @ClassName AbstractBeanFactory
 * @Description TODO
 * @date 2021/9/3 14:27
 * @Version 1.0
 */
public abstract class AbstractBeanFactory implements BeanFactory {

    @Override
    public Object getBean(String beanName) {
        System.out.println("AbstractBeanFactory getBean");
        BeanDefinition bean = getBeanDefinition(beanName);
        return createBean(beanName,bean);
    }

    public abstract BeanDefinition getBeanDefinition(String beanName);

    public abstract Object createBean(String beanName, BeanDefinition beanDefinition);
}
