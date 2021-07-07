package com.yaozhou.pojo;

/**
 * Created by WXHang on HANG at 2021/7/7 12:39
 * Desc：
 */
public class Address {
    private String address;
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
