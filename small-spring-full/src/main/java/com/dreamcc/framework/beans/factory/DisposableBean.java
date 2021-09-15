package com.dreamcc.framework.beans.factory;

/**
 * @author cloud-cc
 * @ClassName DisposableBean
 * @Description Bean销毁方法
 * @date 2021/9/15 09:02
 * @Version 1.0
 */
public interface DisposableBean {

    /**
     * 销毁Bean方法
     *
     * @throws Exception 异常
     */
    void destroy() throws Exception;
}
