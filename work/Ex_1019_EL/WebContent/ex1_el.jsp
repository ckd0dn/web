<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//EL(Expression Language) : JSP에서 사용하는 표현식을 더 간결하게 
	//쓸 수 있도록 도와주는 표현언어
	//EL로 값을 표기하기 위해서는 4개 영역(page, request, session, application)
	//에 실제로 존재하는 데이터만 사용 가능
	
	/*
	1) page영역 : page에 저장된 데이터는 현재 페이지에서만 사용이 가능
	2) request영역(가장 많이 사용하는 영역) : 두 개의 페이지에서 키값을 공유할 수 있다.
    3) session영역(두번째로 많이 사용하는 영역) : 전역개념으로 페이지가 닫혀도 메모리상에 
	   남아있다. 하나의 웹 브라우저에서 공유가 가능
	4) application : 하나의 프로젝트에서 값을 공유
	*/
	
	String msg = "안녕";
	
	//pageScope영역에 값을 저장
	pageContext.setAttribute("msg", msg);
	
	//requestScope영역에 값을 저장
	request.setAttribute("msg", "request영역의 값");
	
	//sessionScope영역에 값을 저장
	session.setAttribute("msg2", "session영역의 값");
	
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	JSP출력코드 : <%= msg %><br>
	EL표현식(pageScope) : ${ pageScope.msg }<br>
	EL표현식(requestScope) : ${ requestScope.msg }<br>
	EL표현식(sessionScope) : ${ sessionScope.msg2 }<br>
	EL표현식(생략식) : ${ msg }<br>
	
	<!-- test.jsp?greet=hi  <-- hi라는 데이터를 가져옴 -->
	EL표현식(파라미터) : ${ param.greet }
	
	<!-- 생략식을 사용한 EL표기법 적용시 영역 참조 순서 
		1.page
		2.request
		3.session
		4.application
	-->
	
</body>
</html>













