package com.dreamcc.framework.beans.factory;

import com.dreamcc.framework.beans.BeansException;

/**
 * @author cloud-cc
 * @ClassName BeanNameAware
 * @Description 实现，感知所属BeanName
 * @date 2021/9/23 14:03
 * @Version 1.0
 */
public interface BeanNameAware extends Aware{

    void setBeanName(String name) throws BeansException;
}
