package com.dreamcc.framework.util;

import java.util.Optional;

/**
 * @author cloud-cc
 * @ClassName ClassUtils
 * @Description classUtils工具类
 * @date 2021/9/8 09:39
 * @Version 1.0
 */
public class ClassUtils {

    public static ClassLoader getDefaultClassLoader(){
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        return Optional.ofNullable(classLoader).orElse(ClassUtils.class.getClassLoader());
    }
}
