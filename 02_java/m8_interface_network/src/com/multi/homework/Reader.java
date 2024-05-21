package com.multi.homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Reader {
    public static void main(String[] args) {
        JFrame f = new JFrame("문자 판독기");
        f.setSize(300, 500);
        f.setLayout(new FlowLayout());

        Font fond = new Font("궁서", Font.BOLD, 30);

        JLabel label = new JLabel("문장을 넣으세요.");
        JTextArea area = new JTextArea(7, 10);
        area.setAutoscrolls(true);
        area.setLineWrap(true);
        
        JButton b1 = new JButton("글자수 카운트");
        JButton b2 = new JButton("배경색 바꾸기");
        JButton b3 = new JButton("글자색 바꾸기");

        label.setFont(fond);
        area.setFont(fond);
        b1.setFont(fond);
        b2.setFont(fond);
        b3.setFont(fond);

        f.add(label);
        f.add(area);
        f.add(b1);
        f.add(b2);
        f.add(b3);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String text = area.getText();
                JOptionPane.showMessageDialog(f, "글자수는 " + text.length());
                area.setText("");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                area.setBackground(Color.YELLOW);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                area.setForeground(Color.red);
            }
        });
        f.setVisible(true);
        
    }
}
