<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String id= request.getParameter("id");
	String pwd= request.getParameter("pwd");
	
	System.out.println(id+" "+pwd);
%>