package com.Conditionals;
import java.util.Scanner;
public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter termination point:");
        int range=sc.nextInt();
        int sum=0;
        int divider;
        for ( divider=1;divider<=range;divider++){
            int number=sc.nextInt();
            sum+=number;
        }
        float average =(float) sum / divider;
        System.out.println("The average of "+range+" numbers : "+average);

    }
}
