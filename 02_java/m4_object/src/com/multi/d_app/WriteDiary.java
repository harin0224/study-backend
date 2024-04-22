package com.multi.d_app;

import javax.swing.*;
import java.awt.*;

public class WriteDiary {
    public void open() {
        JFrame f = new JFrame();
        f.getContentPane().setBackground(Color.YELLOW);
        f.setSize(503, 458);
        f.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("오늘날짜");
        lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
        lblNewLabel.setBounds(25, 24, 145, 38);
        f.getContentPane().add(lblNewLabel);

        JTextField t1 = new JTextField();
        t1.setBackground(Color.GREEN);
        t1.setFont(new Font("굴림", Font.BOLD, 30));
        t1.setBounds(197, 24, 267, 38);
        f.getContentPane().add(t1);

        JLabel lblNewLabel_2 = new JLabel("오늘제목");
        lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 30));
        lblNewLabel_2.setBounds(25, 96, 145, 38);
        f.getContentPane().add(lblNewLabel_2);

        JTextField t2 = new JTextField();
        t2.setFont(new Font("굴림", Font.BOLD, 30));
        t2.setColumns(10);
        t2.setBackground(Color.GREEN);
        t2.setBounds(197, 96, 267, 38);
        f.getContentPane().add(t2);

        JLabel lblNewLabel_2_1 = new JLabel("오늘내용");
        lblNewLabel_2_1.setFont(new Font("굴림", Font.BOLD, 30));
        lblNewLabel_2_1.setBounds(25, 168, 145, 38);
        f.getContentPane().add(lblNewLabel_2_1);

        JTextArea t3 = new JTextArea();
        t3.setFont(new Font("Monospaced", Font.BOLD, 30));
        t3.setBackground(Color.GREEN);
        t3.setBounds(197, 180, 267, 134);
        f.getContentPane().add(t3);

        JButton btnSave = new JButton("파일에 일기 저장");
        btnSave.setBackground(Color.MAGENTA);
        btnSave.setFont(new Font("굴림", Font.BOLD, 30));
        btnSave.setBounds(44, 337, 387, 70);
        f.getContentPane().add(btnSave);

        f.setVisible(true);
    }
}
