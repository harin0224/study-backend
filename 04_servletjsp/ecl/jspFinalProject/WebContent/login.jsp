<%@page import="shop.MemberDAO"%>
<%@page import="shop.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%-- <jsp:useBean id="dto" class="shop.MemberDTO"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/> --%>

<%
	//1.�Է��� id, pw�� ������ �´�.
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	//2.dto�� ����, �����͸� �ִ´�.
	MemberDTO dto = new MemberDTO();
	dto.setId(id);
	dto.setPw(pw);
	
	//3.dao�� ����ؼ�, dbó��
	MemberDAO dao = new MemberDAO();
	boolean result = dao.check(dto);
	
	//	������� true�̸�, id�� session���� ���!
	//  ������� false�̸�, id�� session���� ���x!
	if(result){
		session.setAttribute("id", id);
	}
	
	//4.member.jsp�� �Ѿ.
%>
<jsp:forward page="member.jsp"></jsp:forward>
</body>
</html>






