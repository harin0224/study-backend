package com.multi.b_app01;

public class Exec08 {
    public static void main(String[] args) {
        String s1 = " 011-245-1234 ";
        String s = s1.trim(); //공백제거

        String first = s.substring(0, 3); //011
        String second = s.substring(4, 7); //245
        System.out.println(first + " " + second);
    }
}
