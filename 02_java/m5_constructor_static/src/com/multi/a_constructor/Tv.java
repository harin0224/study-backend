package com.multi.a_constructor;

public class Tv {
    private int ch;
    private int vol;
    private boolean onOff;
    public static int count;



    public Tv() {
        super();    // 상위의 것을 가리킴
        count++;
    }

    public Tv(int ch, int vol, boolean onOff) {
        this.ch = ch;
        this.vol = vol;
        this.onOff = onOff;
        count++;
    }

    public int getCh() {
        return ch;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }

    public boolean getOnOff() {
        return onOff;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

}
