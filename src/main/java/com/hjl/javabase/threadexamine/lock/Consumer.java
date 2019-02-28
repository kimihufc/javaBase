package com.hjl.javabase.threadexamine.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: HJL
 * @create: 2019-02-28 14:42
 */
public class Consumer implements Runnable{

    private Lock lock = new ReentrantLock();

    private int num = 3;

    @Override
    public void run(){
        lock.lock();
        num--;
        System.out.println(num);
        lock.unlock();
    }


}
