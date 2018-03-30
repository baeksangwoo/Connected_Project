<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import ='vo.LottoVO'
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>

<h2>전달된 데이터: ${ spring } </h2>

<h1>${lottoVO.result}  EL로 표기하는 것</h1>

<hr>
<% LottoVO vo =(LottoVO)request.getAttribute("lottoVO");
	if(vo!=null){
	%>
	<h1><%=vo.getResult()%> 기존의 servlet으로 만든 것!</h1>
	<jsp:useBean id="lottoVO" class ="vo.LottoVO" scope="request"/>
	<h2>	
	<jsp:getProperty property="result" name="lottoVO"/> 
	useBean에 넣은 것을 보여주는 것
	</h2>
<%
	}
%>


</body>
</html>