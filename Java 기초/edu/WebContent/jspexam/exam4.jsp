<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>

<h1> Query 문자열 처리 jsp 태그 테스트</h1>
<hr>
<% 
	request.setCharacterEncoding("UTF-8");
String name = request.getParameter("guestName"); %>

<%-- post방식에서는 utf-8을 해주어야한다. --%>

<h3> 당신의 이름은 <%= name %>입니다.</h3>
<h3>당신이 좋아하는 숫자는 <%= request.getParameter("num") %></h3>

</body>
</html>