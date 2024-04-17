package com.multi.c_loop;

public class Exec01 {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 10) {
            System.out.println(num);
            num++;
        }

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);
    }
}
