package com.hjl.javabase;

import com.hjl.javabase.proxy.CglibProxy;
import com.hjl.javabase.proxy.Do;
import com.hjl.javabase.proxy.impl.Doimpl;

/**
 * @author: HJL
 * @create: 2018-12-13 20:27
 */
public class JavaBaseMain {

    public static void main(String[] args){
//        Do proxy = new JdkProxy(new Doimpl()).getProxy();
//        proxy.say();
        Do proxy = CglibProxy.newInstantance().getProxy(Doimpl.class);
        proxy.say();
    }

}
