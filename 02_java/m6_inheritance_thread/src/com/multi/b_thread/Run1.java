package com.multi.b_thread;

import java.util.Scanner;

public class Run1 {
    public static void main(String[] args) {
        CounterThread count = new CounterThread();
        count.start();
        // count.run(); 하면 안되는 이유???
        // 뭐 하면 그냥 메모리에 올라가는거라고 안된다했는데 못들음
        Scanner sc = new Scanner(System.in);
        System.out.println("아무 값이나 입력하세요");
        // 인터럽트 발생
        String input = sc.nextLine();

        System.out.println("입력 올라감: " + input);
        count.interrupt();
    }
}
