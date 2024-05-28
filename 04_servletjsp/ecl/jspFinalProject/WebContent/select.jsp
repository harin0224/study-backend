<%@page import="shop.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shop.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="css/project.css">
<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
<%
		//1.������ id�� ������ �´�.
		String id = request.getParameter("id");
	
		//2.dto�� �ִ´�.
		ProductDTO dto = new ProductDTO();
		dto.setId(id);
		
		//3.dao�� ����ؼ� dbó��
		ProductDAO dao = new ProductDAO();
		ProductDTO dto2 = dao.select(dto);
		
		//4.�������  dto�� ���ڰ� ����Ʈ
	%>
<script type="text/javascript">
	$(function() {
		//call-back�Լ�
		//�ڷ� �ͼ� �ڵ�ȣ��Ǵ� �Լ�
		$("#bag").click(function() {
			//alert("��ٱ��Ͽ� �߰� ó���ؾ� ��.")
			$.ajax({
				url: "add.jsp",
				data: {
					id: <%= dto.getId() %>
				},
				success: function() {
					alert("��ٱ��Ͽ� �߰� ������.")
					move = confirm("��ٱ��Ϸ� �̵��Ͻðڽ��ϱ�?")
					if(move){
						location.href="basket.jsp";
					}
				}
			});
		});
	});
</script>
</head>
<body>
<div id="total">
	<div id="top">
		<jsp:include page="top.jsp"></jsp:include>
	</div>
	<div id="top2">��ٱ��� ���� �κ�.</div>
	<div id="center">
	
	<br>
	<table align="center">
		<tr>
			<td id="td">��ǰ��ȣ</td>
			<td id="td3"><%= dto2.getId() %></td>
		</tr>
		<tr>
			<td id="td">��ǰ�̸�</td>
			<td id="td3">
				<span style="color:red;">
					<%= dto2.getName() %>
				</span>
			</td>
		</tr>
		<tr>
			<td id="td">��ǰ����</td>
			<td id="td3"><%= dto2.getContent() %></td>
		</tr>
		<tr>
			<td id="td">��ǰ����</td>
			<td id="td3"><%= dto2.getPrice() %></td>
		</tr>
		<tr>
			<td id="td">����ȸ��</td>
			<td id="td3"><%= dto2.getCompany() %></td>
		</tr>
		<tr>
			<td id="td">��ǰ�̹���</td>
			<td id="td3"><img src="img/<%= dto2.getImg() %>" width="200" height="200"></td>
		</tr>
	</table>
	<center>
		<input type="image" src="img/bag.png" id="bag">
	</center>
	</div>
</div>







</body>
</html>