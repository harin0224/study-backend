package com.multi.homework;

public class Japanese extends Food {

    private char dessert;
    public Japanese(String name, int price) {
        super(name, price);
    }

    public void order() {
        System.out.println("일식 주문");
        super.order();
    }

    public void dessert(char dessert) {
        if (dessert == 'y') {
            System.out.println("디저트를 추가로 제공합니다.");
        }
        else System.out.println("디저트를 제공하지 않습니다.");
    }
}
