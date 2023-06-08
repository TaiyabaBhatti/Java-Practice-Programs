package com.tayyaba;

public class PyramidNoIncre {
    public static void main(String[] args) {
        for (int row=1;row<=5;row++){
            for (int e=1;e<=(5-row);e++){
                System.out.print("  ");
            }
            for (int col=1;col<=(2*row-1);col++){
                System.out.print(col+" ");
            }
            System.out.println();

        }
    }
}
