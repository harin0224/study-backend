package com.multi.homework;

public class Chinese extends Food {
    public Chinese(String name, int price) {
        super(name, price);
    }
    public void order() {
        System.out.println("중식 주문");
        super.order();
    }

}
