package com.tayyaba;

public class Rhombous {
    public static void main(String[] args) {
        int total=5;
        for (int row=1;row<=total;row++){
            for (int e=1;e<=(total-row);e++){
                System.out.print("  ");
            }
            for (int col=1;col<=total;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
