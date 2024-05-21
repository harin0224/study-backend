package com.multi.homework;

public class MyStore {
    public static void main(String[] args) {
        Calculator3 cal3 = new Calculator3();
        int price = 7000;
        int count1 = 5;
        int count2 = 4;

        System.out.println("오늘 온 손님의 총 합은 " + cal3.add(count1, count2) + "명 입니다.");
        System.out.println("손님 수 차이는 " + cal3.subtract(count1, count2) + "명 입니다.");
        System.out.println("오후에 들어온 손님의 결제 금액은 " + cal3.multiply(price, count2) + "원 입니다.");
        int total = cal3.multiply(price, count1) + cal3.multiply(price, count2);
        System.out.println("오늘 하루 총 결제금액은 " + total + "원 입니다.");
        System.out.println("1인당 결제금액은 " + cal3.divide(total, (count1 + count2)) + "원 입니다.");
    }
}
