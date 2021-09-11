package com.dreamcc.framework.bean;

/**
 * @author cloud-cc
 * @ClassName UserService
 * @Description userService
 * @date 2021/9/3 14:47
 * @Version 1.0
 */
public class UserService {
    private String uId;
    private String company;
    private String location;
    private UserDAO userDAO;

    public void queryUserInfo(){
        System.out.println("查询用户信息id = " + userDAO.queryUserName(uId)+ ","  + company + "," + location);
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
