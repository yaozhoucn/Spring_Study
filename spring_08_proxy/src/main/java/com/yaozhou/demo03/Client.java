package com.yaozhou.demo03;

import org.junit.Test;

/**
 * Created by WXHang on HANG at 2021/7/11 14:02
 */
public class Client {
    @Test
    public void RentHouse(){
        //真实角色
        Host host = new Host();
        //代理的实例调用处理程序
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        //将真实角色放进去
        proxyInvocationHandler.setRent(host);
        //动态生成对应的代理类
        Rent proxy = (Rent) proxyInvocationHandler.getProxy();
        proxy.rent();

    }
}