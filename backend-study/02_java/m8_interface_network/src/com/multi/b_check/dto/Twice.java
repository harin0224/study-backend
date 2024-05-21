package com.multi.b_check.dto;

public class Twice implements Singer{
    @Override
    public void sing() {
        System.out.println("노래");
    }

    @Override
    public void compose() {
        System.out.println("작곡");
    }

    @Override
    public void dance() {
        System.out.println("춤");
    }

}
