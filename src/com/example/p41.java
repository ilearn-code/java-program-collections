package com.example;

public class p41 {
    public static void main(String[] args) {
        int i, j;

        for (i = 1; i<=5; i++) {
            //System.out.print(i);
            for (j = 1; j <=6; j++) {
                if (i>=j)
                    System.out.print("*");
                else
                    System.out.print("$");
            }
            System.out.println();
        }
    }
}
