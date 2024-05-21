package com.multi.homework;

public class Daughter {
    String name;
    String gender;
    static int fathersWallet = 50000;
    static int count = 0;

    public void WatchTv(){
    }

    Daughter(String name, String gender){
        this.name = name;
        this.gender = gender;
        count ++;
        fathersWallet = fathersWallet - 1000;
    }


    @Override
    public String toString() {
        return "이름:" + name + ", 성별: " + gender;}
}
