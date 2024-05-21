package com.multi.b_operator;

import javax.swing.*;
import java.awt.*;

public  class Exec03{

    public static void main(String[]args){
        
        JFrame j = new JFrame();
        j.getContentPane().setLayout(new BorderLayout(0, 0));

        JButton btn1 = new JButton("중앙");
        j.getContentPane().add(btn1, BorderLayout.CENTER);

        JButton btn2 = new JButton("중앙");
        j.getContentPane().add(btn2, BorderLayout.CENTER);

        JButton btn3 = new JButton("중앙");
        j.getContentPane().add(btn3, BorderLayout.CENTER);

        JButton btn4 = new JButton("중앙");
        j.getContentPane().add(btn4, BorderLayout.CENTER);


//        j.setSize(700, 500);
//        j.setVisible(true);

    }
}