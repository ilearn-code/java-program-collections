package com.example;

public class p22 {
    public static void main(String[] args) {
        int i, j;
        for (i = 5; i <= 9; i++) {
            System.out.print("*");
            for (j = i; j >= 5; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

