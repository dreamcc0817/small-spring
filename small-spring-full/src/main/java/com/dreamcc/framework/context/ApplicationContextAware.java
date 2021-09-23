package com.dreamcc.framework.context;

import com.dreamcc.framework.beans.BeansException;
import com.dreamcc.framework.beans.factory.Aware;

/**
 * @author cloud-cc
 * @ClassName ApplicationContextAware
 * @Description 实现，感知所属ApplicationContext
 * @date 2021/9/23 14:24
 * @Version 1.0
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
