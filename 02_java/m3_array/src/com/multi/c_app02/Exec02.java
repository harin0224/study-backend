package com.multi.c_app02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exec02 {
    static int now = 2; // 현재 위치를 보여줄 인덱스.
    public static void main(String[] args) {
        // 영화제목목록, 이미지목록, 감독목록, 평점목록
        String[] titles = { "다만 악에서", "오케이 마담", "테넷", "짱구는 못말려", "캐리비안 해적" };
        String[] images = { "다만.png", "오케이.png", "테넷.png", "짱구.png", "해적.png" };
        String[] directors = { "홍원찬", "오케이감독", "크리스토퍼 놀란", "하시모토 마사카즈", "마리트 모움" };

        double[] rates = { 7.79, 6.61, 8.88, 9.99, 5.65 };

        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("나의 영화앨범");
        f.setSize(600, 480);
        f.getContentPane().setLayout(null);
        
        // 이미지
        JLabel img = new JLabel();
        img.setIcon(new ImageIcon("img/" + images[now]));
        img.setBounds(96, 123, 195, 270);
        f.getContentPane().add(img);

        // 감독 표시 레이블 생성 및 설정
        JLabel lblNewLabel_2 = new JLabel("감독");
        lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 29));
        lblNewLabel_2.setBounds(303, 140, 67, 43);
        f.getContentPane().add(lblNewLabel_2);

        JLabel director = new JLabel(directors[now]);
        director.setForeground(Color.RED);
        director.setFont(new Font("굴림", Font.BOLD, 25));
        director.setBounds(303, 182, 203, 48);
        f.getContentPane().add(director);


        // 평점 표시 레이블 생성 및 설정
        JLabel lblNewLabel_2_1 = new JLabel("평점");
        lblNewLabel_2_1.setFont(new Font("굴림", Font.BOLD, 29));
        lblNewLabel_2_1.setBounds(303, 258, 67, 43);
        f.getContentPane().add(lblNewLabel_2_1);


        JLabel rate = new JLabel(rates[now] + "");
        rate.setForeground(Color.RED);
        rate.setFont(new Font("굴림", Font.BOLD, 25));
        rate.setBounds(303, 300, 179, 48);
        f.getContentPane().add(rate);

        // 영화 제목을 표시할 버튼 생성 및 설정
        JButton title = new JButton(titles[now]);
        title.setForeground(Color.WHITE);
        title.setBackground(Color.BLUE);
        title.setFont(new Font("굴림", Font.BOLD, 45));
        title.setBounds(94, 10, 400, 77);
        f.getContentPane().add(title);

        JButton btn1 = new JButton("<");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (now == 0) {
                    now = 5;
                }
                now--;
                title.setText(titles[now]);

                ImageIcon icon = new ImageIcon("img/" + images[now]);
                img.setIcon(icon);
                director.setText(directors[now]);
                rate.setText(rates[now] + "");
            }
        });

        btn1.setBackground(Color.GREEN);
        btn1.setFont(new Font("굴림", Font.BOLD, 40));
        btn1.setBounds(0, 0, 84, 438);
        f.getContentPane().add(btn1);


        JButton btn2 = new JButton(">");
        btn2.setFont(new Font("굴림", Font.BOLD, 40));
        btn2.setBackground(Color.GREEN);
        btn2.setBounds(506, 0, 84, 438);
        f.getContentPane().add(btn2);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (now == 4) {
                    now = -1;
                }
                now++; // 0
                title.setText(titles[now]);

                ImageIcon icon = new ImageIcon("img/" + images[now]);
                img.setIcon(icon);
                director.setText(directors[now]);
                rate.setText(rates[now] + "");
            }
        });



        f.setVisible(true);

    }
}
