<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.7.1.js"></script>
<script type="text/javascript">
	$(function() { //$ = body에서, # = id
		$('#b1').click(function() {
			$.ajax({
				url : "data/company_mock.json",
				success : function(arr) {
					alert(arr.length)
					for (i = 0; i < arr.length; i++) {
						console.log(arr[i].addr)
						console.log(arr[i].domain)
						console.log('------------')
					} //for
				} //success
			}) //ajax
		}) //b1
	}) //$
</script>
</head>
<body>
	<button id="b1">company_mock.json 읽어와서 추출하기</button>
	<button id="b2">company_mock.xml 읽어와서 추출하기</button>
</body>
</html>