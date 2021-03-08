<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>

	<body>
	
		<div align="left" >
			<input type="button" value="등록" onclick="location.href='emp_reg_form.do?page=${ empty param.page ? 1 : param.page }'">
		</div>
		
		<div>
			<h1 align="center">사원 목록</h1>
		</div>
				
		<table border="1" align="center">
			<tr>
				<th>번호</th>
				<th>부서</th>
				<th>이름</th>
				<th>전화번호</th>
				<th>아이디</th>
				<th>비밀번호</th>
				<th>비고</th>
			</tr>
		
			<c:forEach var="vo" items="${ emp_list }">
			<tr>
				<td>${ vo.emp_idx }</td>
				<td>${ vo.dept_name }</td>
				<td>${ vo.emp_name }</td>
				<td>${ vo.phone }</td>
				<td>${ vo.id }</td>
				<td>${ vo.pwd }</td>
				<td>
					<input type="button" value="상세보기" onclick="location.href='emp_view.do?emp_idx=${ vo.emp_idx }&page=${ param.page }'">
				</td>
			</tr>			
			</c:forEach>
			
			<!-- 페이지 목록 -->
			<tr>
				<td colspan="7" align="center">
					${ pageMenu }
				</td>
			</tr>
		</table>

		
	</body>
</html>