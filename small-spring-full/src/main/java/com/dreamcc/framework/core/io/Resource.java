package com.dreamcc.framework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author cloud-cc
 * @ClassName Resource
 * @Description 获取资源接口
 * @date 2021/9/8 09:03
 * @Version 1.0
 */
public interface Resource {

    /**
     * 获取配置文件流
     *
     * @return 文件流
     */
    InputStream getInputStream() throws IOException;
}
