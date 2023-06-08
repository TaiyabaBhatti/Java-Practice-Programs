package com.Conditionals;
import java.util.Scanner;
public class PowerToBase {
    public  static int power(int ...var){
        if (var[1]==0){
            return 1;
        }
        return var[0]*power(var[0],var[1]-1);
    }
    public static void main(String[] args) {
        // Calculate power
        Scanner sc= new Scanner( System.in);
        System.out.print("Enter Base number:");
        int base=sc.nextInt();
        System.out.print("Enter power raise to base:");
        int pow=sc.nextInt();
        System.out.println("The result of calculation:"+power(base,pow));




    }
}
