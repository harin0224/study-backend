package com.multi.a_inheritance;

public class Main {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.setPrice(1000);
        pen.setCompany("모나미");
        pen.setThick(1);

        System.out.println(pen);
    }
}