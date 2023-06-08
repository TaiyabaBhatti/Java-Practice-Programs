package com.Conditionals;
import java.util.Scanner;
public class SummerCollectionDiscountShop {
    public static float discount(int ...var){
        float off=(float) var[0]/100;
        float discountedamot=off*var[1];

        return  var[1]-discountedamot;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Assalam o alaikum, MAM");

        int numberofitem;
        int totalamount;
        int saleprice;
        System.out.println("What categray of item you want to buy?Select from the given choices");
        System.out.println("|  1)Bags       2)Dress     3)Perfumes     4)Badsheets");
        float selecitemprice;
        int sum=0;
        while (true) {
            int input= sc.nextInt();
            switch (input) {
                case 1 -> {
                    System.out.println("25% off on bags (initila price is 3000)");
                    System.out.println("Enter no of items to buy:");
                    numberofitem = sc.nextInt();
                    saleprice = 3000;
                    totalamount = numberofitem * saleprice;
                    selecitemprice=discount(25,totalamount);
                    System.out.println("Total Amount to pay :"+selecitemprice);
                    sum +=selecitemprice;
                }
                case 2 -> {
                    System.out.println("35% off on Dress (initila price is 4000)");
                    System.out.println("Enter no of items to buy:");
                    numberofitem = sc.nextInt();
                    saleprice = 4000;
                    totalamount = numberofitem * saleprice;
                    selecitemprice=discount(35,totalamount);
                    System.out.println("Total Amount to pay :"+selecitemprice);
                    sum +=selecitemprice;
                }
                case 3 -> {
                    System.out.println("15% off on perfumes (initila price is 1500)");
                    System.out.println("Enter no of items to buy:");
                    numberofitem = sc.nextInt();
                    saleprice = 1500;
                    totalamount = numberofitem * saleprice;
                    selecitemprice=discount(15,totalamount);
                    System.out.println("Total Amount to pay :"+selecitemprice);
                    sum +=selecitemprice;
                }
                case 4 -> {
                    System.out.println("50% off on Badsheets (initila price is 5500)");
                    System.out.println("Enter no of items to buy:");
                    numberofitem = sc.nextInt();
                    saleprice = 5500;
                    totalamount = numberofitem * saleprice;
                    selecitemprice=discount(50,totalamount);
                    System.out.println("Total Amount to pay :"+selecitemprice);
                    sum +=selecitemprice;
                }
            }
            System.out.println("Do you shop more:");
            String ch=sc.next();
            if(ch.equals("n")){
                break;
            }
        }
        System.out.println("Total amount to pay : "+sum);












    }
}
