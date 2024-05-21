package com.multi.homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exec01 {
    private static int currentMovie = 0;

    public static void main(String[] args) {

        String[] movieTitles = {"지푸라기", "정직한 후보", "1917", "작은 아씨들", "클로젯"};
        double[] reservationRates = {11.7, 14.7, 26.7,21.8, 35.5};

        JFrame frame = new JFrame();
        frame.setTitle("현재 상영작");
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(255, 250, 205));
        frame.getContentPane().setLayout(null);

        JLabel titleLabel = new JLabel("현재 상영작");
        titleLabel.setFont(new Font("굴림", Font.BOLD, 25));
        titleLabel.setBounds(25, 10, 300, 40);
        frame.getContentPane().add(titleLabel);

        JLabel movieImageLabel = new JLabel();
        movieImageLabel.setIcon(new ImageIcon("img/" + movieTitles[currentMovie] + ".jpg"));
        movieImageLabel.setBounds(200, 30, 270, 400);
        frame.getContentPane().add(movieImageLabel);

        JTextField reservationRateText = new JTextField();
        reservationRateText.setBounds(280, 480, 180, 60);
        reservationRateText.setFont(new Font("굴림", Font.BOLD, 30));
        frame.getContentPane().add(reservationRateText);

        JLabel rateLabel = new JLabel("예매율");
        rateLabel.setFont(new Font("굴림", Font.BOLD, 30));
        rateLabel.setBounds(170, 480, 100, 80);
        frame.getContentPane().add(rateLabel);

        JButton movieButton1 = new JButton(movieTitles[0]);
        movieButton1.setBounds(10, 60, 180, 60);
        movieButton1.setBackground(new Color(85,107,47));
        movieButton1.setFont(new Font("굴림", Font.BOLD, 25));
        movieButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentMovie = 0;
                ImageIcon originalIcon = new ImageIcon("img/" + movieTitles[currentMovie] + ".jpg");
                Image originalImage = originalIcon.getImage();
                Image resizedImage = originalImage.getScaledInstance(300, 500, Image.SCALE_SMOOTH);
                ImageIcon resizedIcon = new ImageIcon(resizedImage);
                movieImageLabel.setIcon(resizedIcon);
                reservationRateText.setText(reservationRates[currentMovie] + "%");
            }
        });
        frame.getContentPane().add(movieButton1);

        // movieButton2
        JButton movieButton2 = new JButton(movieTitles[1]);
        movieButton2.setBounds(10, 130, 180, 60);
        movieButton2.setBackground(new Color(85,107,47));
        movieButton2.setFont(new Font("굴림", Font.BOLD, 25));
        movieButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentMovie = 1;
                ImageIcon originalIcon = new ImageIcon("img/" + movieTitles[currentMovie] + ".jpg");
                Image originalImage = originalIcon.getImage();
                Image resizedImage = originalImage.getScaledInstance(300, 500, Image.SCALE_SMOOTH);
                ImageIcon resizedIcon = new ImageIcon(resizedImage);
                movieImageLabel.setIcon(resizedIcon);
                reservationRateText.setText(reservationRates[currentMovie] + "%");
            }
        });
        frame.getContentPane().add(movieButton2);

        // movieButton3
        JButton movieButton3 = new JButton(movieTitles[2]);
        movieButton3.setBounds(10, 200, 180, 60);
        movieButton3.setBackground(new Color(85,107,47));
        movieButton3.setFont(new Font("굴림", Font.BOLD, 25));
        movieButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentMovie = 2;
                ImageIcon originalIcon = new ImageIcon("img/" + movieTitles[currentMovie] + ".jpg");
                Image originalImage = originalIcon.getImage();
                Image resizedImage = originalImage.getScaledInstance(300, 500, Image.SCALE_SMOOTH);
                ImageIcon resizedIcon = new ImageIcon(resizedImage);
                movieImageLabel.setIcon(resizedIcon);
                reservationRateText.setText(reservationRates[currentMovie] + "%");
            }
        });
        frame.getContentPane().add(movieButton3);

        // movieButton4
        JButton movieButton4 = new JButton(movieTitles[3]);
        movieButton4.setBounds(10, 270, 180, 60);
        movieButton4.setBackground(new Color(85,107,47));
        movieButton4.setFont(new Font("굴림", Font.BOLD, 25));
        movieButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentMovie= 3;
                ImageIcon originalIcon = new ImageIcon("img/" + movieTitles[currentMovie] + ".jpg");
                Image originalImage = originalIcon.getImage();
                Image resizedImage = originalImage.getScaledInstance(300, 500, Image.SCALE_SMOOTH);
                ImageIcon resizedIcon = new ImageIcon(resizedImage);
                movieImageLabel.setIcon(resizedIcon);
                reservationRateText.setText(reservationRates[currentMovie] + "%");
            }
        });
        frame.getContentPane().add(movieButton4);

        // movieButton5
        JButton movieButton5 = new JButton(movieTitles[4]);
        movieButton5.setBounds(10, 340, 180, 60);
        movieButton5.setBackground(new Color(85,107,47));
        movieButton5.setFont(new Font("굴림", Font.BOLD, 25));
        movieButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentMovie= 4;
                ImageIcon originalIcon = new ImageIcon("img/" + movieTitles[currentMovie] + ".jpg");
                Image originalImage = originalIcon.getImage();
                Image resizedImage = originalImage.getScaledInstance(300, 500, Image.SCALE_SMOOTH);
                ImageIcon resizedIcon = new ImageIcon(resizedImage);
                movieImageLabel.setIcon(resizedIcon);
                reservationRateText.setText(reservationRates[currentMovie] + "%");
            }
        });
        frame.getContentPane().add(movieButton5);

        frame.setVisible(true);
    }
}
