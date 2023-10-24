<%@page import="bean.MemberVO"%>
<%@page import="bean.MemberDAO"%>
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
     	// 1) form 안에 입력한 데이터 받아서 저장하기
     	// XMLHttpRequest request = new XMLHttpRequest();
     	// 미리 톰캣에서 자주 사용하는 부품을 new 이용해서 만들어놓음 ==> 내장된 객체
     	// 클라이언트로부터 데이터를 받아오는 객체 ==> request
     	String id = request.getParameter("id");
     	String pw = request.getParameter("pw");
     	String name = request.getParameter("name");
     	String tel = request.getParameter("tel");
     	
     	// 2) 받은 데이터를 DAO에 주기
		MemberDAO dao = new MemberDAO();
     	MemberVO bag = new MemberVO();
     	// bag 기능을 하는 DTO(VO)가 필요
		bag.setId(id);
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);
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
	가입한 아이디는 <%= id %> <br><!-- id 변수에 있는 것을 프린트 -->
	가입한 비밀번호는 <%= pw %> <br>
	가입한 이름은 <%= name %> <br>
	가입한 전화번호는 <%= tel %> <br>
</body>
</html>