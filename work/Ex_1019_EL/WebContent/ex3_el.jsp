<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	Map<String, String> map = new HashMap<>();
	map.put("test", "oracle.jdbc");
	map.put("url", "java:comp");
	map.put("id", "test2");
	map.put("pwd", "1111");
	
	request.setAttribute("my_map", map);
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	test : ${ requestScope.my_map.get("test") }<br>
	url : ${ my_map.get("url") }<br>
	url : ${ my_map['url'] }<br>
	id : ${ my_map["id"] }<br>
	pwd : ${ my_map.pwd }
</body>
</html>



















