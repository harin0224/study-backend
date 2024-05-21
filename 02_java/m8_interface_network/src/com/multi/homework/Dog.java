package com.multi.homework;

public class Dog extends Pet {
    @Override
    public void eat() {
        System.out.println("사료를 먹습니다.");
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("강아지가 뛰어다닙니다.");
    }
}
