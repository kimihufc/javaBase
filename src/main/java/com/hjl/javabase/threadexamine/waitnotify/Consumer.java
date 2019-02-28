package com.hjl.javabase.threadexamine.waitnotify;

/**
 * @author: HJL
 * @create: 2019-02-28 10:12
 */
public class Consumer {


    public synchronized void consume() {
        System.out.println("consume");
        notify();
        try {
            wait();
            Thread.sleep(500L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public synchronized void produce() {
        System.out.println("produce");
          notify();
        try {
            wait();
            Thread.sleep(500L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
