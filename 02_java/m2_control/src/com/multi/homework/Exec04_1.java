package com.multi.homework;

import java.util.Scanner;

public class Exec04_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scan.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scan.nextInt();

        if (num1 > num2) System.out.println("첫 번째 숫자가 더 큽니다.");
        else if (num1 < num2) System.out.println("두 번째 숫자가 더 큽니다.");
        else System.out.println("두 숫자가 같습니다.");

    }

}
