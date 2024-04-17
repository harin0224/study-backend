package com.multi.e_gui.homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exec01 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(450, 600);
        FlowLayout flow = new FlowLayout();
        f.getContentPane().setLayout(flow);
        
        JButton btn1 = new JButton("1번");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "당첨입니다.");
            }
        });
        f.getContentPane().add(btn1);

        for (int i = 2; i < 51; i++) {
            JButton btn2 = new JButton(i + "번");
            f.getContentPane().add(btn2);
            btn2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(f, "꽝꽝꽝");
                }
            });
            f.setVisible(true);
        }
    }
}
