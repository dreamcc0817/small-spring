package com.dreamcc.framework.beans.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cloud-cc
 * @ClassName PropertyValues
 * @Description 属性列表
 * @date 2021/9/6 15:05
 * @Version 1.0
 */
public class PropertyValues {

    private List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue propertyValue){
        this.propertyValueList.add(propertyValue);
    }

    public PropertyValue[] getPropertyValues(){
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    public PropertyValue getPropertyValue(String propertyName){
        return this.propertyValueList.stream()
                .filter(propertyValue -> propertyValue.getName().equals(propertyName))
                .findFirst()
                .orElse(null);
    }

}
