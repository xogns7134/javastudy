<%@page import="bean.BbsVO"%>
<%@page import="bean.BbsDAO"%>
<%@page import="com.sun.org.apache.bcel.internal.generic.NEW"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--
    jsp에서 해야하는 작업 3가지
    1) form안에 입력한 데이터 받아서 저장 ==> java
    2) 받은 데이터를 DAO에 주기 ==> java
    3) 결과를 html로 만들기 ==> html/css/js
     -->
     <%
     	// 여기부터 자바코드
     	// form 안에 입력한 데이터 받아서 저장하기
     	// XMLHttpRequest request = new XMLHttpRequest();
     	// 미리 톰캣에서 자주 사용하는 부품을 new 이용해서 만들어놓음 ==> 내장된 객체
     	// 클라이언트로부터 데이터를 받아오는 객체 ==> request
     	String title = request.getParameter("title");
     	String content = request.getParameter("content");
     	String writer = request.getParameter("writer");
     	
     	BbsDAO dao = new BbsDAO();
     	BbsVO bag = new BbsVO();
     	
     	bag.setTitle(title);
		bag.setContent(content);
		bag.setWriter(writer);
		dao.insert(bag);
     %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="darkgray">
	<h5>입력한 회원정보를 확인해주세요</h5>
	<hr color="green">
	가입한 제목은 <%= title %> <br>
	가입한 내용은 <%= content %> <br>
	가입한 이름은 <%= writer %> <br>
</body>
</html>