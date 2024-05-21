package com.multi.a_constructor;

public class Bank {
    public static void main(String[] args) {
        // Account acc1 = new Account(); // 기본형 생성자, 기본형 없어서 에러난다.
        // 원래는 따로 만들어줄 필요 없으나, 메개변수 있는 생성자가 있을 경우 기본 생성자 작성이 필요하다.
        Account acc1 = new Account("철수", "정기적금", 1000000);
        System.out.println(acc1);

        Account acc2 = new Account("영희", "정기적금");
        acc2.setMoney(2000000);
        System.out.println(acc2);
        System.out.println(acc1);
    }
}
