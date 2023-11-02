<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>로그인 화면</h3>
<form action="로그인세션설정.jsp" method="post"> <!-- 보내는 데이터를 주소에 노출시키지 않음 -->
	ID : <input name = "id" value="apple"><br> <!-- value="" 기본값 설정  -->
	PW : <input name = "pw" value="1234"><br> 
	<button type="submit">로그인</button>
</form>
</body>
</html>