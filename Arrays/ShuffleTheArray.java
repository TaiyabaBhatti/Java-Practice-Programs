package com.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ShuffleTheArray {
    public  static int[] shuffle(int[] var){
        int[] ans=new int[var.length];
        for (int i=0;i< var.length/2;i++){
            ans[i*2]=var[i];
            ans[i*2+1]=var[i+ var.length/2];
        }
        return ans;

    }
    public static void main(String[] args) {
        //        Shuffle the array
        Scanner sc=new Scanner(System.in);
        int n=4;
        int[] arr=new int[2*n];
        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(shuffle(arr)));



    }
}
