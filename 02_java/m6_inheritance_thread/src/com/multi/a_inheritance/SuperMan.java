package com.multi.a_inheritance;

public class SuperMan extends Man{
    private boolean isFly;
    public SuperMan(String name, int age, int power, boolean isFly){
        super(name, age, power);
        this.isFly = isFly;
    }
}
