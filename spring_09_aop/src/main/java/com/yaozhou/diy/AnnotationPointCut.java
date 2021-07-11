package com.yaozhou.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by WXHang on HANG at 2021/7/11 16:00
 * @author HANG
 *
 * 使用注解方式实现aop
 */

@Aspect //标注这个类是一个切面
public class AnnotationPointCut {
    @Before("execution(* com.yaozhou.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("============注解方法执行前============");
    }
    @After("execution(* com.yaozhou.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("============注解方法执行后============");
    }
    @Around("execution(* com.yaozhou.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("======环绕前=====");
        //执行方法
        Object proceed = jp.proceed();
        System.out.println("======环绕后=====");

    }
}