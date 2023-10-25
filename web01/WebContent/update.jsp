<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id");
    	String tel = request.getParameter("tel");
    	MemberDAO dao = new MemberDAO();
		int result = dao.update(id, tel);
    	String resultText = "회원수정 실패";
    	if (result == 1) {
    		resultText = "회원수정 완료";
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="darkgray">
	<h3><%= resultText %></h3>
</body>
</html>