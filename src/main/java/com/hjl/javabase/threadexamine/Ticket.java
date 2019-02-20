package com.hjl.javabase.threadexamine;

/**
 * @author: HJL
 * @create: 2019-020 09:50
 */
public class Ticket {

    private int total;

    private Ticket(){

    }

    public static Ticket value(int num) throws Exception{
        if(num<0){
            throw new Exception("total is less zero");
        }
        Ticket ticket = new Ticket();
        ticket.setTotal(num);
        return  ticket;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void reduce(){
        total--;
    }

    @Override
    public String toString() {
        return "Ticket{" +
            "total=" + total +
            '}';
    }
}
