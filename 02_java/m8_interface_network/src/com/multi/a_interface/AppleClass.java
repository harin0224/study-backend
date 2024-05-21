package com.multi.a_interface;

public abstract class AppleClass extends PhoneClass{
    // 일반 메소드를 3개 이미 가지고 시작
    // call, internet, text
    // pay를 나라별로 다르게 처리하려고 추상 메소드로 구현
    public abstract void pay();

}
