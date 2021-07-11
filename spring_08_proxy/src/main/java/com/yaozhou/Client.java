package com.yaozhou;

import org.junit.Test;

/**
 * Created by WXHang on HANG at 2021/7/11 12:40
 */
public class Client {
    @Test
    public void TentHouse(){
        //房东要出租房子
        Host host = new Host();
        //代理，中介帮房东出租房子，但是中介会有一些附属操作，中介费，签合同，看房子
        Proxy proxy = new Proxy(host);
        //租房子的人不直接面对房东，直接找中介就可以
        proxy.rent();
    }
}