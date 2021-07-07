package com.yaozhou.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

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
    private Dog dog;
    @Autowired
    private Cat cat;
}
