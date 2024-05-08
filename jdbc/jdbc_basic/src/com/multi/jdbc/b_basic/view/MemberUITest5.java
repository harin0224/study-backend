package com.multi.jdbc.b_basic.view;

import com.multi.jdbc.b_basic.model.dao.MemberDao;
import com.multi.jdbc.b_basic.model.dto.MemberDto;

import javax.swing.*;

public class MemberUITest5 {
    public static void main(String[] args) {
        String id = JOptionPane.showInputDialog("아이디 입력");
        String pw = JOptionPane.showInputDialog("패스워드 입력");

        MemberDao dao = new MemberDao();
        MemberDto memberDto = new MemberDto();
        memberDto.setId(Integer.parseInt(id));
        memberDto.setPw(pw);
        MemberDto rsDto = dao.login(memberDto);

        System.out.println(rsDto);

        // 로그인 실패
        if(rsDto == null){
            System.out.println("로그인 실패");
        }else{
            System.out.println("로그인 성공");
        }
    }
}
