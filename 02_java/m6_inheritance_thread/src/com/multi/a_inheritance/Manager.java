package com.multi.a_inheritance;

public class Manager extends Employee {

    private int bonus;
    @Override
    public String toString() {
        return super.toString();
    }

    public void test(){
        System.out.println("이름은" + super.name);
        System.out.println("주소는" + super.address);
        System.out.println("월급은" + super.salary);
        // System.out.println("test" + super.rrn); private 이어서 접근할 수 없다.
    }
}
