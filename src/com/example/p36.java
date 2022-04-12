package com.example;

public class p36 {
    public static void main(String[] args) {
        char i, j;

        for (i = 'D'; i >= 'A'; i--) {
            //System.out.print(i);
            int x=1;
            for (j = 'A'; j <= i; j++) {
                System.out.print(j);
                System.out.print(x++);
            }
            System.out.println();
        }
    }
}
