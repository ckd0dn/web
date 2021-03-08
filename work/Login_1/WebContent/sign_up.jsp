<%@page import="java.util.List"%>
<%@page import="vo.LoginVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.LoginDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("UTF-8");

	//안드로이드에서 넘겨준 파라미터를 받는다
	String returns = "";
	String type = request.getParameter("type");
	String name = request.getParameter("name");
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	String phone_number = request.getParameter("phone_number");
	String email = request.getParameter("email");
	
	LoginVO vo = new LoginVO();
	
	
	vo.setName(name);
	vo.setId(id);
	vo.setPwd(pwd);
	vo.setPhone_number(phone_number);
	vo.setEmail(email);
	
	System.out.println("id : "+id+", pwd : "+pwd);
	
	if(type == null){
		return;
	}else if( type.equals("type_regi")){
		LoginDAO sign = LoginDAO.getInstance();
		returns = sign.insert(vo);
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