package com.tayyaba;

public class HollowRhombous {
    public static void main(String[] args) {
        int n=5;
        for (int row=n;row>=1;row--){
            for (int e=1;e<=row;e++){
                System.out.print(" ");
            }
            for (int col=1;col<=n;col++){
               if (row==1||row==n){
                   System.out.print("*");
               }
               else
               {
                   if (col==1||col==n){
                       System.out.print("*");
                   }
                   else {
                       System.out.print(" ");
                   }

               }
            }
            System.out.println();

        }
    }
}
