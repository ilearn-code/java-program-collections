package com.example;

public class p28 {
    public static void main(String[] args) {
        char i, j;

        for (i = 'A'; i <= 'E'; i++) {
            //System.out.print(i);
            for (j = 'A'; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
