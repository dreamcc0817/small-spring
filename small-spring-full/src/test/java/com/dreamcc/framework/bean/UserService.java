package com.dreamcc.framework.bean;

/**
 * @author cloud-cc
 * @ClassName UserService
 * @Description TODO
 * @date 2021/9/3 14:47
 * @Version 1.0
 */
public class UserService {
    private String name;

    public UserService(String name) {
        this.name = name;
    }

    public void queryUserInfo(){
        System.out.println("查询用户信息" + name);
    }

    @Override
    public String toString() {
        return "UserService{" +
                "name='" + name + '\'' +
                '}';
    }
}
