package com.chetuan.proxy.cglib;

/**
 * @author 孙浩林
 * @date: 7/16/23 17:16
 */
public class AliSmsService {

    public String send(String message) {
        System.out.println("send message:" + message);
        return message;
    }
}
