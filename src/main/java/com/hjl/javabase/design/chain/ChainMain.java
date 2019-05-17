package com.hjl.javabase.design.chain;

/**
 * Created with IntelliJ IDEA.
 * User: hjl
 * Date: 19-5-16
 * Time: 下午8:24
 * Description:   责任链启动类
 */
public class ChainMain {


    public static void main(String[] args) {
        ChainExcute chainExcute = new ChainExcute();
        chainExcute.chain(new Param());
    }

}
