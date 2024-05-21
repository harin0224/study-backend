package com.multi.b_thread;

import javax.swing.*;
import java.util.Random;

public class CarRacing extends JFrame {
    public CarRacing() {
        setTitle("자동차 경주");
        setSize(1400, 600);
        setLayout(null);// absolute layout
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Car car1 = new Car("images/car01.png", 100, 0);
        Car car2 = new Car("images/car02.png", 100, 150);
        Car car3 = new Car("images/car03.png", 100, 300);

        car1.start();
        car2.start();
        car3.start();



        setVisible(true);
    }
    // 내부 클래스, 클래스 외부에서 다른 클래스 생성은 불가능
    // default 클래스 형태로는 가능. (public은 한개만 있어야 함)
    public class Car extends Thread {
        private int x, y;
        private JLabel label;

        public Car(String file, int x, int y) {
            ImageIcon icon = new ImageIcon(file);
            label = new JLabel(icon);

            this.x = x;
            this.y = y;
            label.setBounds(x, y, 150,150);
            add(label);
        }

        @Override
        public void run() {
            Random r = new Random();
            for (int i = 0; i < 200; i++) {
                int move = r.nextInt(50); // 0~49
                x = x + move;
                label.setBounds(x, y, 150, 150);
                try {
                    Thread.sleep(500);      // 이상 없으면 그냥 실행
                } catch (InterruptedException e) {
                    e.printStackTrace();        // 에러 찍기
                }

            }
        }
    }

    public static void main(String[] args) {
        // 생성자가 기본 생성자를 호출
        CarRacing car = new CarRacing();
    }
}
