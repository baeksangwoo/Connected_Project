<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>

<h1 style='color:red'>선택한 상품은 <%=request.getAttribute("getvalue") %> 이네요!</h1>

<button onclick="location.href='/mvc/htmlexam/productlog.html'">클릭클릭~</button>
</body>
</html>