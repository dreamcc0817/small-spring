package com.dreamcc.framework.beans.factory;

import com.dreamcc.framework.beans.BeansException;

/**
 * @author cloud-cc
 * @ClassName AutowireCapableBeanFactory
 * @Description 自动化处理Bean工厂配置的接口
 * @date 2021/9/9 08:33
 * @Version 1.0
 */
public interface AutowireCapableBeanFactory extends BeanFactory{

    /**
     * 执行 BeanPostProcessors 接口实现类的 postProcessBeforeInitialization 方法
     *
     * @param existingBean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName) throws BeansException;

    /**
     * 执行 BeanPostProcessors 接口实现类的 postProcessorsAfterInitialization 方法
     *
     * @param existingBean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException;

}
