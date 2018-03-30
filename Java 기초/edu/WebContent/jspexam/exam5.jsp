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
<%! 
	int multiply(int n1, int n2){
		return n1*n2;
		}	
%>


<%-- post방식에서는 utf-8을 해주어야한다. --%>

<%
	String p1= request.getParameter("num1");
	String p2= request.getParameter("num2");
	int result = 0;
	if(p1 !=null && p2!=null)
	{
		result= multiply(Integer.parseInt(p1),
				Integer.parseInt(p2));
	
%>


<h3><%= "연산 결과: "+result %></h3>
<% 
} else {
%>

<h2> num1= xx&num2=xx 쿼리를 전달하세요!</h2>

<%
}
%>

</body>
</html>