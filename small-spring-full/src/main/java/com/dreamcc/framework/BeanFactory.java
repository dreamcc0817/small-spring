package com.dreamcc.framework;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author cloud-cc
 * @ClassName BeanFactory
 * @Description
 * @date 2021/9/3 11:45
 * @Version 1.0
 */
public class BeanFactory {

    public Map<String,BeanDefinition> beanMap = new ConcurrentHashMap<>();

    /**
     * 获取Bean
     * @param beanName bean名称
     * @return bean
     */
    public Object getBean(String beanName){
        return beanMap.get(beanName).getBean();
    }


    public void registerBean(String beanName,BeanDefinition bean){
        beanMap.put(beanName,bean);
    }


}
