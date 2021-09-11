package com.dreamcc.framework.context.support;

import com.dreamcc.framework.beans.factory.support.DefaultListableBeanFactory;
import com.dreamcc.framework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author cloud-cc
 * @ClassName AbstractXmlApplicationContext
 * @Description 上下文中对配置信息的加载
 * @date 2021/9/11 08:56
 * @Version 1.0
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext{

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory,this);
        String[] configLocations = getConfigLocations();
        if(configLocations != null){
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();
}
