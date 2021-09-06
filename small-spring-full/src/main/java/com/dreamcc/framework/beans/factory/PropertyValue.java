package com.dreamcc.framework.beans.factory;

/**
 * @author cloud-cc
 * @ClassName PropertyValue
 * @Description 类属性
 * @date 2021/9/6 15:03
 * @Version 1.0
 */
public class PropertyValue {

    private String name;
    private Object value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }
}
