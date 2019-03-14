package com.hjl.javabase.function;

import java.util.function.Function;

/**
 *  Function 前一个是参数 后一个是返回值
 * @author: HJL
 * @create: 2018-12-13 20:27
 */
public class FunctionDemo {

    public static void main(String[] args){
        Function<String,Object> func = str -> str+"123";
        System.out.println(func.apply("123"));
        Function<Integer,Integer> doubleVal = e->e*2;
        Function<Integer,Integer> squreVal = e->e*e;
        System.out.println(doubleVal.andThen(squreVal).apply(3));
        System.out.println(doubleVal.compose(squreVal).apply(3));
    }

}
