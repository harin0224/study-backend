package com.multi.homework;

import java.util.Scanner;

public class Exec07_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("몸무게: ");
        double weight = scan.nextDouble();
        System.out.println("신장: ");
        double height = scan.nextDouble();
        double bmi = weight / (height * height);

        System.out.println("bmi: " + bmi);

    }
}
