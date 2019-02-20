package com.hjl.javabase.threadexamine;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: HJL
 * @create: 2019-02-20 17:49
 */
public class PrintLockABC {

    public static void main(String [] args){
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        new Thread(new Runnable() {
            @Override
            public void run()  {
                 while (true){
                     if(lock.tryLock()){
                         condition.signal();
                         System.out.println("A");
                         try {
                             TimeUnit.SECONDS.sleep(1L);
                             condition.await();
                         } catch (InterruptedException e) {
                             e.printStackTrace();
                         }

                     }
                 }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    if(lock.tryLock()){
                        condition.signal();
                        System.out.println("B");
                        try {
                            TimeUnit.SECONDS.sleep(1L);
                            condition.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();
    }

}
