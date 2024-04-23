package com.multi.a_constructor;

public class Account {
    private String name;
    private String field;
    private int money;

    public Account() {} // 기본형 생성자

    public Account(String name, String field) {
        this.name = name;
        this.field = field;
    }
    public Account(String name, String field, int money) {
        this(name, field);  // 위의 생성자 사용한 것
//        this.name = name;
//        this.field = field;
        this.money = money;
    }

    public String getField(){return field;}
    public void setField(String field){this.field = field;}
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public int getMoney(){return money;}
    public void setMoney(int money){this.money = money;}
}
