package com.dreamcc.framework.beans.factory.support;

import com.dreamcc.framework.beans.factory.config.BeanDefinition;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

import java.lang.reflect.Constructor;

/**
 * @author cloud-cc
 * @ClassName CglibSubclassingInstantiationStrategy
 * @Description cglib实例化类
 * @date 2021/9/6 13:33
 * @Version 1.0
 */
public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy{

    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        if(constructor == null){
            return enhancer.create();
        }
        return enhancer.create(constructor.getParameterTypes(),args);
    }
}
