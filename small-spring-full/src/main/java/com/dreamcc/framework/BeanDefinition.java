package com.dreamcc.framework;

/**
 * @author cloud-cc
 * @ClassName BeanDefinition
 * @Description TODO
 * @date 2021/9/3 12:05
 * @Version 1.0
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

}
