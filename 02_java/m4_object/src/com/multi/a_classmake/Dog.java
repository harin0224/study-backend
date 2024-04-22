package com.multi.a_classmake;

public class Dog {
    private String color;
    private String field;



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }

    public void wagTail(){
        System.out.println("강아지가 꼬리를 흔든다.");
    }
    public void bark(){
        System.out.println("강아지가 멍멍 짖는다.");
    }

    @Override
    public String toString() {

        return null;
    }


}


