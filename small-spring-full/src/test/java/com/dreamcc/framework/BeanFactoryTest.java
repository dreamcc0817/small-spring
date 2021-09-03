package com.dreamcc.framework;


import com.dreamcc.framework.bean.UserService;
import org.junit.Test;

/**
 * @author cloud-cc
 * @ClassName BeanFactoryTest
 * @Description TODO
 * @date 2021/9/3 11:52
 * @Version 1.0
 */
public class BeanFactoryTest {

    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        // 4.第二次获取 bean from Singleton
        // UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        //  userService_singleton.queryUserInfo();
    }

}