<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.vo.MemberVO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>

<h1>회원 정보</h1>

<hr>

<% MemberVO vo=(MemberVO)request.getAttribute("member");%>

 <ul>
 
 	<li>회원 이름: <%=vo.getName() %>
 	<li>회원 계정 : <%= vo.getId() %> </li>
 	<li>회원 암호 :<%= vo.getPassword() %> </li>
 	<li>회원 전화번호 : <%= vo.getTelphone() %></li>
 	
 </ul>
 <hr>
 
 <h1> EL로 표현하는 회원 정보</h1>
<hr>
<ul>

 	<li>회원 이름 : ${requestScope.member.name} </li>
 	<li>회원 계정: ${member.id} </li>
 	<li>회원 암호: ${member.password}</li>
 	<li>회원 전화번호: ${member.telphone} </li>
</ul>

<h1> 회원정보 (표준 액션 태그)</h1>
<hr>
<jsp:useBean id="member" class="model.vo.MemberVO" scope="request"/><!-- 자바를 모르면 이렇게 쓴다.. -->
<ul>
 
 	<li>회원 이름: <jsp:getProperty name="member" property="name"/> 태그다아아아</li>
 	<li>회원 계정 : <jsp:getProperty name="member" property="id"/> 태그다아아아</li>
 	<li>회원 암호 : <jsp:getProperty name="member" property="password"/> 태그다아아아</li>
 	<li>회원 전화번호 :  <jsp:getProperty name="member" property="telphone"/>태그다아아아</li>
 	
 </ul>
 
</body>
</html>