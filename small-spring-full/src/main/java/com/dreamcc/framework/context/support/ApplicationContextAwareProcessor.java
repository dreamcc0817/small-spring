package com.dreamcc.framework.context.support;

import com.dreamcc.framework.beans.BeansException;
import com.dreamcc.framework.beans.factory.config.BeanPostProcessor;
import com.dreamcc.framework.context.ApplicationContext;
import com.dreamcc.framework.context.ApplicationContextAware;

/**
 * @author cloud-cc
 * @ClassName ApplicationContextAwareProcessor
 * @Description 包装处理器
 * @date 2021/9/23 14:27
 * @Version 1.0
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof ApplicationContextAware){
            ((ApplicationContextAware)bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
