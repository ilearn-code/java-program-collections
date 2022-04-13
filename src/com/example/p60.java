package com.example;

public class p60 {
    public static void main(String[] args) {
        int i,j,k,x=4;
        for (i = 1; i <= 5; i++) {
            for (k = 0; k <= x; k++)
            {System.out.print(" ");}

            for (j = 1; j <= i; j++) {
                System.out.print(j);

            }
            --x;
            System.out.println();
        }
    }
}
