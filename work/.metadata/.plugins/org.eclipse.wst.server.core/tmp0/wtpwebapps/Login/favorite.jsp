

<%@page import="java.util.List"%>
<%@page import="vo.FavoriteVO"%>
<%@page import="dao.FavoriteDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%

	request.setCharacterEncoding("UTF-8");
	//즐겨찾기
	String type = request.getParameter("type");
	String id = request.getParameter("id");
	System.out.println(id);
	
	String result = "";
	
	//연결이 되었다면 즐겨찾기 리스트를 안드로 보냄
	
	if(type == null){
		return;
	}else if( type.equals("type_regi")){
		
		
		result = FavoriteDAO.getInstance().selectList(id); 
		System.out.println(result);
		out.print(result);
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