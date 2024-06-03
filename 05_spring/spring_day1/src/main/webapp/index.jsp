<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="resources/css/out.css">
<title>Insert title here</title>
</head>
<body>
	welcome!! spring world!!!<a href="hi">hi call</a>
	
	<hr color="red">
	<img src="resources/img/ok.jpg">
	<br><br>
<%-- 		 이렇게 못한다 보안상? 
 	 <a href = "WEB-INF/views/member.jsp"> 
			<button id="b1">첫페이지로</button>
		</a>
		--%> 

		
	 <jsp:forward page="WEB-INF/views/member.jsp"/>

</body>
</html>