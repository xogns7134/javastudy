<%@page import="bean.MemberVO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id");
    	MemberDAO dao = new MemberDAO();
		MemberVO bag = dao.one(id);
    	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="darkgray">
	<h3>검색한 id : <%= bag.getId() %></h3> <br>
	<h3>검색한 pw : <%= bag.getPw() %></h3> <br>
	<h3>검색한 name : <%= bag.getName() %></h3> <br>
	<h3>검색한 tel : <%= bag.getTel() %></h3> <br>
</body>
</html>