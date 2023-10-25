<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id");
    	MemberDAO dao = new MemberDAO();
    	int result = dao.delete(id);
    	String resultText = "회원탈퇴 실패";
    	if (result == 1) {
    		resultText = "회원탈퇴 완료";
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