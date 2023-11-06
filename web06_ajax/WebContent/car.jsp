<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.7.1.js"></script>
<script type="text/javascript">
$(function() {
	$('#b1').click(function() {
		$.ajax({
			url: "data/car.json",
			success: function(json) {
				$(json).each(function(i, one) {
					$.ajax({
						url: "db_create.jsp",
						data: {
							id: one.id,
							email: one.email,
							car: one.car
						},
						success: function(result) {
							console.log(result)
							console.log(result.length)
							if(result.trim() == '1') {
								console.log('db 저장 성공');
							} else {
								console.log('db 저장 실패')
							}
						}
					});
				});
			}
		});
	});

	$('#b2').click(function() {
		$.ajax({
			url: "data/car.xml",
			success: function(xml) {
				$(xml).find('car').each(function() {
					var id = $(this).find('id').text();
					var email = $(this).find('email').text();
					var car = $(this).find('car').text();
					$.ajax({
						url: "db_create.jsp",
						data: {
							id: id,
							email: email,
							car: car
						},
						success: function(result) {
							console.log(result)
							if(result == '1') {
								console.log('db 저장 성공');
							} else {
								console.log('db 저장 실패')
							}
						}
					});
				});
			}
		});
	});
});
</script>
</head>
<body>
<button id="b1">car.json 읽어와서 추출하기</button>
<button id="b2">car.xml 읽어와서 추출하기</button>
</body>
</html>
