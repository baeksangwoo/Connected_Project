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
<h1>User List Page</h1>
<table border="1">
<thead>
<tr>
<th>id</th>
<th>name</th>
<th>price</th>
</tr>
</thead>
<tbody>
<c:forEach var="i" items="${itemlist}">
<tr>
<td>${i.id }</td>
<td>${i.name }</td>
<td>${i.price }</td>
</tr>
</c:forEach>
</tbody>
</table>

</div>