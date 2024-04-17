package com.multi.e_gui.homework;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Exec06 {
    public static void main(String[] args) {
        int lilac = 0;
        int weGo = 0;
        int asap = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("1)아이유 2)프로미스나인 3)스테이씨 >>");
            int choice = scanner.nextInt();
            if (choice == 4){
                System.out.println("종료합니다.");
                System.out.println("아이유 득표수: " + lilac);
                System.out.println("프로미스나인 득표수: " + weGo);
                System.out.println("스테이씨 득표수: " + asap);
                break;
            } else if (choice == 1){
                lilac++;
            } else if (choice == 2) {
                weGo++;
            } else if (choice == 3) {
                asap++;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }


        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.LIGHT_GRAY);
        f.setSize(500, 700);
        f.getContentPane().setLayout(null);

        JLabel nameLabel = new JLabel("K_pop 인기 투표");
        nameLabel.setFont(new Font("굴림", Font.BOLD, 30));
        nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        nameLabel.setBounds(120, 40, 250, 43);
        f.getContentPane().add(nameLabel);


        // ImageIcon으로 이미지 로드
        ImageIcon imgLilac = new ImageIcon("src/com/multi/e_gui/homework/lilac.jpg");
        // 이미지 크기 조절
        Image resizedImage1 = imgLilac.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage1);
        // JLabel에 조절된 이미지 설정
        JLabel reImgLilac = new JLabel(resizedIcon);
        reImgLilac.setBounds(50, 100, 150, 150);
        f.getContentPane().add(reImgLilac);


        JLabel lilacLabel = new JLabel("1. 아이유-라일락");
        lilacLabel.setFont(new Font("굴림", Font.BOLD, 15));
        lilacLabel.setBounds(250, 100, 250, 43);
        f.getContentPane().add(lilacLabel);

        JLabel lilacNum = new JLabel(lilac + "표");
        lilacNum.setFont(new Font("굴림", Font.BOLD, 15));
        lilacNum.setBounds(300, 150, 250, 43);
        f.getContentPane().add(lilacNum);



        ImageIcon imgWeGo = new ImageIcon("src/com/multi/e_gui/homework/wego.jpg");
        Image resizedImage2 = imgWeGo.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon2 = new ImageIcon(resizedImage2);
        JLabel reImgWeGo = new JLabel(resizedIcon2);
        reImgWeGo.setBounds(50, 300, 150, 150);
        f.getContentPane().add(reImgWeGo);

        JLabel weGoLabel = new JLabel("2. 프로미스나인- we go");
        weGoLabel.setFont(new Font("굴림", Font.BOLD, 15));
        weGoLabel.setBounds(250, 300, 250, 43);
        f.getContentPane().add(weGoLabel);

        JLabel weGoNum = new JLabel(weGo + "표");
        weGoNum.setFont(new Font("굴림", Font.BOLD, 15));
        weGoNum.setBounds(300, 350, 250, 43);
        f.getContentPane().add(weGoNum);


        ImageIcon imgAsap = new ImageIcon("src/com/multi/e_gui/homework/asap.jpg");
        Image resizedImage3 = imgAsap.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon3 = new ImageIcon(resizedImage3);
        JLabel reImgAsap = new JLabel(resizedIcon3);
        reImgAsap.setBounds(50, 500, 150, 150);
        f.getContentPane().add(reImgAsap);


        JLabel asapLabel = new JLabel("3. 스테이씨 - ASAP");
        asapLabel.setFont(new Font("굴림", Font.BOLD, 15));
        asapLabel.setBounds(250, 500, 250, 43);
        f.getContentPane().add(asapLabel);

        JLabel asapNum = new JLabel(asap + "표");
        asapNum.setFont(new Font("굴림", Font.BOLD, 15));
        asapNum.setBounds(300, 550, 250, 43);
        f.getContentPane().add(asapNum);







        f.setVisible(true);
    }

}
