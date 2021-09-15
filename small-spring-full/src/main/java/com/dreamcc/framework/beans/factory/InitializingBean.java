package com.dreamcc.framework.beans.factory;

/**
 * @author cloud-cc
 * @ClassName InitializingBean
 * @Description 初始化Beans
 * @date 2021/9/15 09:00
 * @Version 1.0
 */
public interface InitializingBean {

    /**
     * Bean 处理了属性填充后调用
     *
     * @throws Exception
     */
    void afterPropertiesSet() throws Exception;
}
