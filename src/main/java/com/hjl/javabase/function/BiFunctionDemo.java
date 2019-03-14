package com.hjl.javabase.function;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * BiFunction 前两个是参数 后一个是返回值
 * andThen  处理完前一个再处理下一个
 * @author: HJL
 * @create: 2019-03-14 22:27
 */
public class BiFunctionDemo {

    public static void main(String [] args){
        BiFunction<Integer,Integer,String> demo =(a,b)->"test"+a+b;
        System.out.println(demo.apply(1,2));
        Function<String,String> demoOther =a->"test"+a;
        System.out.println(demo.andThen(demoOther).apply(3,2));
    }

}
