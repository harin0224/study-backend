package com.multi.e_gui;

import javax.swing.*;
import java.awt.*;

public class Exec03 {
    /*
     * 1. GUI(Graphical User Interface)란?
     * 	 - GUI는 GUI 기반 환경에서 구동시켜야 될 때만 만들고 웹에서는 html을 쓴다.
     *   - 키보드나 마우스로 들어오는 신호가 event로 동작되게 하고
     *     event를 핸들링해서 기능 구현을 함
     *   - 컨테이너 위에 컴포넌트들을 추가해서 사용함
     *
     * 2. GUI객체
     *   - AWT : OS의 컴포넌트를 그대로 사용(Java로 구현한게 X)(초기버전)
     *   - Swing : AWT보다 더 많은 종류의 컴포넌트를 제공하고 Java로 구현
     *   			(앞에 J를 붙여 AWT와 구분)
     *
     * 3. 컨테이너 객체 생성하기
     *   (1). JFrame 상속을 이용한 방법
     *   (2). 상속 받지 않고 JFrame 객체 생성하는 방법
     *
     */
    // private static JTextField textField; // static 으로 선언해야함

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.ORANGE);
        f.setSize(500, 500);
        f.getContentPane().setLayout(null);

        //이름
        JLabel nameLabel = new JLabel("이름");
        nameLabel.setFont(new Font("굴림", Font.BOLD, 20));
        nameLabel.setBounds(25, 40, 105, 43);
        f.getContentPane().add(nameLabel);
        
        //textField = new JTextField();       // static 안에서 사용
        JTextField textField = new JTextField();
        textField.setFont(new Font("굴림", Font.BOLD, 20));
        textField.setBounds(137, 40, 284, 37);
        f.getContentPane().add(textField);

        
        //전화번호
        JLabel nameLabel2 = new JLabel("전화번호");
        nameLabel2.setFont(new Font("굴림", Font.BOLD, 20));
        nameLabel2.setBounds(25, 115, 105, 43);
        f.getContentPane().add(nameLabel2);

        //textField = new JTextField();       // static 안에서 사용
        JTextField textField2 = new JTextField();
        textField2.setForeground(Color.BLUE);
        textField2.setFont(new Font("굴림", Font.BOLD, 20));
        textField2.setBounds(137, 115, 284, 37);
        f.getContentPane().add(textField2);

        //주소
        JLabel nameLabel3 = new JLabel("주소");
        nameLabel3.setFont(new Font("굴림", Font.BOLD, 20));
        nameLabel3.setBounds(25, 190, 105, 43);
        f.getContentPane().add(nameLabel3);

        //textField = new JTextField();       // static 안에서 사용
        JTextField textField3 = new JTextField();
        textField3.setForeground(Color.BLUE);
        textField3.setFont(new Font("굴림", Font.BOLD, 20));
        textField3.setBounds(137, 190, 284, 37);
        f.getContentPane().add(textField3);

        // 확인 취소 버튼 JButton
        JButton button1 = new JButton("확인");
        button1.setFont(new Font("굴림", Font.BOLD, 20));
        button1.setBounds(68, 305, 125, 43);
        f.getContentPane().add(button1);

        JButton button2 = new JButton("취소");
        button2.setFont(new Font("굴림", Font.BOLD, 20));
        button2.setBounds(237, 305, 125, 43);
        f.getContentPane().add(button2);

        f.setVisible(true);
    }
}
