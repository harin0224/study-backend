package com.multi.homework;

import java.util.Date;

public class Exec06_2 {
    public static void main(String[] args) {
        Date date = new Date();
        int day = date.getDay();
        switch (day) {
            case 0 : case 6 :
                System.out.println("쉬~~~~~~~~~자");
                break;
            case 1 : case 2 : case 3 : case 4 : case 5 :
                System.out.println("열~~심히 공부하자");
                break;
        }

    }
}
