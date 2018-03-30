<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>

<h1> 선언문 태그 학습</h1>
<hr>
<% 
	int dan= Integer.parseInt(request.getParameter("dan"));
	if(dan<=9)
{
	for(int i=1;i<=9;i++){

%>
	<%=dan %>x<%=i %>=<%=dan*i%><br>
<% 
	} 
%>
<hr>

<%
	for(int i=1;i<=9;i++){
		out.print(dan+"x"+i+"="+dan*i+"<br>");
	}
}else{
%>
	<h3 style="color:#00ffff">1에서 9사이의 값을 입력해주세요!!</h3>
<%
}
%>

</body>
</html>