package com.dreamcc.framework;

import cn.hutool.core.io.IoUtil;
import com.dreamcc.framework.bean.UserService;
import com.dreamcc.framework.beans.factory.support.DefaultListableBeanFactory;
import com.dreamcc.framework.beans.factory.xml.XmlBeanDefinitionReader;
import com.dreamcc.framework.core.io.DefaultResourceLoader;
import com.dreamcc.framework.core.io.Resource;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author cloud-cc
 * @ClassName RegistryTest
 * @Description RegistryTest
 * @date 2021/9/8 15:34
 * @Version 1.0
 */
public class RegistryTest {

    private DefaultResourceLoader resourceLoader;

    @Before
    public void init(){
        resourceLoader = new DefaultResourceLoader();
    }

    @Test
    public void testClasspath() throws IOException{
        Resource resource = resourceLoader.getResource("classpath:important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println("content = " + content);
    }


    @Test
    public void testFile() throws IOException{
        Resource resource = resourceLoader.getResource("src/test/resources/important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println("content = " + content);
    }


   @Test
   public void testXML(){
       DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

       XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
       reader.loadBeanDefinitions("classpath:spring.xml");

       UserService userService = beanFactory.getBean("userService",UserService.class);

       userService.queryUserInfo();

   }
}
