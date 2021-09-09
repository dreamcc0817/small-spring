package com.dreamcc.framework.beans.factory;

/**
 * @author cloud-cc
 * @ClassName AutowireCapableBeanFactory
 * @Description 自动化处理Bean工厂配置的接口
 * @date 2021/9/9 08:33
 * @Version 1.0
 */
public interface AutowireCapableBeanFactory extends BeanFactory{

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";
}
