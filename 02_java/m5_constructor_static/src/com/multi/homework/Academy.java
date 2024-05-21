package com.multi.homework;

public class Academy {
    public static void main(String[] args) {
        SignUp signup1 = new SignUp("자바", "14:30", "홍길동");
        SignUp signup2 = new SignUp("JSP", "9:30", "김길동");
        System.out.println(signup1);
        System.out.println(signup2);
    }
}

