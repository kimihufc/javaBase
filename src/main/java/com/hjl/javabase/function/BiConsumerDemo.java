package com.hjl.javabase.function;

import java.util.function.BiConsumer;

/**
 * 消费处理 无返回
 * andthen 处理完前一个再处理下一个
 * @author: HJL
 * @create: 2019-03-14 17:15
 */
public class BiConsumerDemo {

    public static void main(String [] args){
        BiConsumer<Integer,Integer> consumer = (a,b)-> System.out.println(a+b);
        consumer.accept(1,2);
        BiConsumer<Integer,Integer> consumerOther = (a,b)-> System.out.println(a-b);
        consumer.andThen(consumerOther).accept(1,2);
    }
}
