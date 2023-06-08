package com.Conditionals;
public class ReverseOfNumber {
    public static void main(String[] args) {
        int num=3456789;
int reverse=0;
        int sum=0;
        while(num>0){

            int remainder=num%10;
            reverse=reverse*10+remainder;
            sum+=remainder;
            num=num/10;
        }
        System.out.println("the sum of given number's digits:"+sum);
        System.out.println("Reverse of a given number is :"+reverse);









    }

}
