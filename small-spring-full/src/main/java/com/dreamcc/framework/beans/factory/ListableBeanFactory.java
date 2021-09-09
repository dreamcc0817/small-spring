package com.dreamcc.framework.beans.factory;

import com.dreamcc.framework.beans.BeansException;

import java.util.Map;

/**
 * @author cloud-cc
 * @ClassName ListableBeanFactory
 * @Description 扩展BeanFactory接口
 * @date 2021/9/9 08:31
 * @Version 1.0
 */
public interface ListableBeanFactory extends BeanFactory{

    /**
     * 按照类型返回 Bean 实例
     * @param type
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * Return the names of all beans defined in this registry.
     *
     * 返回注册表中所有的Bean名称
     */
    String[] getBeanDefinitionNames();
}
