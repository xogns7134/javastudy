<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String no = request.getParameter("no");
    	BbsDAO dao = new BbsDAO();
    	int result = dao.delete(Integer.parseInt(no));
    	String result1 = "삭제 실패";
    	if (result == 1) {
    		result1 = "삭제 완료";
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3><%=result1 %></h3>
</body>
</html>