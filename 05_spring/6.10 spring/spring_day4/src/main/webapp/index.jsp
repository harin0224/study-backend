<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"  type="text/css" href="resources/css/out3.css">

</head>
<body>
<h3 style=color:red>게시물 내용입니다.</h3>
<form action="transaction.do" method= "post">
	id: <input type="text" name="id" value="spring111" style="background: yellow;"><br>
	pw: <input type="text" name="pw" value="spring" style="background: yellow;"><br>
	name: <input type="text" name="name" value="spring" style="background: yellow;"><br>
	tel: <input type="text" name="tel" value="spring" style="background: yellow;"><br>
	제목: <input type="text" name="title" value="spring really?"><br>
	내용: <input type="text" name="content" value="fun spring"><br>
	작성자: <input type="text" name="writer" value="it's me!!"><br>
	<button type="submit">회원가입 완료</button>
</form>


<a href="a.do">개인정보보기</a> <br>
<a href="b1.do">물건검색</a> <br>
<a href="b2.do">장바구니</a> <br>
<a href="b3.do">주문</a> <br>


</body>
</html>

