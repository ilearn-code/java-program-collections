package com.example;

public class p23 {
    public static void main(String[] args) {
        int i, j, x = 0;
        for (i = 1; i <= 4; i++) {
            //System.out.print(i);
            for (j = 1; j <= i; j++) {
                System.out.print(x);
                x++;
            }
            System.out.println();
        }
    }
}
