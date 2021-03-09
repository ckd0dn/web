<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	int dan = Integer.parseInt( request.getParameter("dan") );
	String str = "";
	
	for( int i = 1; i <= 9; i++ ){
		str += String.format("%d * %d = %d<br>", dan, i, dan*i);
	}
	
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- ajax는 화면에 뿌려지는 값을 텍스트화 해서 요청했던 콜백메서드로 보내준다 -->
	<%= str %>
</body>
</html>












