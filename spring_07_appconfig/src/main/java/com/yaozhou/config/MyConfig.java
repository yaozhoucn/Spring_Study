package com.yaozhou.config;

import com.yaozhou.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by WXHang on HANG at 2021/7/8 0:09
 */

@Configuration
@ComponentScan("com.yaozhou.pojo")
@Import(com.yaozhou.config.MyConfig2.class)
public class MyConfig {
    @Bean
    public User getUser(){
        return new User();
    }
}