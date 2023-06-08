package com.tayyaba;

import  java.util.Scanner;
public class LargestNo {
    public static void main(String[] args) {
        // print largest number when Zero is pressed
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");

        int largestno = 0;
        while (true) {
            int num= sc.nextInt();

            if (num==0){
                break;
            }
            if (num>largestno){
                largestno=num;
            }

        }
        System.out.println("Largest number is:"+largestno);

    }
}












