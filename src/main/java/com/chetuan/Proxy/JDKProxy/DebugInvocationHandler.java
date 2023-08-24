package com.chetuan.proxy.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 孙浩林
 * @date: 7/16/23 16:35
 */
public class DebugInvocationHandler implements InvocationHandler {

    private final Object target;

    public DebugInvocationHandler(Object target) {
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("这是在调用方法之前捏");
        Object result = method.invoke(target, args);
        System.out.println("这是在调用之后打印出来的");
        return result;
    }
}
