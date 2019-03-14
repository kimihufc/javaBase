package com.hjl.javabase.arithmetic;

/**
 * @author: HJL
 * @create: 2019-02-28 20:44
 */
public class ZShapeSort {

    /**
     *  0   1  5   6  14
     *  2   4  7  13  16
     *  3   8  12 17  25
     *  9  11  18 24  31
     *  10 19  23 32  39
     */

    public static void main(String [] args){


    }

    private int[][] createZShapeSort(int num){
        int[][] result = new int[num][num];
        int total = num*num;
        int i=0,j=0;
        for (int k = 0; k < total; k++) {
           if(i==0&&j%2==0&&j<num-1){
               result[i][j]=k;
               i=0;
               j++;
               continue;
           }else if(i==0&&j%2==1&&j<num-1){
               result[i][j]=k;
               i++;
               j--;
               continue;
           }


        }
        return result;
    }


}
