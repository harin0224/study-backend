package com.multi.homework;

import javax.swing.*;
import java.util.Scanner;

public class Exec01_1 extends JFrame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scan.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scan.nextInt();

        int sum = num1 + num2;
        int dif = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;

        System.out.println("덧셈: " + sum);
        System.out.println("뺄셈: " + dif);
        System.out.println("곱셈: " + mul);
        System.out.println("나눗셈: " + div);
    }
}
