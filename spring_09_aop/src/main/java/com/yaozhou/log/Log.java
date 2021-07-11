package com.yaozhou.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by WXHang on HANG at 2021/7/11 14:50
 * @author HANG
 */
public class Log implements MethodBeforeAdvice {
    //method :要执行的目标对象的方法
    //args：参数
    //target ： 目标
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了"+target.getClass().getName()+"的"+method.getName()+"方法");

    }
}