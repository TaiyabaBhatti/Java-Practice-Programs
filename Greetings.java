package com.tayyaba;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        greetings();
    }
    static void greetings(){
        Scanner obj=new Scanner(System.in);
        String gre=obj.nextLine();
        System.out.println("Hello,Tayyaba "+gre);



    }
}
