package com.multi.c_static;

import javax.swing.*;
import java.awt.*;

public class counter {
    public static void main(String[] args) {
        JFrame f = new JFrame("나의 카운터 프로그램");

        JButton plus = new JButton("1더하기");
        JButton reset = new JButton("0으 로 초기화");
        JButton minus = new JButton("1빼기");
        JLabel number = new JLabel("0");

        number.setForeground(Color.red);

        Font font = new Font("궁서", Font.BOLD, 15);
        plus.setFont(font);
        reset.setFont(font);
        minus.setFont(font);

        number.setFont(new Font("궁서", Font.BOLD, 150));

        f.add(plus);
        f.add(reset);
        f.add(minus);
        f.add(number);
    }
    //일반메서드는 객체생성후, "주소로 접근"해서 호출해야한다.!!
//일반메서드는 객체생성후, 호출(사용)할 수 있다.
//평균을 객체생성과 상관없이 아무때나 구하고 싶다.!!
//객체생성과 상관없이 기능을 정의하고 싶으면, static!!으로 만들어야 한다.
}
