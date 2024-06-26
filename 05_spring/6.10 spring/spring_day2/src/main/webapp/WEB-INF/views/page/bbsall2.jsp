<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script type="text/javascript">
	$(function() {
		$('.pages').click(function() {
			alert($(this).text()) //this 내가 누른것 선택 
			$.ajax({
				url : "bbslist", //views/bbsList2.jsp가 결과!
				data : {
					page : $(this).text()
				},
				success : function(result) { //결과가 담겨진 table부분코드
					$('#d1').html(result)
				},
				error : function() {
					alert('실패.@@@')
				}
			}) //ajax
		})
	})
</script>
<style>
td {
	background: white;
	height: 30px;
}
</style>
</head>
<body>
<h3>전체 bbs 글 count: ${count}</h3>
<hr color="red">
<%
	int pages = (int)request.getAttribute("pages");
	for(int p = 1; p <= pages; p++){
%>
	<button style="background: lime; color: red; width: 50px;" class="pages"><%= p %></button>
<%		
	}
%>
<hr color="red">
<div id="d1">
 <table>
   <tr>
    	<td class="left">No.</td>
      <td class="left">게시글 번호</td>
      <td class="left">제목</td>
      <td class="left">내용</td>
      <td class="left">작성자</td>
   </tr>
   <c:forEach items="${list}" var="one">
   <tr>
      <td class="right">${one.rownum}</td> 
      <td class="right">${one.no}</td> <!-- one.getId() -->
      <td class="right"><a href="bbsOne?id=${one.no}">${one.title}</a></td>
      <td class="right">${one.content}</td>     
      <td class="right">${one.writer}</td>
   </tr>
   </c:forEach>
</table>
</div>
</body>
</html>