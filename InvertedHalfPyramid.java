package com.tayyaba;

public class InvertedHalfPyramid {
    public static void main(String[] args) {

        int n=0;
        int totalcol=5;
        for (int row=1;row<=totalcol;row++){
            for (int col=1;col<=(totalcol-n);col++){
                System.out.print("* ");
            }
           n++;
            System.out.println();
        }






    }
}
