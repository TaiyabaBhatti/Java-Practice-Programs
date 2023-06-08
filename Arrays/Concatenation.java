package com.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Concatenation {
    public static int[] concatenation(int[] var){
        int[] ans=new int[2*var.length];
        for (int i=0;i< var.length;i++){
            ans[i]=var[i];
            ans[i+ var.length]=var[i];

        }
        return ans;
    }
    public static void main(String[] args) {
        // Concatenation of array
        Scanner sc=new Scanner(System.in);
        int[] nums=new int[4];
        int n=nums.length;
                for (int i=0;i<n;i++){
                    nums[i]=sc.nextInt();
                }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(concatenation(nums)));









    }
}
