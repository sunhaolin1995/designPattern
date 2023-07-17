package com.chetuan.proxy.JDKProxy;

import com.chetuan.proxy.SmsService;
import com.chetuan.proxy.SmsServiceImpl;

/**
 * @author 孙浩林
 * @date: 7/16/23 16:42
 */
public class JdkProxyTest {

    public static void main(String[] args) {
        SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("hello");
    }

}
