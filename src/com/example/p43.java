package com.example;

public class p43 {
    public static void main(String[] args) {
        int i, j;

        for (i = 5; i>=1; i--) {
            //System.out.print(i);
            for (j = 5; j >=1; j--) {
                if (i>=j)
                    System.out.print(i);
                else
                    System.out.print(j);
            }
            System.out.println();
        }
    }
}
