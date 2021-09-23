package com.dreamcc.framework.bean;

import com.dreamcc.framework.beans.BeansException;
import com.dreamcc.framework.beans.factory.BeanClassLoaderAware;
import com.dreamcc.framework.beans.factory.BeanFactory;
import com.dreamcc.framework.beans.factory.BeanFactoryAware;
import com.dreamcc.framework.beans.factory.BeanNameAware;
import com.dreamcc.framework.context.ApplicationContext;
import com.dreamcc.framework.context.ApplicationContextAware;

/**
 * @author cloud-cc
 * @ClassName UserService
 * @Description userService
 * @date 2021/9/3 14:47
 * @Version 1.0
 */
public class UserService implements BeanNameAware, BeanClassLoaderAware, ApplicationContextAware, BeanFactoryAware {

    private ApplicationContext applicationContext;
    private BeanFactory beanFactory;

    private String uId;
    private String company;
    private String location;
    private UserDAO userDAO;

    public void queryUserInfo() {
        System.out.println("查询用户信息id = " + userDAO.queryUserName(uId) + "," + company + "," + location);
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


    @Override
    public void setBeanClassLoader(ClassLoader classLoader) throws BeansException {
        System.out.println("ClassLoader : " + classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
        System.out.println("beanFactory = " + beanFactory);
    }

    @Override
    public void setBeanName(String name) throws BeansException {
        System.out.println("name = " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }
}
