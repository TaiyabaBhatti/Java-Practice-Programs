package com.Arrays;

import java.util.Scanner;

public class SentenceIsPangram {
    //A pangram is a sentence where every letter of the English alphabet appears at least once.
    public static boolean checkIfPangram(String sentence) {
        String s="abcdefghijklmnopqrstuvwxyz";
        int k=0;
        for (int j = 0; j < s.length(); j++) {
            for (int i = 0; i < sentence.length(); i++){
                if(k==26){
                    break;
                }
                if ( s.charAt(j)==sentence.charAt(i)) {
                  k++;
                  break;
                }
            }
        }
        if (k==26){
            return  true;
        }
        else {
        return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

            boolean result = checkIfPangram(str.toLowerCase());
        System.out.println(result);
        }
    }

