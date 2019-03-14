package com.hjl.javabase.function;

import java.util.function.BiPredicate;

/**
 * 断言判断 主要是处理判断结果
 * or     是或者
 * and    是并且
 * negate 是反义
 * @author: HJL
 * @create: 2019-03-14 16:08
 */
public class BiPredicateDemo {

    public static void main(String [] args){

        BiPredicate<Integer,Integer> base = (a,b)->a>=b;
        System.out.println(base.test(1,2));
        //反义
        System.out.println(base.negate().test(1,2));
        BiPredicate<Integer,Integer> two = (a,b)->a+b>3;
        //并且
        System.out.println(base.and(two).test(2,2));
        //或者
        System.out.println(base.or(two).test(1,3));
    }



}
