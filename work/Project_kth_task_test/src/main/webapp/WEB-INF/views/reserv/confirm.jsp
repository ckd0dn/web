<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>예약확인</title>
		<script type="text/javascript">
			function del(res_idx){
				location.href="res_del.do?res_idx=" + res_idx;
			}
		</script>
	</head>
	
	<body>
		<table border="1">
			<tr>
				<th>예약회의실</th>
				<th>예약날짜</th>
				<th>예약시간</th>
				<th>예약인원</th>
				<th>세부설명</th>
				<th>승인여부</th>
				<th>비고</th>
			</tr>
			<c:if test="${empty res_user}">
				<tr>
					<td colspan="8">등록한 예약이 없습니다</td>
				</tr>
			</c:if>
			<c:forEach var="user" items="${res_user}">
		
			<tr>
				<td>${user.res_ridx}번</td>
				<td>
					<fmt:formatDate value="${user.res_date}" pattern="yyyy-MM-dd"/>
				</td>
				<td>${user.res_btime} ~ ${user.res_etime}</td>
				<td>${user.res_people}명</td>
				<td>${user.res_content}</td>
				<td>${user.res_state}</td>
				<td>
					<input type="button" value="예약취소" onclick="del(${user.res_idx});"> 
				</td>
			</tr>
			</c:forEach>
		</table>
	</body>
</html>