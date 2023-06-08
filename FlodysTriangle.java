package com.tayyaba;

public class FlodysTriangle {
    public static void main(String[] args) {
        int number=1;
        for (int row=1;row<=5;row++){
            for (int col=1;col<=row;col++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
