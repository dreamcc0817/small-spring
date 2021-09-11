package com.dreamcc.framework.beans.factory.support;

import com.dreamcc.framework.beans.BeansException;
import com.dreamcc.framework.core.io.Resource;
import com.dreamcc.framework.core.io.ResourceLoader;

/**
 * @author cloud-cc
 * @ClassName BeanDefinitionReader
 * @Description 对资源的具体使用，将配置信息注册到Spring容器中
 * @date 2021/9/8 11:28
 * @Version 1.0
 */
public interface BeanDefinitionReader {

    /**
     * 获取Bean注册
     *
     * @return
     */
    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;
}
