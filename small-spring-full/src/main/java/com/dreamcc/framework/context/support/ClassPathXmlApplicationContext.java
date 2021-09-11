package com.dreamcc.framework.context.support;

/**
 * @author cloud-cc
 * @ClassName ClassPathXmlApplicationContext
 * @Description 应用上下文实现类
 * @date 2021/9/11 09:13
 * @Version 1.0
 */
public class ClassPathXmlApplicationContext extends AbstractXmlApplicationContext {


    private String[] configLocations;


    public ClassPathXmlApplicationContext() {
    }

    public ClassPathXmlApplicationContext(String configLocation) {
        this(new String[]{configLocation});
    }

    public ClassPathXmlApplicationContext(String[] configLocations) {
        this.configLocations = configLocations;
        refresh();
    }

    @Override
    protected String[] getConfigLocations() {
        return configLocations;
    }
}
