<%@page import="com.sun.org.apache.xalan.internal.xsltc.compiler.util.ResultTreeType"%>
<%@page import="bean.CarDAO"%>
<%@page import="bean.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 1. 입력한 값을 받아 램에 저장-->
    <!-- 2. db 처리 -->
    <!-- 3. 결과를 html로 표현 -->
    
    <!--  bag을 만들어서 클라이언트로 부터 넘어온 데이터를 bag에 넣음 -->
    <jsp:useBean id="bag" class="bean.MemberDTO"></jsp:useBean>
    <jsp:setProperty property="*" name="bag"/>
    
    <%
        	CarDAO dao = new CarDAO();
            	int result = dao.insert(bag);
            	// int ( 1 / 0) 중 하나의 값이 넘어옴
            	// 성공시 1, 실패시 0
            	String resultText = "";
            	if(result == 1){
            		resultText = "회원가입 성공";
            	}else{
            		resultText = "회원가입 실패";
            	}
        %>
    
    <%
    	// String id = request.getParameter("id");
    	// String pw = request.getParameter("pw");
    	// String name = request.getParameter("name");
    	// String tel = request.getParameter("tel");
    	
    	// MemberDTO bag = new MemberDTO();
    	// bag.setId(id);
    	// bag.setPw(pw);
    	// bag.setName(name);
    	// bag.setTel(tel);
    	
    	// dao.insert(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/project.css">
<!-- Latest compiled and minified CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div id="total">
		<div id="top">
			<jsp:include page="top.jsp"></jsp:include>
		</div>
		<div id="top2">
			<jsp:include page="top2.jsp"></jsp:include>
		</div>
		<div id="center">
	<%= resultText %>
	<a href="member.jsp">회원가입 / 로그인 페이지로 되돌아가기</a>
		</div>
		</div>
</body>
</html>