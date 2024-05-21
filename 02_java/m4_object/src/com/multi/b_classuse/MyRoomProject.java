package com.multi.b_classuse;

import com.multi.a_classmake.Dog;
import com.multi.a_classmake.Phone;
import com.multi.a_classmake.Tv;

import java.awt.*;

public class MyRoomProject {
    public static void main(String[] args) {
        // 전화기 한대 넣기
        Phone p1 = new Phone();
        p1.makeCall();

        p1.setSize(-100);
        System.out.println(p1.getSize());

//        p1.size = 100;
//        p1.speaker = "애플";
//
//        System.out.println(p1.size);
//        System.out.println(p1.speaker);

        Phone p2 = new Phone();
        p2.setSize(9);
        p2.setSpeaker("메론사");
        p2.takePhoto();
        System.out.println(p2.getSize());

        Dog dog = new Dog();
        dog.setColor("황색");
        dog.setField("진돗개");
        dog.wagTail();
        System.out.println(dog.getColor());

        Tv tv = new Tv();
        tv.setCh(1);
        tv.setVol(25);
        tv.setOnOff(true);
        //tv.tvonOff();
        System.out.println(tv.toString());
    }
}
