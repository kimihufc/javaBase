package com.hjl.javabase.threadexamine;

/**
 * 实例化三个线程，一个线程打印a,一个打印b,一个打印c,三个线程同时执行，要求打印出6个连着的abc
 * @author: HJL
 * @create: 2019-02-20 10:20
 */
public class PrintABC {



    public static void main(String [] args)throws Exception{
           Object A=new Object();
           Object B=new Object();
           Object C=new Object();
       new Thread(new Runnable() {
           @Override
           public void run() {
               for (int i = 0; i <5 ; i++) {
                   System.out.println("A1");
                   synchronized (B){
                       System.out.println("A2");
                       synchronized (C){
                           System.out.println("-------A");
                           C.notifyAll();
                           try {
                               B.wait();
                           } catch (InterruptedException e) {
                               e.printStackTrace();
                           }
                       }
                   }
               }
           }
       }).start();
//        Thread.sleep(300L);
        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i <5 ; i++) {
                    System.out.println("B1");
                synchronized (C){
                    System.out.println("B2");
                    synchronized (A){
                        System.out.println("-------B");
                        A.notifyAll();
                        try {
                            C.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            }
        }).start();
//        Thread.sleep(300L);
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <5 ; i++) {
                    System.out.println("C1");
                synchronized (A){
                    System.out.println("C2");
                    synchronized (B){
                        System.out.println("-------C");
                        B.notifyAll();
                        try {
                            A.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                }
            }
        }).start();
    }
}
