<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- 주석 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>

<h2>JSP에서의 맴버변수와 지역변수</h2>
<hr>
<%! int member_v=0; %> <%-- 맴버변수를 만들때는 선언을해야한다. --%>
<% int local_v=0; %> 	<%-- 지역변수는 일반으로 만드는 것이다. --%>
<h3> member_v : <%= ++member_v %></h3>  <%-- 표현식만 올 수 있다 ;넣으면 안된다. --%>
<h3> local_v : <%= ++local_v %></h3>
<h1> 다시!</h1>
<% for(int d=0;d<10;d++){member_v+=d;}; %>
<h3> member_v : <%= member_v %></h3>  <%-- 표현식만 올 수 있다 ;넣으면 안된다. --%>
</body>
</html>