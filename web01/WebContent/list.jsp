<%@page import="bean.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
	MemberDAO dao = new MemberDAO();
	ArrayList<MemberVO> list = dao.list();
	
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>아이디</td>
			<td>비밀번호</td>
			<td>이름</td>
			<td>전화번호</td>
		</tr>
	<%
		for(MemberVO bag: list) {
	%>
		<tr>
			<td><%=bag.getId()%></td>
			<td><%=bag.getPw()%></td>
			<td><%=bag.getName()%></td>
			<td><%=bag.getTel()%></td>
		</tr>
	<% } %>
	</table>
</body>
</html>