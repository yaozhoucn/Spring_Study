package com.yaozhou.log;


import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by WXHang on HANG at 2021/7/11 15:17
 */
public class AfterLog implements AfterReturningAdvice {
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了" + target.getClass().getName()
                +"的"+method.getName()+"方法,"
                +"返回值："+returnValue);
    }
}