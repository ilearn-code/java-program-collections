package com.example;

public class p34 {
    public static void main(String[] args) {
        char i, j;

        for (i = 'E'; i >= 'A'; i--) {
            //System.out.print(i);
            for (j = 'A'; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
