package com.tayyaba;

public class InvertedHalfPyramid180 {
    public static void main(String[] args) {
        int totalrows=4;
        int e;
        int n=1;
        for(int row=1;row<=totalrows;row++){
            for( e=1;e<=(totalrows-n);e++){
                System.out.print("  ");
            }
            for (int col=1;col<=row;col++){
                System.out.print("* ");
            }
            n++;
            System.out.println();
        }
    }
}
