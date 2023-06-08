package com.tayyaba;
import java.util.Scanner;
public class Currency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter amount in rupees(PAK):");
        int pak_Rupee=sc.nextInt();
        System.out.print("Conversion 1-USD 2-Turkish lira 3-UAE");
        int input=sc.nextInt();
        switch (input) {
            case 1 -> {    //1pak = 0.0035$
                double USD = pak_Rupee * 0.0035;
                System.out.println("Amount in USD : " + USD);
            }
            case 2 -> {    //1pak = 0.07
                double lira = pak_Rupee * 0.07;
                System.out.println("Amount in Turkish lira : " + lira);
            }
            case 3 -> {    //1pak = 0.0035$
                double UAE = pak_Rupee * 0.013;
                System.out.println("Amount in USD : " + UAE);
            }
            default -> System.out.println("No new updates.");
        }
    }
}
