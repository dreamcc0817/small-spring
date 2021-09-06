package com.dreamcc.framework;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 * @author cloud-cc
 * @ClassName AbstractAutowireCapableBeanFactory
 * @Description 创建Bean
 * @date 2021/9/3 14:35
 * @Version 1.0
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    private InstantiationStrategy instantiationStrategy = new CglibSubclassingInstantiationStrategy();

    @Override
    public Object createBean(String beanName, BeanDefinition beanDefinition,Object... args) {
        Object bean = null;
        try {
            bean = createBeanInstance(beanDefinition,beanName,args);
        } catch (Exception e) {
            e.printStackTrace();
        }

        addSingleton(beanName, bean);
        return bean;
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition, String beanName, Object[] args) {
        Class<?> clazz = beanDefinition.getBeanClass();
        Constructor<?>[] declaredConstructor = clazz.getDeclaredConstructors();
        Constructor constructor = Arrays.stream(declaredConstructor)
                .filter(ctor -> null != args && ctor.getParameterTypes().length == args.length)
                .findFirst().orElse(null);
        return getInstantiationStrategy().instantiate(beanDefinition,beanName,constructor,args);
    }

    public InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }

    public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy) {
        this.instantiationStrategy = instantiationStrategy;
    }
}
