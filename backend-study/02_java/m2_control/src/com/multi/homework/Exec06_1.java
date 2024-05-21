package com.multi.homework;

import java.util.Date;

public class Exec06_1 {
    public static void main(String[] args) {
        Date date = new Date();
        int year = date.getYear() + 1900;
        if (year >= 2000) {
            System.out.println("밀레니엄 세대시군요");
        } else {
            System.out.println("밀레니엄 세대가 아니시군요");
        }
    }
}
