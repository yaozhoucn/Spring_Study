package com.yaozhou.diy;

/**
 * Created by WXHang on HANG at 2021/7/11 15:44
 * @author HANG
 */
public class DiyPointCut {
    public void before(){
        System.out.println("============方法执行前============");
    }

    public void after(){
        System.out.println("============方法执行后============");
    }
}