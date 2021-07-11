package com.yaozhou.demo04;

import com.yaozhou.demo02.UserService;
import com.yaozhou.demo02.UserServiceImpl;
import org.junit.Test;

import java.io.Serializable;

/**
 * Created by WXHang on HANG at 2021/7/11 14:26
 * @author HANG
 */
public class Client {
    @Test
    public void ClientProxy(){
        //真实的角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色
        ProxyInvocationHandlerUtil proxyInvocationHandlerUtil = new ProxyInvocationHandlerUtil();
        //设置要代理的对象
        proxyInvocationHandlerUtil.setTarget(userService);
        //动态生成代理类
        UserService proxy = (UserService) proxyInvocationHandlerUtil.getProxy();
        proxy.query();


    }
}