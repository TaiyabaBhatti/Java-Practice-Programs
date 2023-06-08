package com.Conditionals;

import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        // input a number and print all its factor
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number:");
        int number=sc.nextInt();
        System.out.println("Factors of "+number+" is given blow.");
        for (int i=2;i<=number;i++){
            if(number%i==0){
                System.out.print(i+" ");
            }
        }






    }
}