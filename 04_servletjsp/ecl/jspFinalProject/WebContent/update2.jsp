<%@page import="shop.BbsDAO"%>
<%@page import="shop.BbsDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="css/project.css">
</head>
<body>
<%
	//1.id�� ������ ����
	String id = request.getParameter("id");

	//2.dto�� �ִ´�.
	BbsDTO dto = new BbsDTO();
	dto.setId(id);
	
	//3.dao�� �̿��ؼ� �˻����� ������ �´�.
	BbsDAO dao = new BbsDAO();
	BbsDTO dto2 = dao.select(dto);
	
	//4.������ �� �˻������ ���̺� ������� ����Ʈ
%>
	<center>
		<img src="img/food.png" width="150" height="80">
	</center>
	<br>
	<form action="update22.jsp">
		<table border="1" align="center">
			<tr>
				<td id="td">�Խ��� ��ȣ</td>
				<td id="td2">
					<input 	type="text" 
							name="id" 
							value="<%= dto2.getId() %>"
							readonly="readonly"		
					>
				</td>
			</tr>		
			<tr>
				<td id="td">�Խ��� ����</td>
				<td id="td2">
					<input 	type="text" 
							name="title" 
							value="<%= dto2.getTitle() %>"
					>
				</td>
			</tr>		
			<tr>
				<td id="td">�Խ��� ����</td>
				<td id="td2">
					<input 	type="text" 
							name="content" 
							value="<%= dto2.getContent() %>"
					>
				</td>
			</tr>		
			<tr>
				<td id="td">�۾���</td>
				<td id="td2"><%= dto2.getWriter() %></td>
			</tr>	
			<tr>
				<td colspan="2">
					<input type="submit" value="���� �Ϸ�">
				</td>
			</tr>	
		</table>
	</form>
	<br>
	<center>
		<a href="bbs.jsp">�۸������</a> |
		<a href="one.jsp?id=<%= dto.getId()%>">�۳�������</a> |
	</center>















</body>
</html>