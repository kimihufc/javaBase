package com.hjl.javabase.spi.impl;

import com.hjl.javabase.spi.Say;

/**
 * Created with IntelliJ IDEA.
 * User: hjl
 * Date: 19-5-22
 * Time: 上午10:04
 * Description:
 */
public class DogSay implements Say {

    @Override
    public void say() {
        System.out.println("dog say ******");
    }
}
