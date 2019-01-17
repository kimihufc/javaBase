package com.hjl.javabase.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: HJL
 * @create: 2019-01-17 16:34
 */
public class CglibProxy implements MethodInterceptor {

    private static CglibProxy singleCglib = new CglibProxy();

    public static CglibProxy newInstantance(){
        return singleCglib;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("------- cglib proxy --------");
        Object invoke = methodProxy.invokeSuper(o, objects);
        System.out.println("******* cglib proxy ********");
        return invoke;
    }

    public <T> T getProxy(Class<T> cls){
        return (T)Enhancer.create(cls,this);
    }
}
