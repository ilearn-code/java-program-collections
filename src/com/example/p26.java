package com.example;

public class p26 {
    public static void main(String[] args) {
        int i,j;
        char ch = 'A';
        for (i = 5; i >= 1; i--) {
            //System.out.print(i);
            for (j = 1; j <= i; j++) {
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}