package com.example;

public class p62 {
    public static void main(String[] args) {
        int i, j, k, x = 4, l;
        for (i = 1; i <= 5; i++) {
            for (k = 0; k <= x; k++) {
                System.out.print(" ");
            }

            for (j = 1; j <= i; j++) {
                System.out.print(j);

            }


            for (l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
            --x;
            System.out.println();
        }
        x = 1;
        for (i = 4; i >= 1; i--) {
            for (k = 0; k <= x; k++) {
                System.out.print(" ");
            }

            for (j = 1; j <= i; j++) {
                System.out.print(j);

            }


            for (l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
            ++x;
            System.out.println();


        }
    }
}


