package com.multi.e_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exec04 {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.ORANGE);
        f.setSize(500, 700);
        f.getContentPane().setLayout(null);



        JLabel nameLabel = new JLabel("숫자1");
        nameLabel.setFont(new Font("굴림", Font.BOLD, 20));
        nameLabel.setBounds(25, 40, 105, 43);
        f.getContentPane().add(nameLabel);

        JTextField textField1 = new JTextField();
        textField1.setFont(new Font("굴림", Font.BOLD, 20));
        textField1.setBounds(137, 40, 284, 37);
        f.getContentPane().add(textField1);



        JLabel nameLabel2 = new JLabel("숫자2");
        nameLabel2.setFont(new Font("굴림", Font.BOLD, 20));
        nameLabel2.setBounds(25, 105, 105, 43);
        f.getContentPane().add(nameLabel2);

        JTextField textField2 = new JTextField();
        textField2.setForeground(Color.BLUE);
        textField2.setFont(new Font("굴림", Font.BOLD, 20));
        textField2.setBounds(137, 105, 284, 37);
        f.getContentPane().add(textField2);

        JLabel imgLabel = new JLabel();
        imgLabel.setIcon(new ImageIcon("src/com/multi/e_gui/Image1.gif"));
        imgLabel.setBounds(38, 241, 422, 321);
        f.getContentPane().add(imgLabel);


        JButton plus = new JButton("+");
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "플러스 버튼을 누르셨군요.");

                int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());

                f.setTitle("더한 결과는 " + (num1 + num2));
                JOptionPane.showMessageDialog(f, (num1 + num2));
                textField1.setText("");
                textField2.setText(""); // 입력한 내용 지워주는 것
            }
        });
        plus.setForeground(Color.WHITE);
        plus.setBackground(Color.GREEN);
        plus.setFont(new Font("굴림", Font.BOLD, 30));
        plus.setBounds(23, 175, 107, 56);
        f.getContentPane().add(plus);


        JButton minus = new JButton("-");
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "마이너스 버튼을 누르셨군요.");

                int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());

                f.setTitle("뺀 결과는 " + (num1 - num2));
                JOptionPane.showMessageDialog(f, (num1 - num2));
                textField1.setText("");
                textField2.setText(""); // 입력한 내용 지워주는 것
            }
        });
        minus.setForeground(Color.WHITE);
        minus.setBackground(Color.YELLOW);
        minus.setFont(new Font("굴림", Font.BOLD, 30));
        minus.setBounds(142, 175, 107, 56);
        f.getContentPane().add(minus);


        JButton mul = new JButton("*");
        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "곱하기 버튼을 누르셨군요.");

                int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());

                f.setTitle("곱한 결과는 " + (num1 * num2));
                JOptionPane.showMessageDialog(f, (num1 * num2));
                textField1.setText("");
                textField2.setText(""); // 입력한 내용 지워주는 것
            }
        });
        mul.setForeground(Color.WHITE);
        mul.setBackground(Color.BLUE);
        mul.setFont(new Font("굴림", Font.BOLD, 30));
        mul.setBounds(266, 175, 107, 56);
        f.getContentPane().add(mul);

        JButton div = new JButton("/");
        div.setForeground(Color.WHITE);
        div.setBackground(Color.RED);
        div.setFont(new Font("굴림", Font.BOLD, 30));
        div.setBounds(385, 175, 107, 56);
        f.getContentPane().add(div);





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
