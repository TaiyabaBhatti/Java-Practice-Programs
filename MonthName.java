package com.tayyaba;
import java.util.Scanner;
public class MonthName {
    public static void main(String[] args) {
        //Ask the user to enter the number of the month & print the name of the month.
        // For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.
     Scanner obj=new Scanner(System.in);
        System.out.print("Enter month number: ");
     int month_no=obj.nextInt();
        switch (month_no) {
            case 1 -> System.out.println("Name of the month is January");
            case 2 -> System.out.println("Name of the month is February");
            case 3 -> System.out.println("Name of the month is March");
            case 4 -> System.out.println("Name of the month is April");
            case 5 -> System.out.println("Name of the month is May");
            case 6 -> System.out.println("Name of the month is June");
            case 7 -> System.out.println("Name of the month is July");
            case 8 -> System.out.println("Name of the month is August");
            case 9 -> System.out.println("Name of the month is September");
            case 10 -> System.out.println("Name of the month is Octuber");
            case 11 -> System.out.println("Name of the month is November");
            case 12 -> System.out.println("Name of the month is December");
            default -> System.out.println("Months cann't update");
        }




    }
}
