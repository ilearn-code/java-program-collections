package com.example;

public class p54 {
    public static void main(String[] args) {
        int i, j,k,x=4;

        for (i = 1; i <=9; i=i+2) {

            for (k = 1;k <=x; k++)
            {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");

            }
            --x;
            System.out.println();
        }
    }
}

