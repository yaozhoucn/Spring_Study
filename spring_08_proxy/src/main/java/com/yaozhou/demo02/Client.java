package com.yaozhou.demo02;

import org.junit.Test;


/**
 * Created by WXHang on HANG at 2021/7/11 13:02
 */
public class Client {
    @Test
    public void UserClient(){
        UserService userService = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserService(userService);
        userServiceProxy.query();

    }
}