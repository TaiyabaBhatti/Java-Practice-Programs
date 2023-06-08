package com.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class RunningSum {
    public static int[] runningSum(int[] var){
        int[] Runsum=new int[var.length];
        int sum=0;
        for (int i=0;i<var.length;i++){
            sum+=var[i];
            Runsum[i]=sum;
        }

        return Runsum;



    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(runningSum(arr)));


    }



}
