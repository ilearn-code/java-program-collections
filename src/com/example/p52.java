package com.example;

public class p52 {
    public static void main(String[] args) {
        int i, j,k;

        for (i = 1; i <= 5; i++) {
            //System.out.print(i);
            for (k = i; k < 5; k++) {
                System.out.print(" ");}
                for (j = 1; j <= i; j++) {
                    System.out.print('*');
                }
                System.out.println();
            }
        }
    }


