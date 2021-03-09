<%@page import="vo.PersonVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
	List<String> sido = new ArrayList<>();
	sido.add("서울");
	sido.add("인천");
	sido.add("경기");
	sido.add("부산");
	sido.add("대전");
	sido.add("대구");
	
	request.setAttribute("city", sido);
	
	List<PersonVO> list = new ArrayList<>();
	list.add(new PersonVO("일길동", 20));
	list.add(new PersonVO("이길동", 30));

	request.setAttribute("list", list);
	
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<ul>
		<c:forEach var="v" items="${ city }">
			<li> ${ v } </li>
		</c:forEach>
	</ul>

	<hr>
	
	forEach를 사용한 index접근<br>
	<c:forEach var="value" items="${ city }" varStatus="in">
	
		<c:if test="${ in.index mod 2 eq 1 }">
			${ value }<br>
		</c:if>
	
	</c:forEach>

	<hr>
	
	ArrayList에 담긴 vo값 출력하기<br>
	<c:forEach var="p" items="${ list }" varStatus="cnt">
		
		<!-- cnt.index는 방번호(0부터)
		     cnt.count는 순번(1부터) -->
		${cnt.index} : ${cnt.count} : ${ p.name } / ${ p.age }<br>
		
	</c:forEach>

</body>
</html>











