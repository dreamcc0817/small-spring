package com.dreamcc.framework;

import com.dreamcc.framework.bean.UserService;
import com.dreamcc.framework.beans.factory.support.DefaultListableBeanFactory;
import com.dreamcc.framework.beans.factory.xml.XmlBeanDefinitionReader;
import com.dreamcc.framework.common.MyBeanFactoryPostProcessor;
import com.dreamcc.framework.common.MyBeanPostProcessor;
import com.dreamcc.framework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

/**
 * @author cloud-cc
 * @ClassName ApplicationContextTest
 * @Description 上下文测试
 * @date 2021/9/11 13:51
 * @Version 1.0
 */
public class ApplicationContextTest {

    @Test
    public void test_BeanFactoryPostProcessorAndBeanPostProcessor(){
        //1.初始化BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //2.读取配置文件
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");
        //3.BeanDefinition 加载完成 & Bean实例化之前，修改BeanDefinition的属性值
        MyBeanFactoryPostProcessor beanFactoryPostProcessor = new MyBeanFactoryPostProcessor();
        beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);
        //4.Bean实例化之后修改Bean属性信息
        MyBeanPostProcessor myBeanPostProcessor = new MyBeanPostProcessor();
        beanFactory.addBeanPostProcessor(myBeanPostProcessor);
        //5.获取Bean对象调用方法
        UserService userService = beanFactory.getBean("userService",UserService.class);
        userService.queryUserInfo();
    }

    @Test
    public void test_xml() {
        // 1.初始化 BeanFactory
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");

        // 2. 获取Bean对象调用方法
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.queryUserInfo();

    }
}
