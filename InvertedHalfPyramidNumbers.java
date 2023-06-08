package com.tayyaba;

public class InvertedHalfPyramidNumbers {
    public static void main(String[] args) {
        int total=5;
        int n=0;
        for (int row=1;row<=total;row++){
            for (int col=1;col<=total-n;col++){
                System.out.print(col+" ");
            }
            n++;
            System.out.println();
        }
    }
}
