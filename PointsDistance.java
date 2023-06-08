package com.Conditionals;
import java.util.Scanner;
public class PointsDistance {
    public static void main(String[] args) {
        // Distance between two points
              Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of x and y coordinates for point one:");
        float x1=sc.nextFloat();
        float y1=sc.nextFloat();
        System.out.println("Enter values of x and y coordinates for point two:");
        float x2=sc.nextFloat();
        float y2=sc.nextFloat();
        float x=x2-x1;
        float y=y2-y1;
        float squadd=x*x + y*y;
        float distance=(float) Math.sqrt(squadd);
        System.out.println("Distance between two points is:"+distance);





    }
}
