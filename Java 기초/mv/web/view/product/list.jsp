<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
#main_center{
	
	margin:0 20px;
	width:760px;
	height:480px;
	background:white;
}
</style>    
    
<div id="main_center">
<h1>product List Page</h1>
<table border="1">
<thead>
<tr>
<th>id</th>
<th>name</th>
<th>price</th>
<th>date</th>
<th>photo</th>
</tr>
</thead>
<tbody>
<c:forEach var="p" items="${productlist}">
<tr>
<td>${p.id }</td>
<td>${p.name }</td>
<td>${p.price }</td>
<td>${p.regdate }</td>
<td><img src="img/${p.imgname }"></td>
</tr>
</c:forEach>
</tbody>
</table>
</div>