<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import ='vo.QueryVO'%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>응답용 JSP</title>
</head>
<body>
<h2>QueryString Controller1 으로 부터 QueryView2.jsp로 forward 됨</h2>

<hr>
<% 
	QueryVO vo =(QueryVO)request.getAttribute("queryVO");
	if(vo!=null){
	%>

	<ul>
		<li>${queryVO.testName}</li>
		<li>${queryVO.testAge}</li>
		<li>${queryVO.testAddr}</li>
	</ul>
<%
	}
%>
<h3>전달된 데이터: ${spring}</h3>
</body>
</html>