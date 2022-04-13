package com.example;

public class p46 {
    public static void main(String[] args) {
        int i, j;

        for (i = 1; i<=5; i++) {
            //System.out.print(i);
            for (j = 1; j <=i; j++) {
                if (j%2==0)
                    System.out.print('#');
                else
                    System.out.print('*');
            }
            System.out.println();
        }
    }
}
