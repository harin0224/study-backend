package com.example.practice;

import javax.swing.*;

public class Exam01 {
    public static void main(String[] args) {
        String width = JOptionPane.showInputDialog("가로:");
        String length = JOptionPane.showInputDialog("세로: ");

        int w = Integer.parseInt(width);
        int l = Integer.parseInt(length);
        int area = w * l;
        System.out.println(area);
    }

}
