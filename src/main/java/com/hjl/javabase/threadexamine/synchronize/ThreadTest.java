package com.hjl.javabase.threadexamine.synchronize;

/**
 * @author: HJL
 * @create: 2019-02-28 09:59
 */
public class ThreadTest {

    public static void main(String [] args){

        Consumer consumer = new Consumer();

        Thread thread1 = new Thread(consumer);
        Thread thread2 = new Thread(consumer);
        Thread thread3 = new Thread(consumer);
        Thread thread4 = new Thread(consumer);
        Thread thread5 = new Thread(consumer);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        /**
         * synchronized
         *  单表锁
         *  1 方法 普通方法  锁对象  静态方法 锁类
         *  2 实体 普通实体  锁对象  静态实体 锁类
         */
    }

}
