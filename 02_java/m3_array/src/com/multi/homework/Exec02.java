package com.multi.homework;

import javax.swing.*;
import java.awt.*;

public class Exec02 {
    static int jjamppongCount  = 0;
    static int udonCount  = 0;
    static int jajangCount  = 0;
    static int total = 0;
    static ImageIcon[] icons = new ImageIcon[4];
    static String[] img = {"짜장", "우동", "짬뽕"};

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            icons[i+1] = new ImageIcon("img/" + img[i] + ".jpg");
        }

        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800, 600);
        f.getContentPane().setBackground(new Color(143, 188, 143));
        f.getContentPane().setLayout(null);

        JTextField text = new JTextField();
        text.setForeground(Color.BLUE);
        text.setBackground(Color.WHITE);
        text.setFont(new Font("굴림", Font.BOLD, 15));
        text.setBounds(470, 10, 300, 60);
        f.getContentPane().add(text);

        JTextField rtext = new JTextField();
        rtext.setForeground(Color.RED);
        rtext.setBackground(Color.WHITE);
        rtext.setFont(new Font("굴림", Font.BOLD, 35));
        rtext.setBounds(350, 485, 300, 60);
        f.getContentPane().add(rtext);

        JLabel img = new JLabel();
        img.setBounds(60, 85, 600, 400);
        f.getContentPane().add(img);

        createButton(f, "짜장", Color.PINK, 10, 10, 1, img, text, rtext, 7000);
        createButton(f, "우동", Color.YELLOW, 140, 10, 2, img, text, rtext, 6000);
        createButton(f, "짬뽕", new Color(138, 43, 226), 270, 10, 3, img, text, rtext, 8000);

        JLabel label = new JLabel("개수");
        label.setFont(new Font("굴림", Font.BOLD, 20));
        label.setBounds(420, 30, 60, 30);
        f.getContentPane().add(label);

        JLabel labelTotal = new JLabel("지불할 총 금액");
        labelTotal.setFont(new Font("굴림", Font.BOLD, 30));
        labelTotal.setBounds(100, 500, 250, 40);
        f.getContentPane().add(labelTotal);

        f.setVisible(true);
    }

    private static void createButton(JFrame frame, String name, Color bgColor, int x, int y, int flag, JLabel imgLabel, JTextField text, JTextField rtext, int price) {
        JButton button = new JButton(name);
        button.setBackground(bgColor);
        button.setBounds(x, y, 120, 60);
        button.setFont(new Font("굴림", Font.BOLD, 30));
        button.addActionListener(e -> {
            imgLabel.setIcon(icons[flag]);
            switch (flag) {
                case 1 -> jajangCount++;
                case 2 -> udonCount++;
                case 3 -> jjamppongCount++;
            }
            text.setText("짜장:" + jajangCount  + "개,짬뽕:" + jjamppongCount  + "개,우동:" + udonCount  + "개,총->" + (jajangCount  + jjamppongCount  + udonCount ) + "개");
            total += price;
            rtext.setText(total + "원");
        });
        frame.add(button);
    }
}