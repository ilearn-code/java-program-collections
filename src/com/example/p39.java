package com.example;

public class p39 {
    public static void main(String[] args) {
        int i, j,x=1;

        for (i = 1; i <= 5; i++) {
            //System.out.print(i);
            for (j = 1; j <= i; j++) {
                System.out.print(x);
                if (x == 0) {

                    x = 1;
                } else if(x==1){

                    x = 0;
                }
            }
            System.out.println();
        }
    }
}
