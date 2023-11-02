<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
		//HttpSession session = new HttpSession(); 내장되어있음
		session.setAttribute("view", 0); // value 위치의 타입은 object ==> 아무거나 가능
	%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="세션설정보기.jsp">세션 설정 보기</a>
</body>
</html>