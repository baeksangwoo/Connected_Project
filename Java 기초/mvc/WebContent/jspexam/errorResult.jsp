<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>
<h1>요청을 처리하는 동안 오류가 발생했어욤ㅠㅠ</h1>

<h3>오류의 원인 . <%=request.getAttribute("sum")%> </h3>
<a href="/mvc/htmlexam/calcForm.html">입력화면으로</a>
</body>
</html>