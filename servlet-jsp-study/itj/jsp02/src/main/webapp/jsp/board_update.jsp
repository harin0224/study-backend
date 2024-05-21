<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.multi.jsp.board.BbsDAO"%>
<%@ page import="com.multi.jsp.board.BbsDTO"%>


 <%
    String title = request.getParameter("title");
    String content = request.getParameter("content");

    MemberDAO dao = new BbsDAO();
    MemberDTO dto = new BbsDTO();

    dto.setTitle(title);
    dto.setContent(content);

    int result = dao.insert(title, content);

    String resultText = "게시글수정실패함";
    if (result == 1) {
        resultText = "게시글수정성공함";
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
제목 : <%= title %> <br>
내용 : <%= content %> <br>
</body>
</html>