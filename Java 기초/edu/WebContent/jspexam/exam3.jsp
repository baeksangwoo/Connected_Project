<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>

<h1> 표현식 태그 테스트</h1>
<hr>
<% int number = 1000; %>
<ul>
<li> <%= 100  %></li>

<li> <%= 100+200  %></li>

<li> <%= new java.util.GregorianCalendar().get(java.util.Calendar.YEAR) %> </li>

<li> <%= "가나다".length()  %> </li>
<li> <%= request.getMethod()  %> </li>
<li> <%= request.getParameter("msg")  %></li>   <%-- 쿼리를 말하는 것이다. --%> 
<li> <%= 100 > 50%></li>
<li> <%= number %></li>
<li> <%= number/2  %></li>
</ul>

</body>
</html>