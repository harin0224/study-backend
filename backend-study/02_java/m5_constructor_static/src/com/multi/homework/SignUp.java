package com.multi.homework;

public class SignUp {
    private String subject;
    private String time;
    private String name;
    SignUp(String subject, String time, String name){
        this.subject = subject;
        this.time = time;
        this.name = name;
    }

    @Override
    public String toString() {
        return "수강과목: " + subject + ", 시간: " + time + ", 수강생: " + name;
    }
}
