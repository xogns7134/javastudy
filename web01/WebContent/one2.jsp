<%@page import="bean.BbsVO"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String no = request.getParameter("no");
    	BbsDAO dao = new BbsDAO();
    	BbsVO bag = dao.one(Integer.parseInt(no));
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>검색한 번호 : <%=bag.getNo() %></h3>
<h3>검색한 제목 : <%=bag.getTitle() %></h3>
<h3>검색한 내용 : <%=bag.getContent() %></h3>
<h3>검색한 글쓴이 : <%=bag.getWriter() %></h3>
</body>
</html>