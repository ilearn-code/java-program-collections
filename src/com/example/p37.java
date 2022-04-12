package com.example;

public class p37 {
    public static void main(String[] args) {
        int i, j,x=1;

        for (i = 5; i >= 1; i--) {
            //System.out.print(i);
            for (j = 1; j <= i; j++) {
                System.out.print(j*x);

            }x++;
            System.out.println();
        }
    }
}
