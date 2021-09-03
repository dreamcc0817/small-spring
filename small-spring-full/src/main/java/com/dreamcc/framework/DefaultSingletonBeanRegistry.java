package com.dreamcc.framework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author cloud-cc
 * @ClassName DefaultSingletonBeanRegistry
 * @Description 单例Bean核心实现类
 * @date 2021/9/3 15:45
 * @Version 1.0
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {


    private Map<String, Object> singletonObjects = new ConcurrentHashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        System.out.println("获取单例beanName = " + beanName);
        return singletonObjects.get(beanName);
    }

    public void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }
}
