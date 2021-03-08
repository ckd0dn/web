<%@page import="dao.And_Write"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("UTF-8");

	//안드로이드에서 넘겨준 파라미터를 받는다
	String returns = "";
	String type = request.getParameter("type");
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	if(type == null){
		return;
	}else if( type.equals("type_regi")){
		And_Write write = And_Write.getInstance();
		returns = write.insert(id, pwd);
		out.print(returns);//성공 실패 여부를 안드로이드로 재 전송
	}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>