package com.multi.b_thread;

import java.util.Timer;

public class Run {
    public static void main(String[] args) {
//        Thread1 t1 = new Thread1();
//        Thread2 t2 = new Thread2();
//
//        Thread th = new Thread(t2); // runnable target
//
////        t1.run();
////        t2.run();
//
//        t1.start();
//        th.start();
//
//        System.out.println("main 종료");


        // 쓰레드 테스트2
        Timer timer = new Timer();
        TimerTest timerTest = new TimerTest();

        System.out.println("10초동안 게임 불가");
        timer.schedule(timerTest, 1000);

        System.out.println("10초가 카운트 되는중 입니다.");
        System.out.println("main 코드는 종료되었습니다.");


    }
}
