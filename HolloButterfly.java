package com.tayyaba;

public class HolloButterfly {
    public static void main(String[] args) {

        int n=4;
        for (int row=1;row<=n;row++) {
            for (int col = 1; col <= row; col++) {
                if (row == 3) {
                    if (col == 2) {
                        System.out.print("  ");
                    }
                    else {
                        System.out.print("* ");
                    }
                } else if (row == 4) {
                    if (col == 2 || col == 3) {
                        System.out.print("  ");
                    }
                    else {
                        System.out.print("* ");
                    }
                }
                else {
                    System.out.print("* ");
                }


            }
            for (int e = 1; e <= 2 * n - 2 * row; e++) {
                System.out.print("  ");


            }
            for (int col = 1; col <= row; col++) {
                if (row == 3) {
                    if (col == 2) {
                        System.out.print("  ");
                    }
                    else {
                        System.out.print("* ");
                    }
                } else if (row == 4) {
                    if (col == 2 || col == 3) {
                        System.out.print("  ");
                    }
                    else {
                        System.out.print("* ");
                    }
                }
                else
                {
                    System.out.print("* ");
                }


            }


            System.out.println();
        }
        for (int row=4;row>=1;row--) {
            for (int col = 1; col <= row; col++) {
                if (row == 3) {
                    if (col == 2) {
                        System.out.print("  ");
                    }
                    else {
                        System.out.print("* ");
                    }
                } else if (row == 4) {
                    if (col == 2 || col == 3) {
                        System.out.print("  ");
                    }
                    else {
                        System.out.print("* ");
                    }
                }
                else {
                    System.out.print("* ");
                }


            }
            for (int e = 1; e <= 2 * n - 2 * row; e++) {
                System.out.print("  ");


            }
            for (int col = 1; col <= row; col++) {
                if (row == 3) {
                    if (col == 2) {
                        System.out.print("  ");
                    }
                    else {
                        System.out.print("* ");
                    }
                } else if (row == 4) {
                    if (col == 2 || col == 3) {
                        System.out.print("  ");
                    }
                    else {
                        System.out.print("* ");
                    }
                }
                else
                {
                    System.out.print("* ");
                }


            }


            System.out.println();
        }












    }
}
