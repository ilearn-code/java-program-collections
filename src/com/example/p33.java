package com.example;

public class p33 {
    public static void main(String[] args) {
        char i, j;

        for (i = 'w'; i <= 'z'; i++) {
            //System.out.print(i);
            for (j = 'w'; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
