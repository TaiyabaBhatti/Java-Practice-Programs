package com.tayyaba;
import java.util.Arrays;
import java.util.Scanner;
public class DisplayArray {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        int[][] arry=new int[3][4];
        System.out.println(arry.length);   //length of row
        System.out.println(arry[0].length);
        for (int row=0;row< arry.length;row++){
               for (int col=0;col<arry[row].length;col++){
                   arry[row][col]=obj.nextInt();
               }
        }
//        for (int row=0;row< arry.length;row++){
//            for (int col=0;col<arry[row].length;col++){
//                System.out.print(arry[row][col]+" ");
//            }
//            System.out.println();
//        }
        for (int[] a : arry) {
            System.out.println(Arrays.toString(a));
        }







    }
}
