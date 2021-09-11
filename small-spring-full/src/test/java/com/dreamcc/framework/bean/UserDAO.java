package com.dreamcc.framework.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cloud-cc
 * @ClassName UserDAO
 * @Description
 * @date 2021/9/6 16:10
 * @Version 1.0
 */
public class UserDAO {
    private static Map<String,String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001","aaaa");
        hashMap.put("10002","bbbb");
        hashMap.put("10003","cccc");
    }

    public String queryUserName(String uId){
        return hashMap.get(uId);
    }
}
