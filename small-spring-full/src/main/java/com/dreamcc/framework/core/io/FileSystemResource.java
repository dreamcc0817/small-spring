package com.dreamcc.framework.core.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author cloud-cc
 * @ClassName FileSystemResource
 * @Description 获取文件类型配置文件
 * @date 2021/9/8 09:05
 * @Version 1.0
 */
public class FileSystemResource implements Resource{

    /**
     * 文件
     */
    private final File file;
    /**
     * 文件地址
     */
    private final String path;

    public FileSystemResource(File file) {
        this.file = file;
        this.path = file.getPath();
    }

    public FileSystemResource(String path) {
        this.file = new File(path);
        this.path = path;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new FileInputStream(this.file);
    }

    public final String getPath(){
        return this.path;
    }
}
