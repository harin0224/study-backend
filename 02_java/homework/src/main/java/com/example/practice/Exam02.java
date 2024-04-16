package com.example.practice;

import javax.swing.*;

public class Exam02 {
    public static void main(String[] args) {
        String height = JOptionPane.showInputDialog("키:");
        double height1 = Double.parseDouble(height);
        double weight = (height1 - 100)*0.9;
        System.out.println(weight);
    }
}
