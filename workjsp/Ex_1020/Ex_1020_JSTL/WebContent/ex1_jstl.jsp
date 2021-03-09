<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- JSTL( JSP Standard Tag Library ) 
     jsp에서 스크립트 릿 없이 if, for문 등을 사용 가능하게 해 주는 라이브러리-->    

<!-- c(core) : if, forEach와 같은 제어문을 사용할 수 있도록 해 주는 라이브러리 -->    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  

<!-- fmt(format) : 날짜나 숫자형식을 포멧팅하는 라이브러리 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
  
<%
	Date today = new Date();
	int money = 120000000;
	
	request.setAttribute("today", today);
	request.setAttribute("money", money);
	
	//자바의 배열
	String[] arr = {"사과", "배", "포도", "참외", "복숭아"};
	request.setAttribute("arr", arr);
	
	//자바의 향상된 for문
	for( String s : arr ){
		System.out.println(s);
	}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	JSTL을 통한 포멧 지정<br>
	<fmt:formatDate value="${ today }"/><br>
	<fmt:formatDate value="${ today }" pattern="YYYY년 MM월 dd일"/><br>
	통장잔액 : &#8361;<fmt:formatNumber value="${ money }"/>
	
	<hr>
	
	JSTL을 통한 forEach, if문<br>
	<!-- var : 1회전 마다 갱신되는 begin값을 담는 변수
	     begin : 시작값
	     end : 끝 값
	     step : 증가값 -->
	<c:forEach var="n" begin="1" end="5" step="1">
	
		<c:if test="${ n mod 2 eq 1 }">
			<font color="red">안녕${n}</font><br>
		</c:if>
		
		<c:if test="${ n mod 2 eq 0 }">
			<font color="blue">안녕${n}</font><br>
		</c:if>
	
	</c:forEach>
	
	<hr>
	
	<!-- for( String fruit : arr ) -->
	<c:forEach var="fruit" items="${ arr }">
		
		${ fruit }<br>
		
	</c:forEach>
	
</body>
</html>



















