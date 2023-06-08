package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAccountBalance {
    public static void balance(int[][] var){
        int sum;
        int max=0;
        int count=1;
        System.out.println();
        for (int cus=0;cus<var.length;cus++){
                sum=0;
            for (int acc=0;acc<var[cus].length;acc++){
                sum+=var[cus][acc];


            }

            System.out.println("Balance of customer "+count+" = "+sum);
          count++;
          if (sum>max){
              max=sum;
          }
        }
        System.out.println("Maximum wealth = "+max);




    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][4];
        for (int cus=0;cus< arr.length;cus++){
            for (int acc=0;acc<arr[0].length;acc++){

                arr[cus][acc]=sc.nextInt();

            }
        }
        for (int[] element:arr) {
            System.out.print(Arrays.toString(element));

        }
        balance(arr);







    }
}
