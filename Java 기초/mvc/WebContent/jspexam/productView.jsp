<%@page import="model.vo.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<style>
	a{
		width:200px;
		height: 98px;
		color: greenWhite;
		text-decoration: none;
		background: linear-gradient(to right, green , yellow, orange, red);
	}
</style>
<body>

<h1>선택된 상품 정보는 다음과 같습니다.</h1>
<% ProductVO vo=(ProductVO)request.getAttribute("cnt"); %>
<hr>

<p>선택된 사과의 개수 : <%=vo.getApple() %> </p>
<p>선택된 한라봉의 개수 :<%=vo.getOrange()%></p>
<p>선택된 바나나의 개수: <%=vo.getBanana() %></p>
<hr>
<a href="/mvc/htmlexam/product.html">상품 선택화면</a>


</body>
</html>