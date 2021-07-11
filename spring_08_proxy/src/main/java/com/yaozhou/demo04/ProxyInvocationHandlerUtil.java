package com.yaozhou.demo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by WXHang on HANG at 2021/7/11 14:22
 */
public class ProxyInvocationHandlerUtil implements InvocationHandler {
    //被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }
    //获取代理实例
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    //执行代理接口的方法
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(target, args);
        log(method.getName());
        return result;
    }
    public void log(String method){
        System.out.println("执行了"+method+"方法");
    }
}