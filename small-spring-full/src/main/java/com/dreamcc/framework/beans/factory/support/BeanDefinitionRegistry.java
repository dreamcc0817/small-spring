package com.dreamcc.framework.beans.factory.support;

import com.dreamcc.framework.beans.BeansException;
import com.dreamcc.framework.beans.factory.config.BeanDefinition;

/**
 * @author cloud-cc
 * @ClassName InstantiationStrategy
 * @Description 实例化测试接口
 * @date 2021/9/6 11:41
 * @Version 1.0
 */
public interface BeanDefinitionRegistry {
    /**
     * 向注册表中注册BeanDefinition
     *
     * @param beanName       beanName
     * @param beanDefinition beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * 使用Bean名称查询BeanDefinition
     *
     * @param beanName beanName
     * @return beanDefinition
     * @throws BeansException beanException
     */
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 判断是否包含指定名称的BeanDefinition
     *
     * @param beanName beanName
     * @return boolean
     */
    boolean containsBeanDefinition(String beanName);

    /**
     * Return the names of all beans defined in this registry.
     * <p>
     * 返回注册表中所有的Bean名称
     */
    String[] getBeanDefinitionNames();

}
