<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	EL산술연산자<br>
	\${1 + 1} = ${ 1 + 1 }<br>
	\${4 - 2} = ${ 4 - 2 }<br>
	\${5 * 3} = ${ 5 * 3 }<br>
	\${10 / 3} = ${10 div 3}<br>
	\${10 % 3} = ${10 mod 3}<br>
	
	<hr>
	
	EL비교연산자<br>
	\${ 3 > 2 } = ${ 3 gt 2 }<br>
	\${ 3 >= 2 } = ${ 3 ge 2 }<br>
	\${ 3 < 2 } = ${ 3 lt 2 }<br>
	\${ 3 <= 2 } = ${ 3 le 2 }<br>
	\${ 3 == 2 } = ${ 3 eq 2 }<br>
	\${ 3 != 2 } = ${ 3 ne 2 }<br>
	
	<hr>
	
	EL삼항연산자<br>
	<!-- 파라미터로 넘어온 값(test.jsp?msg=안녕)이 있을때와 없을 때를 판단 -->
	${ empty param.msg ? '비었음' : '안녕' }<br>
	
	<hr>
	
	EL논리연산자<br>
	${ param.msg eq null or param.msg eq '' ? 'XXX' : 'OOO' }
	
</body>
</html>














