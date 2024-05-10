package com.multi.jdbc.member.model.dao;

import com.multi.jdbc.common.DBConnectionMgr;
import com.multi.jdbc.member.model.dto.MemberDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDao {
    // 연결 전역으로 하나만 생성
    Connection con = null;
    DBConnectionMgr dbcp;

    public MemberDao(){
        try {
            dbcp = DBConnectionMgr.getInstance();
            con = dbcp.getConnection(); // connection pool 임대
            con.setAutoCommit(false);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("MemberDao 기본 생성자: connection 에러 발생");
        }
    }


    public int insert(MemberDto memberDto) {
        int result = 0;

        PreparedStatement ps = null;

        try {
            String sql = "insert into member values(null, ?, ?, ?, ?, now())";
            ps = con.prepareStatement(sql);
            ps.setString(1, memberDto.getId());
            ps.setString(2, memberDto.getPw());
            ps.setString(3, memberDto.getName());
            ps.setString(4, memberDto.getTel());

            result = ps.executeUpdate();

            if(result > 0 ){
                con.commit();
            }else{
                con.rollback();
            }

        }catch (SQLException e) {
            e.printStackTrace();
            System.out.println("insert 시 에러 발생");

            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }finally {
            dbcp.freeConnection(con, ps);
        }



        return result;
    }

    public int delete(String id) {
        int result = 0;

        PreparedStatement ps = null;

        try {
            String sql = "delete from member where id = ? ";    // 순서대로 1, 2, 3, 4
            ps = con.prepareStatement(sql);
            ps.setString(1, id);

            result = ps.executeUpdate();

            if(result > 0 ){
                con.commit();
            }else{
                con.rollback();
            }

        }catch (SQLException e) {
            e.printStackTrace();
            System.out.println("insert 시 에러 발생");

            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }finally {
            dbcp.freeConnection(con, ps);
        }
        return result;
    }

    public int update(MemberDto memberDto) {
        int result = 0;

        PreparedStatement ps = null;

        try {
            String sql = "update member set tel = where id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, memberDto.getTel());
            ps.setString(2, memberDto.getId());

            result = ps.executeUpdate();

            if(result > 0 ){
                con.commit();
            }else{
                con.rollback();
            }

        }catch (SQLException e) {
            e.printStackTrace();
            System.out.println("insert 시 에러 발생");

            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }finally {
            dbcp.freeConnection(con, ps);
        }

        return result;
    }


    public MemberDto selectOne(String id) {
        MemberDto rsDto = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "select * from member where id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();
            if(rs.next()){
                rsDto = new MemberDto();
                rsDto.setId(rs.getString("id"));
                rsDto.setPw(rs.getString("pw"));
                rsDto.setName(rs.getString("name"));
                rsDto.setTel(rs.getString("tel"));
            }

        } catch (SQLException e) {
            System.out.println("에러 발생");
        }finally {
            dbcp.freeConnection(con, ps, rs);
        }
        return rsDto;
    }

    public ArrayList<MemberDto> list() {
        ArrayList<MemberDto> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;


        try {
            String sql = "select * from member";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                MemberDto memberDto = new MemberDto();
                memberDto.setId(rs.getString("id"));
                memberDto.setPw(rs.getString("pw"));
                memberDto.setName(rs.getString("name"));
                memberDto.setTel(rs.getString("tel"));

                list.add(memberDto);
            }
        }catch (SQLException e) {
            System.out.println("에러 발생");
        }finally {
            dbcp.freeConnection(con, ps, rs);
        }

        return list;
    }
}

