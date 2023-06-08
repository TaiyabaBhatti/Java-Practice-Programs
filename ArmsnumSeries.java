package com.tayyaba;
import java.util.Scanner;




public class ArmsnumSeries {
    // Armstrong number
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Print all the armstrong number between :");
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        myFunction(num1, num2);

    }

    static void myFunction(int first, int last) {
        for (int i = first; i <= last; i++) {
            if (calculate(i)) {
                System.out.print(i + " ");


            }
        }

    }


    static boolean calculate(int a) {
        int original = a;
        int result = 0;

        while (a > 0) {
            int key = a % 10;
            result += key * key * key;
            a = a / 10;
        }
        return result == original;


    }
}


