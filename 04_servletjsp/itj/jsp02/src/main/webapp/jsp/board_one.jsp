<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.multi.jsp.board.BbsDAO"%>
<%@ page import="com.multi.jsp.board.BbsDTO"%>

 <%
   int no = request.getParameter("no");

    BbsDAO dao = new BbsDAO();
    BbsDTO dto = bbsDao.one();
 %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= resultText %>
번호: <%= dto.getNo() %> <br>
제목: <%= dto.getTitle() %> <br>
내용: <%= dto.getContent()%> <br>
작성자: <%= dto.getWriter() %> <br>
</body>
</html>