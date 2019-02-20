package com.hjl.javabase.threadexamine;

/**
 * 实例化三个线程，一个线程打印a,一个打印b,一个打印c,三个线程同时执行，要求打印出6个连着的abc
 *  通过volatile
 * @author: HJL
 * @create: 2019-02-20 16:38
 */
public class PrintStaticABC {

    private static  String now = "A";

    private String nowPrint;

    private String nextPrint;

    public PrintStaticABC(String nowPrint, String nextPrint) {
        this.nowPrint = nowPrint;
        this.nextPrint = nextPrint;
    }

    public static void main(String [] agrs){
        PrintStaticABC a = new PrintStaticABC("A","B");
        PrintStaticABC b = new PrintStaticABC("B","C");
        PrintStaticABC c = new PrintStaticABC("C","A");
        new Thread(new Runnable() {
            @Override
            public void run() {
                    a.print();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                    b.print();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                    c.print();
            }
        }).start();
    }

    public void print(){
        for (int i = 0; i < 10;) {
            if(PrintStaticABC.now.equals(nowPrint)){
                System.out.println(now);
                PrintStaticABC.now=nextPrint;
                i++;
            }
        }
    }
}
