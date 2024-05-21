<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			let moneyValue = $('#money').val()
			let choiceValue = $('#choice').val()
			$.ajax({
				url: "money.jsp",
				data: {
					money: moneyValue,
					choice: choiceValue
				},
				success: function(x) {
					$('div').html("결제금액은 " + x + "원")
				}//success
			}) //ajax
		})//b1
		$('#b2').click(function() {
			$.ajax({
				url: "idCheck.jsp",
				data: {
					user: $('#id').val()
				},
				success: function(x) {
					alert("받은 데이터는 " + x)
					$('div').html("받은 데이터는 " + x)
				},
				error: function(e) {
					alert(e)
				} //error
			}) //ajax
		}) //b2
		
		$('#b3').click(function() {
			//let telValue = $('#tel').val()
			//phone.jsp?tel=01011112222
			$.ajax({
				url: "phone.jsp",
				data: {
					tel: $('#tel').val()
				},
				success: function(x) {
					$('div').html(x)
				}//success
			}) //ajax
		})//b3
		$('#b4').click(function() {
			let testValue = $('#test').val()
			//alert('테스트중입니다.')
			//비동기통신으로 요청해서 결과받아서 div에 넣어보자.
			//test.jsp?test=hong
			$.ajax({
				url: "test.jsp",
				data: {
					test: testValue
				},
				success: function(x) {
					$('div').html(x)
				}//success
			}) //ajax
		})//b4
	
	})
</script>
</head>
<body bgcolor="pink">
    <h3>비동기통신으로 서버와 통신하기</h3>
    원화를 달러로 :
    <input type="text" id="won">
    <button style='color: blue; background: green' id='b1'>원화를 달러로</button>
    <hr color="red">
    달러를 원화로:
    <input type="text" id='dollar'>
    <button style='color: blue; background: yellow' id='b2'>달러를 원화로</button>
    <hr color="green">
    <div id="result"></div>
</body>
</html>