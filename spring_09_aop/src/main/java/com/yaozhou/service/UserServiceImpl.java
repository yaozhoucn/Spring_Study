package com.yaozhou.service;

/**
 * Created by WXHang on HANG at 2021/7/11 12:59
 */
public class UserServiceImpl implements UserService{

    //修改了一个用户
    public void update() {
        System.out.println("修改了一个用户");
    }
    //增加了一个用户
    public void add() {
        System.out.println("增加了一个用户");
    }
    //删除了一个用户
    public void del() {
        System.out.println("删除了一个用户");
    }
    //查询了用户
    public void query() {
        System.out.println("查询了用户");
    }
}