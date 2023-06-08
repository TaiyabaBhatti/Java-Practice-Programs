package com.tayyaba;

import java.util.Arrays;

public class ColNotFixed {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5},
                {4,6,2},
                {5}

        };
//        for (int rowi=0;rowi<arr.length;rowi++) {
//            for (int coli = 0; coli < arr[rowi].length; coli++) {
//                System.out.print(arr[rowi][coli]);
//            }
//            System.out.println();
//        }
//        for (int rowi=0;rowi<arr.length;rowi++) {
//            System.out.println(Arrays.toString(arr[rowi]));
//        }
        for (int[] element:arr) {
            System.out.println(Arrays.toString(element));
        }




    }
}
