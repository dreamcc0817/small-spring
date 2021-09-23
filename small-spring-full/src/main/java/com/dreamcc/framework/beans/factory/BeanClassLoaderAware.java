package com.dreamcc.framework.beans.factory;

import com.dreamcc.framework.beans.BeansException;

/**
 * @author cloud-cc
 * @ClassName BeanClassLoader
 * @Description 实现此接口，既能感知到所属的ClassLoader
 * @date 2021/9/23 13:54
 * @Version 1.0
 */
public interface BeanClassLoaderAware extends Aware{

    void setBeanClassLoader(ClassLoader classLoader) throws BeansException;
}
