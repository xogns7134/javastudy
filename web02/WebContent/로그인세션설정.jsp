<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String id2 = "apple";
	String pw2 = "1234";
	// id와 id2가 동일하고 pw와 pw2가 동일한지 비교해서
	// 모두 동일하면 id만 세션으로 잡기
	// 둘 중 하나라도 틀리면 재로그인하도록 링크 넣기
	// <a href=네이버로그인>
	if (id.equals(id2) && pw.equals(pw2)) {
	session.setAttribute("id", "apple");
	out.print("<h3>로그인 성공</h3>");
	} else { out.print("<a href = 네이버로그인.jsp>재로그인 시도</a>");
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% if (id.equals(id2) && pw.equals(pw2)) {%>
<a href="news.jsp">뉴스로 링크</a>
<a href="mail.jsp">메일로 링크</a>
<a href="shopping.jsp">쇼핑으로 링크</a>
<%} else {}%> 
</body>
</html>