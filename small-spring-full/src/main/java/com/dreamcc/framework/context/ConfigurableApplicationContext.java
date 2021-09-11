package com.dreamcc.framework.context;

import com.dreamcc.framework.beans.BeansException;

/**
 * @author cloud-cc
 * @ClassName ConfigurableApplicationContext
 * @Description 扩展Application
 * @date 2021/9/10 17:43
 * @Version 1.0
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;
}
