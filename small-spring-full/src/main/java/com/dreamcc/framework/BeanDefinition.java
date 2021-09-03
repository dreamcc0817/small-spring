package com.dreamcc.framework;

/**
 * @author cloud-cc
 * @ClassName BeanDefinition
 * @Description TODO
 * @date 2021/9/3 12:05
 * @Version 1.0
 */
public class BeanDefinition {

    private Class bean;

    public BeanDefinition(Class bean) {
        this.bean = bean;
    }

    public Class getBean() {
        return bean;
    }

    public void setBean(Class bean) {
        this.bean = bean;
    }
}
