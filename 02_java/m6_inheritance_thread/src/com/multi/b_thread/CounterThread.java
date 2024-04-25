package com.multi.b_thread;

public class CounterThread extends Thread{
    @Override   // 어노테이션
    public void run() {
        for (int i = 20; i >= 0; i--){
            System.out.println("===>카운트: " + i);

        try {   // 예외 발생 시 처리
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            i = -1; // for 문 빠져나가게 만들기
            // 인터럽트를 발생시켜서 그 때의 예외처리
        }
        }
    }
}
