package com.example;

public class p31 {
    public static void main(String[] args) {
        char i, j;

        for (i = 'D'; i >= 'A'; i--) {
           // System.out.print('*');
            for (j = i; j <= 'E';j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
