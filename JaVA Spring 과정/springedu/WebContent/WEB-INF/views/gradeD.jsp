<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head> 
<body>
	<h1><%String content = (String)request.getAttribute("content");%> ${content} 님은 D등급입니다. 우수한 성적이시네요!</h1>
	<a href="/spmvclab/eduForm.html">성적 입력 화면으로</a>
	
</body>
</html>