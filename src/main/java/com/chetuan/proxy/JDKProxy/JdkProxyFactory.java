package com.chetuan.proxy.JDKProxy;

import java.lang.reflect.Proxy;

/**
 * @author 孙浩林
 * @date: 7/16/23 16:39
 */
public class JdkProxyFactory {
    public static Object getProxy(Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(), // 目标类的类加载
                target.getClass().getInterfaces(),  // 代理需要实现的接口，可指定多个
                new DebugInvocationHandler(target)   // 代理对象对应的自定义 InvocationHandler
        );
    }
}

