<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(session.getAttribute("id")==null){
		out.print("로그인을 해주세요. <br>");
		out.print("로그인 아이디: <input name=id>");
	} else {
		out.print(session.getAttribute("id")+"님이 로그인 되었습니다.");		
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
뉴스 페이지 - 로그인되었을때만 댓글을 작성할 수 있습니다
</body>
</html>