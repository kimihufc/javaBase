package com.hjl.javabase.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: HJL
 * @create: 2019-01-17 16:30
 */
public class JdkProxy implements InvocationHandler {

    private Object object;

    public JdkProxy(Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("-----jdk proxy--------");
        Object invoke = method.invoke(object, args);
        System.out.println("*****jdk proxy********");
        return invoke;
    }

    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

}
