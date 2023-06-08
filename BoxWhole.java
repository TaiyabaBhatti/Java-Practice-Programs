package com.tayyaba;

public class BoxWhole {
    public static void main(String[] args) {


        for (int row=1;row<=4;row++){
            for (int col=1;col<=5;col++){
                if (row==1||row==4){

                    System.out.print("* ");
                } else if (row==2||row==3) {
                    if (col == 1 || col == 5) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }


            }
            System.out.println();
        }







    }











}
