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
	<center>
		<img src="img/food.png" width="200" height="200">
	</center>
	<br>
	<form action="insert22.jsp">
		<table border="1" align="center">
			<tr>
				<td id="td">�Խ��� ����</td>
				<td id="td2">
					<input type="text" name="title">
				</td>
			</tr>
			<tr>
				<td id="td">�Խ��� ����</td>
				<td id="td2">
					<textarea rows="5" cols="20" name="content">
					</textarea>
				</td>
			</tr>
			<tr>
				<td id="td">�۾���</td>
				<td id="td2">
					<input type="text" name="writer" value="${id}" readonly="readonly">
				</td>
				<!-- expression language(EL)  -->
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="�۾��� �Ϸ�">
				</td>
			</tr>
		</table>
	</form>
	<br><br>
	<center>
		<a href="bbs.jsp">�۸������</a>
	</center>















</body>
</html>