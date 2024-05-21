package com.multi.homework;

import java.util.Scanner;

public class Exec07_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("현재까지의 누적 포인트:");
        double point = scan.nextDouble();
        System.out.print("추가 포인트: ");
        double sumPoint = scan.nextDouble();
        double finalPoint = point + sumPoint;

        System.out.println("최종 포인트는 " + finalPoint);
    }
}
