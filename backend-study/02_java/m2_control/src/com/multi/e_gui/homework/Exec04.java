package com.multi.e_gui.homework;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Exec04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int count = 0;
        int win = 0;
        int lose = 0;
        while(true) {
            System.out.println("(0이면 가위, 1이면 바위, 2이면 보) >> ");
            int me = scanner.nextInt();
            int com = rand.nextInt(3);
            count++;
            System.out.println(me);
            System.out.println(com);

            if (com == 0) {
                switch (me) {
                    case 0:
                        System.out.println("비겼습니다.");
                        break;
                    case 1:
                        System.out.println("이겼습니다.");
                        win++;
                        break;
                    case 2:
                        System.out.println("졌습니다.");
                        break;
                }
            } else if (com == 1) {
                switch (me) {
                    case 0:
                        System.out.println("졌습니다.");
                        break;
                    case 1:
                        System.out.println("비겼습니다.");
                        break;
                    case 2:
                        System.out.println("이겼습니다.");
                        win++;
                        break;
                }
            } else {
                switch (me) {
                    case 0:
                        System.out.println("이겼습니다.");
                        win++;
                        break;
                    case 1:
                        System.out.println("졌습니다.");
                        break;
                    case 2:
                        System.out.println("비겼습니다.");
                        break;
                }
            }
            System.out.print("종료하실래요?");
            String stop = scanner.next();
            if (stop.equals("stop")) {
                System.out.print("종료합니다.");
                break;
            }
        }
        System.out.println("전체 " + count + "중에 내가 승리한 수는" + win);
    }
}
