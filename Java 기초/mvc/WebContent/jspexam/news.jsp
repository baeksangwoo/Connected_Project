<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import=" model.dao.NewsDAO, java.util.ArrayList" %>
<%@ page import=" model.vo.NewsVO" %>   

  
<!DOCTYPE html>
<html>
<head>
<script src="//code.jquery.com/jquery.min.js"></script>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<style>
	table{
		text-align:center;
		margin: auto;
	}
	td{
		 border-bottom:1px solid black;
	}
	div{
		text-align:center;
		margin: auto;
	}
	.foo
	{
		width: 400px;
   	 	padding-bottom: 10px;
   	 	vertical-align:18px;
	}
	.foo1
	{
		width: 400px;
		height: 50px;
   	 	padding-bottom: 10px;
   	 	vertical-align:50px;
	}
	
</style>

<script type="text/javascript">
 function div_OnOff(id){ 
	if (document.getElementById(id).style.display == "block") 
	{
		document.getElementById(id).style.display = 'none';
		document.getElementById(id).style.visibility = 'none';
	}
	else 
	{
		document.getElementById(id).style.display = 'block';
		document.getElementById(id).style.visibility = 'visible';
	}
} 
function div_reload(id, newsid){ 
	location.href = "/mvc/news.do?action=read&newsid="+newsid;
}
function div_search(newsid)
{
	location.href = "/mvc/news.do?action=read&newsid="+newsid;
}
</script>
<body>

<% ArrayList<NewsVO> list =(ArrayList<NewsVO>)request.getAttribute("list");%>
	<h1 align="center" style="color:purple;"> 뉴스 게시판 </h1>
	<div>
	<form method='get' action='/mvc/news.do?action=search&newsid='>
		<input type='text' name='id' placeholder='찾을 아이디를 입력헤 주세요' required >
		<h3 align="right" style="color:green;">찾기</h3>
	</form>
		
	</div>

	 <hr>
	 <table>
	 <tr>
	 <td width=60><h3 align="center" style="color:blue;">번호</h3></td>
	 <td width=400><h3 align="center" style="color:red;">제목</h3></td>
	 <td width=100><h3 align="center" style="color:#ff00ff;">작성자</h3></td>
	 <td width=200><h3 align="center" style="color:orange;">작성일</h3></td>
	 <td width=60><h3 align="center" style="color:#66ff99;">조회수</h3></td>
	 </tr>
	 <%for(NewsVO v : list){%>
	 <tr onclick="div_reload('reload',<%=v.getId() %>);return false;">
	<td width=60  style="cursor:pointer;"><%=v.getId() %></td>
	<td width=400 align="left" style="cursor:pointer;"><%=v.getTitle() %></td>
	<td width=100  style="cursor:pointer;"><%=v.getWriter() %></td>
	<td width=200  style="cursor:pointer;"><%=v.getWritedate() %></td>
	<td width=60  style="cursor:pointer;"><%=v.getCnt() %></td>

<% %> 
</tr>
<% }%>
</table>
<p align="center">
<button onclick="div_OnOff('show');" value="뉴스 작성">뉴스 작성</button>
</p>
<div id="show" style="display:none">
	<form method='post' action='/mvc/news.do'>
	<input type='text' class="foo" name='writer' placeholder='작성자 명을 입력해주세요' required><br>
	<input type='text' class="foo" name='title' placeholder='제목을 입력해주세요' required><br>
	<input type='text' class="foo1" name='content' placeholder='내용을 입력해주세요'required><br>
	<input type='reset' value='재작성'>
	<input type='submit' value='저장'>
	<input type='button' value='취소' onclick="div_OnOff('show')">
	</form>
</div>

<% NewsVO v =(NewsVO)request.getAttribute("getvalue");%>
<% if(v!=null){
	
	%>
<div id="reload">
<form method='post' action='/mvc/news.do?action=update&&newsid=<%=v.getId()%>'>
	<input id='writer' type='text' class="foo" name='writer' value='<%=v.getWriter() %>'><br>
	<input id='title' type='text' class="foo" name='title' value='<%=v.getTitle() %>'><br>
	<input id='content' type='text' class="foo1" name='content' value='<%=v.getContent() %>>' ><br>
	
	<input id='id' type='hidden' name='id' value ='<%=v.getId() %>'>
	<input type='button' value='확인' onclick="location.href='/mvc/news.do'">
	<input type='submit' value='수정'>
	<input type='button' value='삭제' onclick="location.href='/mvc/news.do?action=delete&newsid=<%=v.getId() %>'">
	</form>
</div>
<%} %>
</body>
</html>