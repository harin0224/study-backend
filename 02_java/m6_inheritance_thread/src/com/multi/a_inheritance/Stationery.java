package com.multi.a_inheritance;

public class Stationery {
    private int price;
    private String company;

    public void buy(){
        System.out.println("학용품을 사다.");
    };
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

}
