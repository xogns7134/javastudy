<%@page import="bean.MemberVO"%>
<%@ page import="bean.CarDAO"%>
<%@ page languagecom.sun.org.apache.bcel.internal.generic.NEW8"
    pageEncoding="UTF-8"%>
    <!--
   	jsp에서 해야하는 작업 3가지 
   	1) form안에 입력한 데이터 받아서 저장해두자. ==> java
   	2) 받은 데이터를 DAO에게 주자.  ==> java
   	3) 결과를 html로 만들자. ==> html
     -->
     <% 
     	//자바코드를 쭉 쓰면 됨. 스크립트릿(let, 릿 ==> 작은 프로그램, 작은 코드 블럭)
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
		CarDAO dao = new CarDAO();
     	MemberVO bag = new MemberVO();
     	// bag 기능을 하는 DTO(VO)가 필요
		bag.setId(id);
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);
     	dao.insert(bag);emberVO(); //bag만들어줌.
     	bag.setId(id);
     	bag.setPw(pw);
     	bag.setName(name);
     	bag.setTel(tel);
     	//전달받은 데이터가 20개라면 데이터를 받아주는 코드 20줄, 가방에 넣는 코드 20줄
     	//다음주에는 MemberVO bag;
     	
     	dao.insert(bag);
     	//3. 결과를 html로 만들어서 클라이언트에 전송
     %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="red">
<h5>당신이 입력한 회원정보를 확인해주세요.</h5>
<hr color="green">
가입한 아이디는 <%= id %> <br> <!-- id변수에 있는 것 보여줘(프린트) -->
가입한 패스워드는 <%= pw %> <br>
가입한 이름은 <%= name %> <br>
가입한 전화번호는 <%= tel %> <br>
</body>
</html>