package com.tayyaba;
import java.util.Scanner;
public class PrimeNo {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int number=obj.nextInt();
        boolean check=sPrime(number);
        System.out.println("The number is prime : "+check);
    }

     static boolean sPrime(int num) {
        int a=2;
        while (a<num){
            if(num%a==0){
                return false;
            }
            a++;

        }
        return true;

    }

}
