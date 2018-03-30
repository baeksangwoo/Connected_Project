<%@page import="vo.ProductVO"%>
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

<hr>

<% if(session.getAttribute("count1")==null) {%>


<p>선택된 사과의 개수 : 0 </p>
<p>선택된 한라봉의 개수 : 0 </p>
<p>선택된 바나나의 개수: 0 </p>
<% 

} else { %>

<p>선택된 사과의 개수 : ${sessionScope.count1.apple} </p>
<p>선택된 한라봉의 개수 :${sessionScope.count1.orange }</p>
<p>선택된 바나나의 개수: ${sessionScope.count1.banana} </p>
<hr>
<% } %>
<a href="/springedu/product.html">상품 선택화면</a>


</body>
</html>