package com.dreamcc.framework.core.io;

/**
 * @author cloud-cc
 * @ClassName ResourceLoader
 * @Description 包装资源加载器
 * @date 2021/9/8 09:04
 * @Version 1.0
 */
public interface ResourceLoader {

    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
