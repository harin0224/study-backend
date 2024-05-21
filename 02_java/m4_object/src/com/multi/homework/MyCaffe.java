package com.multi.homework;

public class MyCaffe {
    public static void main(String[] args) {
        Cal4 calculator = new Cal4();

        int coffeeCount = 5;
        int coffeePrice = 2000;
        int coffeeTotal = calculator.sum(coffeeCount, coffeePrice);

        int milkTeaCount = 2;
        int milkTeaPrice = 3000;
        int milkTeaTotal = calculator.sum(milkTeaCount, milkTeaPrice);

        System.out.println("커피 금액: " + coffeeTotal + "원");
        System.out.println("밀크티 금액: " + milkTeaTotal + "원");

        int total = calculator.total(coffeeTotal, milkTeaTotal);
        int perPersonPayment = calculator.div(total, (coffeeCount + milkTeaCount));

        System.out.println("1인당 결제할 금액: " + perPersonPayment + "원");
    }
}
