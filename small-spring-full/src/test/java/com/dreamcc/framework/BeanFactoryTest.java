package com.dreamcc.framework;


import com.dreamcc.framework.bean.UserService;
import com.dreamcc.framework.beans.factory.PropertyValue;
import com.dreamcc.framework.beans.factory.PropertyValues;
import com.dreamcc.framework.beans.factory.config.BeanDefinition;
import com.dreamcc.framework.beans.factory.config.BeanReference;
import com.dreamcc.framework.beans.factory.support.DefaultListableBeanFactory;
import com.dreamcc.framework.bean.UserDAO;
import org.junit.Test;

import java.util.Optional;

/**
 * @author cloud-cc
 * @ClassName BeanFactoryTest
 * @Description BeanFactoryTest
 * @date 2021/9/3 11:52
 * @Version 1.0
 */
public class BeanFactoryTest {

    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserDAO.class);
        beanFactory.registerBeanDefinition("userDAO", beanDefinition);

        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId","10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDAO",new BeanReference("userDAO")));

        BeanDefinition beanDefinition1 = new BeanDefinition(UserService.class,propertyValues);
        beanFactory.registerBeanDefinition("userService",beanDefinition1);

        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        // 3.第一次获取 bean
//        UserService userService = (UserService) beanFactory.getBean("userService");
//        userService.queryUserInfo();

//        // 4.第二次获取 bean from Singleton
//        UserService userServiceSingleton = (UserService) beanFactory.getBean("userService","sea");
//        userServiceSingleton.queryUserInfo();
    }

    @Test
    public void hello(){
        String beanName = null;
        String resutl = Optional.ofNullable(beanName).orElse("");
        System.out.println("resutl = " + resutl);
    }
}