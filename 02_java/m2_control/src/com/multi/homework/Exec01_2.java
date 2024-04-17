package com.multi.homework;

import java.util.Scanner;

public class Exec01_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("현재 온도를 입력하세요: ");
        double tem = scan.nextDouble();

        if(tem >25) {
            System.out.println("너무 더워요.");
        }
        else System.out.println("괜찮아요.");
    }
}
