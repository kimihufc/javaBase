package com.hjl.javabase.threadexamine;

/**
 * @author: HJL
 * @create: 2019-02-20 17:11
 */
public class PrintViolentABC {

    public static void main(String [] args){
        PrintViolentABC abc = new PrintViolentABC();
        Print print = abc.new Print("A","B","C");
        for (int i = 0; i <10 ; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    print.print();
                }
            }).start();
        }
    }


    private class Print{
        private volatile String now = "A";

        private String one;
        private String two;
        private String three;

        public Print(String one, String two, String three) {
            this.one = one;
            this.two = two;
            this.three = three;
        }

        void print(){
            if(now.equals(one)){
                System.out.println(one);
                now=two;
            }else if(now.equals(two)){
                System.out.println(two);
                now=three;
            }else {
                System.out.println(three);
                now=one;
            }
        }
    }

}
