<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>

<h2>complete 결과</h2>


<hr>

<h1>count1 명칭으로 저장된 객체: 
	<%=session.getAttribute("count1") %></h1>
	
<h1>count2 명칭으로 저장된 객체: 
	<%=session.getAttribute("count2") %></h1>
</body>
</html>