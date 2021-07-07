package com.yaozhou.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by WXHang on HANG at 2021/7/7 18:49
 * Desc：
 */
@Component
@Data
public class User {
    @Value("尧神")
    private String name;
}
