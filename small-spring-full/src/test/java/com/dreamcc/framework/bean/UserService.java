package com.dreamcc.framework.bean;

import com.dreamcc.framework.dao.UserDAO;

/**
 * @author cloud-cc
 * @ClassName UserService
 * @Description userService
 * @date 2021/9/3 14:47
 * @Version 1.0
 */
public class UserService {
    private String uId;
    private UserDAO userDAO;

    public void queryUserInfo(){
        System.out.println("查询用户信息id = " + userDAO.queryUserName(uId));
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
