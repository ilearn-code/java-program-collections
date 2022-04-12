package com.example;

public class p20 {
    public static void main(String[] args) {
        int i, j;
        for (i = 5; i >=1; i--) {
            System.out.print(i);
            for (j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
