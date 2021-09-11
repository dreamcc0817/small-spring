package com.dreamcc.framework.common;

import com.dreamcc.framework.bean.UserService;
import com.dreamcc.framework.beans.BeansException;
import com.dreamcc.framework.beans.factory.config.BeanPostProcessor;

/**
 * @author cloud-cc
 * @ClassName MyBeanPostProcessor
 * @Description BeanPostProcessor实现类
 * @date 2021/9/11 13:43
 * @Version 1.0
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
       if("userService".equals(beanName)){
           UserService userService = (UserService) bean;
           userService.setLocation("改为：北京");
       }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        return bean;
    }
}
