package com.hjl.javabase.threadexamine.condition;

/**
 * @author: HJL
 * @create: 2019-02-28 15:10
 */
public class ThreadTest {

    public static void main(String [] args){

        Consumer consumer = new Consumer();

        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    consumer.printA();
                }
            }
        });
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    consumer.printB();
                }
            }
        });
        threadA.start();
        threadB.start();

    }

}
