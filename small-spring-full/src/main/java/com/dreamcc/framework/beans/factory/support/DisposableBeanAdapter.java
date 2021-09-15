package com.dreamcc.framework.beans.factory.support;

import cn.hutool.core.util.StrUtil;
import com.dreamcc.framework.beans.BeansException;
import com.dreamcc.framework.beans.factory.DisposableBean;
import com.dreamcc.framework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Method;

/**
 * @author cloud-cc
 * @ClassName DisposableBeanAdapter
 * @Description 定义销毁方法的适配器
 * @date 2021/9/15 11:09
 * @Version 1.0
 */
public class DisposableBeanAdapter implements DisposableBean {

    private final Object bean;

    private final String beanName;

    private final String destroyMethodName;

    public DisposableBeanAdapter(Object bean, String beanName, BeanDefinition beanDefinition) {
        this.bean = bean;
        this.beanName = beanName;
        this.destroyMethodName = beanDefinition.getDestroyMethodName();
    }

    @Override
    public void destroy() throws Exception {
        if (bean instanceof DisposableBean) {
            ((DisposableBean) bean).destroy();
        }

        if (StrUtil.isNotEmpty(destroyMethodName) && !(bean instanceof DisposableBean && "destroy".equals(this.destroyMethodName)) ) {
            Method destroyMethod = bean.getClass().getMethod(destroyMethodName);
            if(null == destroyMethod){
                throw new BeansException("Could't find a destroy method named '" + destroyMethodName + "' on bean with name" + beanName +"'");
            }
            destroyMethod.invoke(bean);
        }

    }
}
