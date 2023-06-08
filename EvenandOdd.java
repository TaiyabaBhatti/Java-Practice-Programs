package com.Conditionals;
import java.util.Scanner;
public class EvenandOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input numbers till user press zero");
        int num;
        int Negnum=0;
        int Poseven=0;
        int Posodd=0;
        while(true){
            num=sc.nextInt();
            if (num==0){
                break;
            }
            else if (num<0){
                Negnum+=num;
            } else if ( num%2==0) {
                Poseven+=num;

            } else
                Posodd+=num;



        }
        System.out.println("The sum of negative numbers:"+Negnum);
        System.out.println("The sum of Positive even numbers:"+Poseven);
        System.out.println("The sum of Positive odd numbers:"+Posodd);
    }
}
