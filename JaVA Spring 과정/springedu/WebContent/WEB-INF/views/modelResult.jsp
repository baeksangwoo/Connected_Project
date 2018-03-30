<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>


<h1>컨트롤러에서 전달되는 데이터 받기</h1>
<hr>
<ul>
	<li>${v1 }</li>
	<li>배열</li>
		<ul>
		<li>${v2[0]}</li>
		<li>${v2[1]}</li>
		<li>${v2[2]}</li>
		<li>${v2[3]}</li>
		</ul>
<li>${v3}</li>
<li>${v4}</li>
</ul>
</body>
</html>