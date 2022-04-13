package com.example;

public class p49 {
    public static void main(String[] args) {
        int i, j;

        for (i = 1; i<=3; i++) {
            //System.out.print(i);
            int s=0;
            for (j = i; j<=i+2; j++) {
                 s=s+j;
                System.out.print(j);
            }
            System.out.println(s);
        }
    }
}
