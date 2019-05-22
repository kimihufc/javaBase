package com.hjl.javabase.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Created with IntelliJ IDEA.
 * User: hjl
 * Date: 19-5-22
 * Time: 上午10:09
 * Description:
 */
public class SpiMain {

    public static void main(String [] args){
        ServiceLoader<Say> syaload = ServiceLoader.load(Say.class);
        Iterator<Say> iterator = syaload.iterator();
        while (iterator.hasNext()){
            Say next = iterator.next();
            next.say();
        }

    }
}
