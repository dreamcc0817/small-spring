package com.dreamcc.framework.beans.factory;

import com.dreamcc.framework.beans.BeansException;

/**
 * @author cloud-cc
 * @ClassName BeanFactoryAware
 * @Description 感知到所属的BeanFactory
 * @date 2021/9/23 13:51
 * @Version 1.0
 */
public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
