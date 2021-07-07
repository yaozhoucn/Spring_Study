package com.yaozhou.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by WXHang on HANG at 2021/7/7 17:40
 * Desc：
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class People {
    private String name;
    private Dog dog;
    private Cat cat;
}
