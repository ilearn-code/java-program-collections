package com.example;

public class p44 {
    public static void main(String[] args) {
        int i, j;

        for (i = 1; i<=5; i++) {
            //System.out.print(i);
            for (j = 1; j <=5; j++) {
                if (i==j)
                    System.out.print('*');
                else
                    System.out.print(i);
            }
            System.out.println();
        }
    }
}
