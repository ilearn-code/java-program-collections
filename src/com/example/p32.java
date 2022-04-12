package com.example;

public class p32 {
    public static void main(String[] args) {
        char i, j;

        for (i = 'D'; i >='A'; i--) {
            //System.out.print(i);
            for (j = i; j >='A'; j--) {
                System.out.print(j);
            }
            System.out.println('#');
        }
    }
}
