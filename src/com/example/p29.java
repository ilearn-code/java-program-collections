package com.example;

public class p29 {
    public static void main(String[] args) {
        char i, j;

        for (i = 'D'; i >= 'A'; i--) {
            //System.out.print(i);
            for (j = 'D'; j >=i; j--) {
                System.out.print(i);
            }
            System.out.println("*");
        }
    }
}
