package com.yaozhou.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by WXHang on HANG at 2021/7/8 0:08
 */
@Data
public class User {
    @Value("尧神")
    private String name;
}