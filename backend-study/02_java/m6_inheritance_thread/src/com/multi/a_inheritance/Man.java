package com.multi.a_inheritance;

public class Man extends Human{
    private int power;

    public Man(String name, int age, int power){
        super(name, age);
        this.power = power;
    }

    public void run(){
        super.eat();
        System.out.println("Man is running");
    }
}
