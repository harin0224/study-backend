<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: yellow;
}
</style>
</head>
<body>


	<div class="content">
		<br>
		<br>
		<div class="innerOuter">

			회원검색 처리 요청이 완료되었습니다.<br>
			 ${dto.num} <br>
			<!-- 출력용(expression language-EL)  -->
			${dto.title} <br> 
			${dto.name} <br> 
			${dto.genre} <br>

		</div>
		<br>
		<br>
	</div>

</body>
</html>




