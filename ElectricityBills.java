package com.Conditionals;
import java.util.Scanner;
public class ElectricityBills {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter units used per month:");
        int units=sc.nextInt();
        float rate;
        if (units<=100 && units>0){
             rate=units*7.87f;
            System.out.println("Electricity bill to pay:"+rate);
        }
        else if (units>100 && units<=200){
             rate=units*10.46f;
            System.out.println("Electricity bill to pay:"+rate);
        }
        else if (units>200 && units<=300){
             rate=units*12.23f;
            System.out.println("Electricity bill to pay:"+rate);
        } else if (units>300 && units<=700) {
            rate=units*15.93f;
            System.out.println("Electricity bill to pay:"+rate);
        }
        else {
            System.out.println("No new updates");
        }


    }
}
