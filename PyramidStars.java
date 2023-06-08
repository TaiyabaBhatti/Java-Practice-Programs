package com.tayyaba;

public class PyramidStars {
    public static void main(String[] args) {
        int total=5;
        for (int row=1;row<=total;row++){
            for (int e=1;e<=(total-row);e++){
                System.out.print("  ");
            }
            for (int col=1;col<=(row*2-1);col++){
                System.out.print("* ");
            }
            System.out.println();


        }
    }
}
