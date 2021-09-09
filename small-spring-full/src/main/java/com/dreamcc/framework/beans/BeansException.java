package com.dreamcc.framework.beans;

/**
 * @author cloud-cc
 * @ClassName BeansException
 * @Description Bean异常信息
 * @date 2021/9/6 14:58
 * @Version 1.0
 */
public class BeansException extends RuntimeException {
    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public BeansException() {
        
    }
}
