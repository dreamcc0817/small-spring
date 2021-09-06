package com.dreamcc.framework;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author cloud-cc
 * @ClassName SimpleInstantiationStrategy
 * @Description JDK实例化
 * @date 2021/9/6 11:46
 * @Version 1.0
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy {

    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object[] args) {
        Class clazz = beanDefinition.getBeanClass();
        try {
            if(constructor != null){
                return clazz.getDeclaredConstructor(constructor.getParameterTypes()).newInstance(args);
            }else {
                return clazz.getDeclaredConstructor().newInstance();
            }

        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
}
