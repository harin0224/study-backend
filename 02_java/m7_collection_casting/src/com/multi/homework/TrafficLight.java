package com.multi.homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrafficLight {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.getContentPane().setBackground(Color.BLACK);
        f.setSize(618,692);
        f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        JButton btn1 = new JButton("빨간 신호");
        btn1.setFont(new Font("굴림", Font.BOLD, 30));
        btn1.setBackground(Color.RED);
        f.getContentPane().add(btn1);
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JLabel img = new JLabel();
                ImageIcon icon = new ImageIcon("img/r.jpg");
                img.setIcon(icon);
                f.add(img);
                f.setVisible(true);
            }
        });

        JButton btn2 = new JButton("노란 신호");
        btn2.setFont(new Font("굴림", Font.BOLD, 30));
        btn2.setBackground(Color.YELLOW);
        f.getContentPane().add(btn2);
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JLabel img = new JLabel();
                ImageIcon icon = new ImageIcon("img/y.jpg");
                img.setIcon(icon);
                f.add(img);
                f.setVisible(true);
            }
        });

        JButton btn3 = new JButton("초록 신호");
        btn3.setFont(new Font("굴림", Font.BOLD, 30));
        btn3.setBackground(Color.GREEN);
        f.getContentPane().add(btn3);
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JLabel img = new JLabel();
                ImageIcon icon = new ImageIcon("img/g.jpg");
                img.setIcon(icon);
                f.add(img);
                f.setVisible(true);
            }
        });
        f.setVisible(true);
    }
}
