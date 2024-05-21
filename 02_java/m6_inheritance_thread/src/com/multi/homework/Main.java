package com.multi.homework;

public class Main {
    public static void main(String[] args) {
        Korean korean = new Korean("비빔밥", 13000);
        Japanese japanese = new Japanese("스시", 16000);
        Chinese chinese = new Chinese("팔보채", 20000);

        korean.order();
        korean.addSide("만두", 4000);
        japanese.order();
        japanese.dessert('y');
        chinese.order();
        
    }
}
