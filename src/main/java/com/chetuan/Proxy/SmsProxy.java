package com.chetuan.proxy;

import java.lang.reflect.Field;

/**
 * @author 孙浩林
 * @date: 7/16/23 15:47
 */
public class SmsProxy implements SmsService{

    private final SmsService smsService;

    public SmsProxy(SmsService smsService){
        this.smsService = smsService;
    }

    @Override
    public String send(String message) {
        System.out.println("这是在调用方法之前捏");
        smsService.send(message);
        System.out.println("这是在调用之后打印出来的");
        return null;
    }
}
