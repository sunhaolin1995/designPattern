package com.chetuan.proxy;


public class SmsServiceImpl implements SmsService{
    @Override
    public String send(String message) {
        System.out.println("send Message:" + message);
        return message;
    }
}
