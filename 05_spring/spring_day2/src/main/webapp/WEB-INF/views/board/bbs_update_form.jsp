<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<style type="text/css">
body { /* 컨트롤 + / - 자동주석, 태그선택! */
	background: #18de02;
}

button {
	background: pink;
}

.t1 { /* .은 클래스 선택!, 여러개선택!  */
	background: yellow;
	width: 150px;
	text-align: center;
}
</style>
</head>
<body>


	<!-- 이쪽에 메뉴바 포함 할꺼임 -->
	<jsp:include page="../common/menubar.jsp" />

	<div class="content">
		<br>
		<br>
		<div class="innerOuter">
			<h3>게시글 수정 페이지</h3>
			<hr>
			<a href="board">
				<button id="b1">첫페이지로</button>
			</a>
			<form action="update" method="post">
				<!-- update member set tel = ? where id = ? -->
				<table border="1">
					<tr>
						<td class="t1">글 no :</td>
						<td><input name="no" placeholder="변경할 no"></td>
					</tr>
					<tr>
						<td class="t1">글 제목 :</td>
						<td><input name="title" placeholder="변경할 제목"></td>
					</tr>
					<tr>
						<td class="t1">글 내용 :</td>
						<td><input name="content"  placeholder="변경할 내용"></td>
					</tr>
					<tr>
						<td colspan="2" class="t1">
							<button id="b2">게시글 수정 데이터 전송</button>
						</td>
					</tr>
				</table>

			</form>






		</div>
		<br>
		<br>
	</div>


	<!-- 이쪽에 푸터바 포함할꺼임 -->
	<jsp:include page="../common/footer.jsp" />

</body>
</html>






