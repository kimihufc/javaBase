package com.hjl.javabase.threadexamine;

/**
 * @author: HJL
 * @create: 2019-02-18 20:58
 */
public class CommonConsume {

    public static void main(String[] args) throws Exception{
        Ticket ticket = Ticket.value(100);
        for (int i = 0; i <12 ; i++) {
            new Thread(new Runnable() {
                public void run() {
                    for (int i = 0; i <10 ; i++) {
                        if(ticket.getTotal()>0){
                            ticket.reduce();
                            System.out.println(ticket.toString());
                        }
                    }
                }
            }).start();

        }

    }

}
