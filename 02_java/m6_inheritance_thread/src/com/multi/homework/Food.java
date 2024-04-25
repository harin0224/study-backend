package com.multi.homework;

public class Food {
    private String name;
    private int price;

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public void order() {
        System.out.println( name + "은 " + price + "원 입니다.");
    }

    @Override
    public String toString() {
        return "Food [name=" + name + ", price=" + price + "]";
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
