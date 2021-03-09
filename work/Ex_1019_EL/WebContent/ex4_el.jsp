<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="vo.PersonVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	PersonVO vo = new PersonVO("마루치", 30);
	request.setAttribute("vo", vo);
	
	PersonVO vo2 = new PersonVO("아라치", 32);
	request.setAttribute("vo2", vo2);
	
	List<PersonVO> arr = new ArrayList<>();
	arr.add(vo);
	arr.add(vo2);
	request.setAttribute("m_arr", arr);
	
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	이름 : ${ requestScope.vo.getName() }<br>
	이름 : ${ vo['name'] }<br>
	나이 : ${ vo.age }<br>
	
	${ m_arr[0].name }<br>
	${ m_arr[0].age }
	
</body>
</html>













