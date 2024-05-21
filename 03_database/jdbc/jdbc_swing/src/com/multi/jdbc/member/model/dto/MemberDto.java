package com.multi.jdbc.member.model.dto;

import java.sql.Date;

public class MemberDto {

    private int no; //null
    private String id; //null
    private String pw; //null
    private String name; //null
    private String tel;
    private Date createDate;
    public MemberDto(){

    }

    public MemberDto(int no, String id, String pw, String name, String tel) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.tel = tel;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }


    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public Date getCreateDate() {
        return createDate;
    }


    @Override
    public String toString() {
        return "MemberDto{" +
                "id=" + id +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
