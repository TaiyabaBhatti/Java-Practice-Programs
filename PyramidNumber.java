package com.tayyaba;

public class PyramidNumber {
    public static void main(String[] args) {
        int total=5;
        for (int row=1;row<=total;row++) {
            for (int e = 1; e <= (total - row); e++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + row);
            }
            System.out.println();

        }




    }
}
