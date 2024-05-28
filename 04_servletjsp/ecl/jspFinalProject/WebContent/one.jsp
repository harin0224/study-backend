<%@page import="shop.ReplyDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shop.ReplyDAO"%>
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
<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
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
	
	//��ۿ� dao�ʿ�
	ReplyDAO dao2 = new ReplyDAO();
	
	//���ۿ� ���� ��� ����� dao�� ������ �´�.
	ArrayList<ReplyDTO> list = dao2.list(dto);
	
	//div�±׾ȿ� ����� �ٿ��ش�.
%>
<script type="text/javascript">
	$(function() {
		$("#reply").click(function() {
			$.ajax({
				url: "reply.jsp",
				data: {
					bbsid: <%= dto.getId() %>,
					content: $("#content").val(),
					writer: '${id}'
				} ,
				success: function(result) {
					//alert(result);
					$("div").append(result)
				}
			});	
		});
	});
</script>
</head>
<body>

	<center>
		<img src="img/food.png" width="150" height="80">
	</center>
	<br>
	<table border="1" align="center">
		<tr>
			<td id="td">�Խ��� ��ȣ</td>
			<td id="td2"><%= dto2.getId() %></td>
		</tr>		
		<tr>
			<td id="td">�Խ��� ����</td>
			<td id="td2"><%= dto2.getTitle() %></td>
		</tr>		
		<tr>
			<td id="td">�Խ��� ����</td>
			<td id="td2"><%= dto2.getContent() %></td>
		</tr>		
		<tr>
			<td id="td">�۾���</td>
			<td id="td2"><%= dto2.getWriter() %></td>
		</tr>		
	</table>
	<br>
	<center>
		<a href="bbs.jsp">�۸������</a> |
		<a href="update2.jsp?id=<%= dto2.getId()%>">�����ϱ�</a> |
		<a href="delete2.jsp?id=<%= dto2.getId()%>">�����ϱ�</a> |

	<hr color=red>
	���: <input type="text" id="content" name="reply">
		<input type="button" id="reply" value="��۴ޱ�">
		<br>
</center>
<table align=center>
	<tr>
		<td style="text-align: left;">
		<div>
			<%
				for(ReplyDTO dto3 : list){
			%>
			
			<img src=img/re.png width=50 height=50><%= dto3.getContent() %>(<%= dto2.getWriter() %>)<br>
			<%		
				}
			%>
		</div>	
		</td>
	</tr>
</table>
	















</body>
</html>