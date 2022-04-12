package com.example;

public class p19 {
    public static void main(String[] args) {
        int i, j;
        for (i = 9; i >=5; i--) {
            System.out.print("@");
            for (j = 9; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
