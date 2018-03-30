<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>


<h2>include 지시자와 액션태그 비교</h2>
<hr>
<%-- <%@ include file="date.jsp" %> 지역 변수가 2번있으니 문제가 난것이다!
<hr>
<%@ include file="date.jsp" %>  --%>
<br>
<jsp:include page="date.jsp" /> 
<jsp:include page="date.jsp" /> 
<%@ include file="part1.jspf" %>
</body>
</html>