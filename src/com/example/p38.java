package com.example;

public class p38 {
    public static void main(String[] args) {
        int i, j;

        for (i = 1; i <= 5; i++) {
            //System.out.print(i);
            for (j = 1; j <= i; j++) {
                if (j % 2 == 0)
                    System.out.print(0);
                else
                    System.out.print(1);
            }
            System.out.println();
        }
    }
}
