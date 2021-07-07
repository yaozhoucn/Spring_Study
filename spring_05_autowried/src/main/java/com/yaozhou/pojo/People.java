package com.yaozhou.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * Created by WXHang on HANG at 2021/7/7 17:40
 * Desc：
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class People {

    private String name;
    @Autowired
    @Qualifier(value = "dog")
    private Dog dog;
    @Resource(name = "cat")
    private Cat cat;
}
