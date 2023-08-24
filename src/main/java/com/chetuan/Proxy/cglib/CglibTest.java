package com.chetuan.proxy.cglib;

/**
 * @author 孙浩林
 * @date: 7/16/23 17:19
 */
public class CglibTest {
    public static void main(String[] args) {
        AliSmsService aliSmsService = (AliSmsService) CglibProxyFactory.getProxy(AliSmsService.class);
        aliSmsService.send("java");
        }
}
