package com.yaozhou.config;

import com.yaozhou.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by WXHang on HANG at 2021/7/8 0:09
 */

@Configuration
public class MyConfig {
    @Bean
    public User getUser(){
        return new User();
    }
}