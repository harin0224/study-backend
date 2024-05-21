package com.multi.homework;

import java.util.Scanner;

public class Exec04_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sub = "";
        System.out.println("당신이 좋아하는 과목은?");
        sub = scan.nextLine();
        if (sub.equals("java")) System.out.println("JSP로 점프");
        else if (sub.equals("python")) System.out.println("장고로 점프");
        else System.out.println("무조건 열심히!!");
        System.out.println(sub);
    }
}
