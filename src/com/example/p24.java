package com.example;

public class p24 {
    public static void main(String[] args) {
        int i, j, x = 9;
        for (i = 4; i >= 1; i--) {
            // System.out.print(i);
            for (j = 1; j <= i; j++) {
                System.out.print(x);
                x++;
            }
            System.out.println();
        }
    }
}
