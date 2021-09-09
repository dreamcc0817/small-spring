package com.dreamcc.framework.beans.factory.support;

import com.dreamcc.framework.core.io.DefaultResourceLoader;
import com.dreamcc.framework.core.io.ResourceLoader;

/**
 * @author cloud-cc
 * @ClassName AbstractBeanDefinitionReader
 * @Description BeanDefinitionReader实现类
 * @date 2021/9/8 11:50
 * @Version 1.0
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader{

    private final BeanDefinitionRegistry beanDefinitionRegistry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry){
        this(registry,new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry beanDefinitionRegistry, ResourceLoader resourceLoader) {
        this.beanDefinitionRegistry = beanDefinitionRegistry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return beanDefinitionRegistry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
