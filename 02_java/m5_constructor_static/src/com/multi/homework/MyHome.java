package com.multi.homework;

public class MyHome {
    public static void main(String[] args) {
        Daughter d1 = new Daughter("홍길순", "여");
        Daughter d2 = new Daughter("홍길진", "여");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println("딸은 총 " + Daughter.count + "명이다.");
        System.out.println("아빠의 지갑에 남은 돈은 " + Daughter.fathersWallet + "원이다.");
    }
}

