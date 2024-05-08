package com.multi.jdbc.b_basic.model.dto;

import java.util.Date;

public class MemberDto {
    private int id;
    private String pw;
    private String name;
    private String tel;
    private Date creatDate;
    public MemberDto(){

    }

    public MemberDto(int id, String pw, String name, String tel){
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "id=" + id +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public Date getCreateDate() {
        return creatDate;
    }

    public void setCreateDate(Date creatDate) {
        this.creatDate = creatDate;
    }
}
