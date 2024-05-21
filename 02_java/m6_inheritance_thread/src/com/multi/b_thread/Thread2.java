package com.multi.b_thread;

//  .Runnable 인터페이스 구현
public class Thread2 implements Runnable { // abstract
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("감소: " + i);
        }
    }

}
