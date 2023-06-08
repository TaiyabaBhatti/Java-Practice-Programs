package com.Arrays;

import java.util.Arrays;

public class KidWithMaxCandies {
    public static boolean[] candies(int[] arr,int extra ){
        int max=maxCandies(arr);
        boolean[] output=new boolean[5];
        for (int i=0;i< arr.length;i++){
            int sum=arr[i]+extra;
            output[i]=sum>max;
        }
             return output;

    }

    public static int maxCandies(int[] arr) {
        int max=0;
        for (int element:arr) {
            if (element>max){
                max=element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] range={3,5,2,4,1};
        int Ecandies=2;
        boolean[] result=candies(range, Ecandies);
        System.out.println(Arrays.toString(result));






    }
}
