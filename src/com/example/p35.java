package com.example;

public class p35 {
    public static void main(String[] args) {
        char i, j;

        for (i = 'A'; i <= 'E'; i++) {
            //System.out.print(i);
            for (j = 'E'; j >=i; j--) {
                System.out.print(j+"*");
            }
            System.out.println();
        }
    }
}
