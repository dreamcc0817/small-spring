package com.dreamcc.framework.beans.factory.config;

/**
 * @author cloud-cc
 * @ClassName BeanReference
 * @Description Bean的引用
 * @date 2021/9/6 15:38
 * @Version 1.0
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
