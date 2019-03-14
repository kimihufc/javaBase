package com.hjl.javabase.function;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 *  BinaryOperator 合并结果
 *  minBy 取最小的
 *  maxBy 取最大的
 * @author: HJL
 * @create: 2019-03-14 22:48
 */
public class BinaryOperatorDemo {

    public static void  main(String [] args){
        BinaryOperator<Integer> demo = (a,b)->a+b;
        System.out.println(demo.apply(2,3));
        Comparator<Integer> comparator = (a,b)->a-b;
        System.out.println(BinaryOperator.minBy(comparator).apply(1,2));
        System.out.println(BinaryOperator.maxBy(comparator).apply(1,2));

    }

}
