package com.dreamcc.framework.core.io;

import cn.hutool.core.lang.Assert;
import com.dreamcc.framework.util.ClassUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;

/**
 * @author cloud-cc
 * @ClassName ClassPathResource
 * @Description 项目本地文件
 * @date 2021/9/8 09:07
 * @Version 1.0
 */
public class ClassPathResource implements Resource{

    private final String path;

    private ClassLoader classLoader;

    public ClassPathResource(String path) {
       this(path,null);
    }

    public ClassPathResource(String path, ClassLoader classLoader) {
        Assert.notNull(path,"Path must not be null");
        this.path = path;
        this.classLoader = classLoader != null ? classLoader : ClassUtils.getDefaultClassLoader();
    }

    @Override
    public InputStream getInputStream() throws IOException {
        InputStream inputStream = classLoader.getResourceAsStream(path);
        return Optional.ofNullable(inputStream)
                .orElseThrow(FileNotFoundException::new);
    }
}
