package com.Conditionals;
import java.util.Scanner;
public class LenghConversion {
    public static void main(String[] args) {
        //Area of circle      =3.14*radius*radius
        //1meter=100cm
        //cm or mm or microm
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        float radius=sc.nextFloat();
        String length= sc.next();
        float meter;
        float area;
        switch (length) {
            case "cm" -> {
                meter = radius * 100f;
                area = (float) 3.14 * meter * meter;
                System.out.println("Area of the circle :" + area);
            }
            case "mm" -> {
                meter = radius * 1000;
                area = (float) 3.14 * meter * meter;
                System.out.println("Area of the circle :" + area);
            }
            case "um" -> {
                meter = radius * 1000000;
                area = (float) 3.14 * meter * meter;
                System.out.println("Area of the circle :" + area);
            }
            default -> System.out.println("invalid input");
        }


    }
    }
