package com.hjl.javabase.threadexamine.waitnotify;

/**
 * @author: HJL
 * @create: 2019-02-28 10:18
 */
public class WaitNotifyTest {

    public static void main(String [] args){
        Consumer consumer = new Consumer();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 4 ; i++) {
                    consumer.consume();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    consumer.produce();
                }
            }
        });
        thread1.start();
        thread2.start();
    }

}
