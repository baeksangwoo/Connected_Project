<%@page import="java.time.LocalDate"%>
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
	LocalDate id=LocalDate.now();
%>
<%=id.getYear() %>년
<%=id.getMonthValue() %>월
<%=id.getDayOfMonth() %>일
<%=id.getDayOfMonth() %>일
<%=id.getDayOfMonth() %>일

</body>
</html>