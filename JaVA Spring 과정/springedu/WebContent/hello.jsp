
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>
<%
	String result =(String)request.getAttribute("msg");
%>

표현식 태그: <%= result %>

<hr>
EL : ${msg}


<h1> 그그래그래그래그래그래그래그래그래</h1>

</body>
</html>