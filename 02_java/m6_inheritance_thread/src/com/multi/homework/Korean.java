package com.multi.homework;

public class Korean extends Food {
    private String side;
    private int sidePrice;
    public Korean(String name, int price) {
        super(name, price);
    }

    public void order() {
        System.out.println("한식 주문");
        super.order();
    }

    public void addSide(String side, int price) {
        System.out.println(side + " 추가는 " + price + "원 입니다.");
    }
}
