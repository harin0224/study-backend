package com.multi.a_inheritance;

public class Pen extends Stationery {
    private int thick;
    public void write(){
        System.out.println("글을 쓰다.");
    }
    public int getThick() {
        return thick;
    }
    public void setThick(int thick) {
        this.thick = thick;
    }
    @Override
    public String toString() {
        return "Pen [price=" + getPrice() + ", company=" + getCompany() + ", thick=" + thick + "]";
    }
}
