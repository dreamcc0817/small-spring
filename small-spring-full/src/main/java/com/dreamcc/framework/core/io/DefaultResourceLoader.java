package com.dreamcc.framework.core.io;

import cn.hutool.core.lang.Assert;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author cloud-cc
 * @ClassName DefaultResourceLoader
 * @Description 默认配置文件加载器
 * @date 2021/9/8 09:09
 * @Version 1.0
 */
public class DefaultResourceLoader implements ResourceLoader{

    @Override
    public Resource getResource(String location) {
        Assert.notNull(location, "Location must not be null");
        if(location.startsWith(CLASSPATH_URL_PREFIX)){
            return new ClassPathResource(location.substring(CLASSPATH_URL_PREFIX.length()));
        }else {
            URL url = null;
            try {
                url = new URL(location);
            } catch (MalformedURLException e) {
                return new FileSystemResource(location);
            }
            return new UrlResource(url);
        }
    }
}
