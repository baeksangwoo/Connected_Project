<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import=" model.dao.VisitorMyBatisDAO, java.util.List" %>
<%@ page import=" model.vo.VisitorVO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>
<% 
  if(request.getAttribute("msg")!=null){
    VisitorVO vo = (VisitorVO)request.getAttribute("vo");
    VisitorMyBatisDAO dao = (VisitorMyBatisDAO)request.getAttribute("dao");
    if(dao.insert(vo)){  
	%>
<h2><%=vo.getName() %>님의 글이 저장!</h2>
<%}else{ %>
<h2><%=vo.getName() %>님 오류 발생!</h2>
<%}%>
    
<a href ='/mvc/visitor'>방명록 리스트 보기</a>  
<% }else{ 
	 List<VisitorVO> list =  (List<VisitorVO>) request.getAttribute("list");
	 %>
	 <h1>방명록 리스트</h1>
	 <hr>
	 <table>
	 <tr>
	 <%for(VisitorVO v : list){%>

<td><%=v.getName() %></td>
<td><%=v.getWriteDate() %></td>
<td><%=v.getMemo() %></td>


<% %> 
</tr>
<% }%>
</table>
<a href ='/mvc/htmlexam/visitor.html'>방명록 작성하기</a>
<form  method='get' action ='/mvc/visitor3'>
<input type='search'name='name' required><input type='submit' value='검색'></form>
<% } %>



</body>
</html>