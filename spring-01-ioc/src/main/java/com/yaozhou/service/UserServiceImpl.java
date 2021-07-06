package com.yaozhou.service;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.yaozhou.dao.UserDao;
import com.yaozhou.dao.UserDaoImpl;

/**
 * Created by WXHang on HANG at 2021/7/6 23:16
 * @author HANG
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    //new UserServiceImpl 时，userDao就被实例化
    public UserServiceImpl(){
        userDao = new UserDaoImpl();
    }

    //利用set进行动态值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    private UserDao userDao2 = new UserDaoImpl();

    public void getUser() {
        userDao.getUser();
    }
}