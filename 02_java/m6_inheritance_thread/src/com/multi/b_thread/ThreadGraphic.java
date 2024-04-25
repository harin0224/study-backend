package com.multi.b_thread;

import javax.swing.*;
import java.awt.*;

public class ThreadGraphic extends JFrame {
    JLabel count, image, day;
    CounterThread2 count2;
    TimeThread2 day2;
    ImageThread2 image2;

    public ThreadGraphic() {
        count = new JLabel("카운터");
        image = new JLabel("");
        day = new JLabel("시각");
        Font font = new Font("궁서", Font.BOLD, 30);
        count.setFont(font);
        day.setFont(font);

        add(count, BorderLayout.WEST);
        add(image, BorderLayout.EAST);
        add(day, BorderLayout.SOUTH);


    }




    class ImageThread extends Thread {
        @Override
        public void run() {
            for(int i = 10; i >= 0; i--){

            }

        }


    }

    class CounterThread2 extends Thread {
        @Override
        public void run() {
            for(int i = 10; i >= 0; i--){
                count.setText("카운트=> " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    dispose();
                    System.out.print("종료 카운트 CounterThread2");
                }

                if(i == 0){
                    JOptionPane.showMessageDialog(null, "사용시간이 다되었습니다.");
                    image2.interrupt();
                    day2.interrupt();
                }
            }
        }

    }

    class TimeThread extends Thread {

    }

    class TimeThread2 extends Thread {
        @Override
        public void run() {

        }
}

    class ImageThread2 extends Thread {

    }

    public static void main(String[] args) {
        ThreadGraphic tg = new ThreadGraphic();
    }



}
