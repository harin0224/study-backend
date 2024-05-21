package com.multi.homework;

public class Cat extends Pet{

    @Override
    public void eat() {
        System.out.println("츄르를 먹습니다.");
    }

    @Override
    public void sound() {
        System.out.println("야옹");
    }
    
    @Override
    public void move() {
        System.out.println("고양이가 걸어다닙니다.");
    }
    
}
