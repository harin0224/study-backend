package com.multi.a_interface;

public class PhoneMain {
    public static void main(String[] args) {
        // 인터페이스는 객체 생성 불가능
        // PhoneInterface p = new PhoneInterface();
        // 추상 클래스도 객체 생성 불가능
        // PhoneClass p = new PhoneClass();
        
        
        PhoneInterface p = new PhoneClass();

    }
}
