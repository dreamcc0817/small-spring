package com.dreamcc.framework;

/**
 * @author cloud-cc
 * @ClassName BeanDefinition
 * @Description TODO
 * @date 2021/9/3 12:05
 * @Version 1.0
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
