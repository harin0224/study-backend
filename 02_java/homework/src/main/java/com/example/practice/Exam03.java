package com.example.practice;

import javax.swing.*;

public class Exam03 {
    public static void main(String[] args) {
        String service = JOptionPane.showInputDialog("통신사 입력: ");
        String tell = JOptionPane.showInputDialog("전화번호 입력: ");
        String name = JOptionPane.showInputDialog("가입자 이름 입력: ");
        
        String str =name + "님은 " + service + "에 " + tell;
        JOptionPane.showMessageDialog(null, str + "로 가입되셨습니다.");
    }
}
