package com.multi.basic.a_variable;

import javax.swing.*;

public class Exec01 {
    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog("숫자1");
        String n2 = JOptionPane.showInputDialog("숫자2");

        int nn1 = Integer.parseInt(n1);
        int nn2 = Integer.parseInt(n2);

        System.out.println(nn1 + nn2);
        System.out.println(nn1 - nn2);
        System.out.println(nn1 * nn2);
        System.out.println(nn1 / nn2);


        for (int i = 0; i <= nn2; i++) {
            System.out.println(i);
        }


        //1
        String p1 = JOptionPane.showInputDialog("시작값");
        String p2 = JOptionPane.showInputDialog("종료값");
        int pp1 = Integer.parseInt(p1);
        int pp2 = Integer.parseInt(p2);
        for (int i = pp1; pp1<= pp2; i++) {
            System.out.println(i);
        }

        //2
        String n3 = JOptionPane.showInputDialog("반복할 숫자");
        String n4 = JOptionPane.showInputDialog("반복할 문자");
        int nn3 = Integer.parseInt(n3);
        for (int i = 0; i < nn3; i++) {
            System.out.println(n4);
        }



    }
}

