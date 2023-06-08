package com.Conditionals;

public class OutingDays {
    public static void main(String[] args) {
        // I'm allowed to go outside on even days
        // Month of may 2023
        int count=0;
        for (int day=1;day<=31;day++){
            if(day%2==0){
               count++;
            }
        }
        System.out.println("The total no of days are:"+count);






    }
}
