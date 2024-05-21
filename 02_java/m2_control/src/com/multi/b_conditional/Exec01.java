package com.multi.b_conditional;

import java.util.Date;

public class Exec01 {
    public static void main(String[] args) {
        Date date = new Date();
        int month = date.getMonth();
        int day = date.getDay();
        System.out.println(day);

        switch (day){
            case 0:
            case 6:
                System.out.println("놀자");
                break;
            default:
                System.out.println("공부하자");
                break;
        }
    }
}
