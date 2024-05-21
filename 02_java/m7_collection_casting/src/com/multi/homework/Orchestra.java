package com.multi.homework;

public class Orchestra extends Thread{
    public static void main(String[] args) {
        MusicPlayer piano = new MusicPlayer("Piano");
        MusicPlayer violin = new MusicPlayer("Violin");
        MusicPlayer cello = new MusicPlayer("Cello");

        piano.start();
        violin.start();
        cello.start();

        // 모두 종료된 뒤 박수치도록 join
        try {
            piano.join();
            violin.join();
            cello.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }System.out.println("박수");
    }
}

class Piano {
    public void play() {
        System.out.println("피아노: ♪ ♪");
    }
}

class Violin {
    public void play() {
        System.out.println("바이올린: ♫");
    }
}

class Cello {
    public void play() {
        System.out.println("첼로: ♩ ♩");
    }
}

class MusicPlayer extends Thread {
    private String instrument;
    public MusicPlayer(String instrument) {
        this.instrument = instrument;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                if (instrument.equals("Piano")) {
                    new Piano().play();
                    Thread.sleep(3000);
                } else if (instrument.equals("Violin")) {
                    new Violin().play();
                    Thread.sleep(1000);
                } else if (instrument.equals("Cello")){
                    new Cello().play();
                    Thread.sleep(5000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}