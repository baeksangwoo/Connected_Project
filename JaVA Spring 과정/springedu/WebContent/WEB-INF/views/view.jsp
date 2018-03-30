<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>
<h2><%=request.getAttribute("javax.servlet.forward.request_uri") %>
	---&gt; <%=request.getRequestURI() %>요청 성공!!</h2>

<!-- 꺽쇠 괄호 &gt  -->
</body>
</html>