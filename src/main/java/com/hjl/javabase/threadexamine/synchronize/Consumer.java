package com.hjl.javabase.threadexamine.synchronize;

/**
 * @author: HJL
 * @create: 2019-02-2 09:55
 */
public class Consumer implements Runnable{

    private int num = 4;


    @Override
    public synchronized void run() {
        if(num>1){
            num = num - 1 ;
            System.out.println("[num:"+num+"]");
        }
    }
}
