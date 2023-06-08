package com.Arrays;


import java.util.Arrays;

public class ArrayPermutation {
    public static void main(String[] args) {
        // forming array permutation from given array

        int[] num={3,1,2,4,5,0};
        int[] ans=new int[num.length];

        for (int i=0;i< num.length;i++) {
            ans[i] = num[num[i]];

        }

        System.out.println(Arrays.toString(ans));




    }
}
