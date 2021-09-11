package com.dreamcc.framework.beans.factory.support;

import cn.hutool.core.bean.BeanUtil;
import com.dreamcc.framework.beans.BeansException;
import com.dreamcc.framework.beans.factory.AutowireCapableBeanFactory;
import com.dreamcc.framework.beans.factory.PropertyValue;
import com.dreamcc.framework.beans.factory.PropertyValues;
import com.dreamcc.framework.beans.factory.config.BeanDefinition;
import com.dreamcc.framework.beans.factory.config.BeanPostProcessor;
import com.dreamcc.framework.beans.factory.config.BeanReference;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 * @author cloud-cc
 * @ClassName AbstractAutowireCapableBeanFactory
 * @Description 创建Bean
 * @date 2021/9/3 14:35
 * @Version 1.0
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory implements AutowireCapableBeanFactory {

    private InstantiationStrategy instantiationStrategy = new CglibSubclassingInstantiationStrategy();

    @Override
    public Object createBean(String beanName, BeanDefinition beanDefinition, Object... args) {
        Object bean = null;
        try {
            bean = createBeanInstance(beanDefinition, beanName, args);
            //填充Bean属性
            applyPropertyValues(beanName, bean, beanDefinition);
            bean = initializeBean(beanName,bean,beanDefinition);
        } catch (Exception e) {
            throw new BeansException("Instantiation of bean failed",e);
        }

        addSingleton(beanName, bean);
        return bean;
    }

    /**
     * 给Bean属性赋值
     *
     * @param beanName       beanName名称
     * @param bean           bean
     * @param beanDefinition class 类属性
     */
    protected void applyPropertyValues(String beanName, Object bean, BeanDefinition beanDefinition) {
        try {
            PropertyValues propertyValues = beanDefinition.getPropertyValues();
            for (PropertyValue propertyValue : propertyValues.getPropertyValues()) {
                String name = propertyValue.getName();
                Object value = propertyValue.getValue();

                if(value instanceof BeanReference){
                    BeanReference beanReference = (BeanReference) value;
                    value = getBean(beanReference.getBeanName());
                }

                BeanUtil.setFieldValue(bean,name,value);
            }
        } catch (Exception e) {
            throw new BeansException("Error setting property values：" + beanName);
        }
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition, String beanName, Object[] args) {
        Class<?> clazz = beanDefinition.getBeanClass();
        Constructor<?>[] declaredConstructor = clazz.getDeclaredConstructors();
        Constructor constructor = Arrays.stream(declaredConstructor)
                .filter(ctor -> null != args && ctor.getParameterTypes().length == args.length)
                .findFirst().orElse(null);
        return getInstantiationStrategy().instantiate(beanDefinition, beanName, constructor, args);
    }

    public InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }

    public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy) {
        this.instantiationStrategy = instantiationStrategy;
    }

    private Object initializeBean(String beanName, Object bean, BeanDefinition beanDefinition) {
        //1.执行BeanPostProcessor Before处理
        Object wrappedBean = applyBeanPostProcessorsBeforeInitialization(bean,beanName);
        //2.待完成内容：invokeInitMethods(beanName,wrappenBean,beanDefinition);
        invokeInitMethods(beanName, bean, beanDefinition);
        //3.执行BeanPostProcessor After处理
        wrappedBean = applyBeanPostProcessorsAfterInitialization(bean,beanName);
        return wrappedBean;
    }

    private void invokeInitMethods(String beanName, Object wrappedBean, BeanDefinition beanDefinition) {

    }

    @Override
    public Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName) throws BeansException {
        Object result = existingBean;
        for (BeanPostProcessor processor : getBeanPostProcessors()) {
            Object current = processor.postProcessBeforeInitialization(result, beanName);
            if (null == current) {
                return result;
            }
            result = current;
        }
        return result;
    }

    @Override
    public Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException {
        Object result = existingBean;
        for (BeanPostProcessor processor : getBeanPostProcessors()) {
            Object current = processor.postProcessAfterInitialization(result, beanName);
            if (null == current) {
                return result;
            }
            result = current;
        }
        return result;
    }
}
