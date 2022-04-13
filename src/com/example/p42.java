package com.example;

public class p42 {
    public static void main(String[] args) {
        int i, j;

        for (i = 1; i <= 5; i++) {
            //System.out.print(i);
            for (j = 1; j <= 6; j++) {
                if (j==1||j==6||i==1||i==5)
                    System.out.print("#");
                else
                    System.out.print('.');
            }
            System.out.println();
        }
    }
}
