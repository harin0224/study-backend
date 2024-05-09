package com.multi.jdbc.b_basic.model.dao;

import com.multi.jdbc.b_basic.model.dto.BoardDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardDao {
    public BoardDto selectOne(int no){
        System.out.println("BoardDao : selectOne no : " + no);
        BoardDto rsDto = null;
        Connection con = null;  // 연결
        PreparedStatement ps = null;

        try {
            // 1.Jdbc driver 등록 처리 : 해당 database 벤더 사가 제공하는 클래스 등록
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("1. 드라이버 설정 성공..");
            // 2.등록된 클래스를 이용해서 db연결
            // 드라이버타입@ip주소:포트번호:db이름(SID)
            // orcl:사용자정의설치 , thin : 자동으로 설치 //ip주소 -> localhost 로 변경해도됨
            // 내 정보와 url을 통해 연결
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "tiger";
            con = DriverManager.getConnection(url, user, password);
            System.out.println("2. db연결 성공.");

            // 오토커밋을 false로 설정
            con.setAutoCommit(false);
            System.out.println("3. 오토커밋 설정 비활성화.");

            // sql문 만들기, prepareStatement 준비된 문장
            String sql = "SELECT * FROM BBS WHERE NO = ?";
            ps = con.prepareStatement(sql);
            // ? 에 입력할 순서대로 잘 매핑시키기
            ps.setInt(1, no);


            System.out.println("4. sql문 객체 생성 성공");
            int result = ps.executeUpdate();    // 실행시키기, 수행된 row의 개수가 int 형으로 들어옴


            System.out.println("5. sql문 전송 성공, 결과1>> " + result);
//            System.out.println("5. sql문 전송 성공, 결과2>> " + result2);


            // 트랜잭션 커밋
            if (result >= 1 ) { // && result2 >= 1
                System.out.println("데이터 입력 완료");
                con.commit();
                System.out.println("6. 트랜잭션 커밋 완료.");

            }
            // Query가 제대로 실행되지 않은 경우
            else {
                System.out.println("데이터 입력 실패");
                con.rollback();
            }

        }catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            if (con != null) {
                try {
                    con.rollback(); // 예외 발생 시 롤백
                } catch (SQLException ex) {
                    ex.printStackTrace();

                }
                System.out.println("트랜잭션 롤백.");
            }
        } finally {
            try {
                ps.close(); // 먼저닫기
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
                e.printStackTrace();
            }
        }

    }



        return rsDto;
    }
}
