package com.multi.b_thread;

public class ImageThread extends Thread {
    @Override
    public void run() {
        String[] list = {"1.png", "2.png", "3.png", "4.png", "5.png"};
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
            try {
                Thread.sleep(9000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
