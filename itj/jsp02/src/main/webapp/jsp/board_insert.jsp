<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.multi.jsp.board.BbsDAO"%>

        <!--
        jsp에서 해야하는 작업 3가지
        1) form안에 입력한 데이터 받아서 저장해두자. ==> java
        2) 받은 데이터를 DAO에게 주자.  ==> java
        3) 결과를 html로 만들자. ==> html
                 -->

 <%
    String title = request.getParameter("title"); //input안에 있는 name="id"에 입력한 데이터를 넣음
    String content = request.getParameter("content");
    String writer = request.getParameter("writer");
    String category = request.getParameter("category");

    MemberDAO dao = new BbsDAO();
    MemberDTO dto = new BbsDTO();
    dto.setTitle(title);
    dto.setContent(content);
    dto.setWriter(writer);
    dto.setCategory(category);

    int result = dao.insert(dto);

    String resultText = "게시글등록실패함";
    if (result == 1) {
        resultText = "게시글등록성공함";
    }
 %>





<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= resultText %>
</body>
</html>