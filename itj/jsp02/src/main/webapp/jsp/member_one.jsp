<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.multi.jsp.member.MemberDAO"%>
<%@ page import="com.multi.jsp.member.MemberDTO"%>

        <!--
            1. 데이터를 받아서 저장해두자.
            HttpServletRequest request = new HttpServletRequest(); 내장객체
            2. dao를 이용해서 데이터를 주면서 db처리해달라고 요청
            3. 요청에 대한 결과를 html을 만든다.
        -->

 <%
    String id = request.getParameter("id"); //input안에 있는 name="id"에 입력한 데이터를 받아와!

    MemberDAO dao = new MemberDAO();


    MemberDTO dto = dao.one(id);
 %>





<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body bgcolor="skyblue">
검색해온 id: <%= dto.getId() %> <br>
검색해온 pw: <%= dto.getPw() %> <br>
검색해온 name: <%= dto.getName() %> <br>
검색해온 tel: <%=dto.getTel() %> <br>

</body>
</html>