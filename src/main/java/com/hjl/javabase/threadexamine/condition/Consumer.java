package com.hjl.javabase.threadexamine.condition;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: HJL
 * @create: 2019-02-28 15:07
 */
public class Consumer {

    private Lock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    public void printA(){
        lock.lock();
        System.out.println("A");
        condition.signal();
        try {
            condition.await();
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.unlock();
    }

    public void printB(){
        lock.lock();
        System.out.println("B");
        condition.signal();
        try {
            condition.await();
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.unlock();
    }

}
