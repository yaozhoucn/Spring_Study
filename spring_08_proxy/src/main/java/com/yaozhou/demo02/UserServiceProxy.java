package com.yaozhou.demo02;

/**
 * Created by WXHang on HANG at 2021/7/11 13:07
 */
public class UserServiceProxy implements UserService {
    //代理真是角色
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void del() {
        log("del");
        userService.del();
    }

    public void query() {
        log("query");
        userService.query();
    }
    //增加日志方法
    public void log(String msg){
        System.out.println("使用了"+msg+"日志");
    }
}