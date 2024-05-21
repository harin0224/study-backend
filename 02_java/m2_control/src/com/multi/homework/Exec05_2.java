package com.multi.homework;

import java.util.Date;

public class Exec05_2 {
    public static void main(String[] args) {
        Date date = new Date();
        int month = date.getMonth() + 1;
        switch (month){
            case 2:
                System.out.println("28일까지");
                break;
            case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31일까지");
                break;
            default:
                System.out.println("30일까지");
                break;
        }
    }
}
