<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>예약 관리</title>
		<script type="text/javascript">
			function acc(res_idx){
				location.href = "res_choose.do?res_state=승인&&res_idx=" + res_idx;
			}
			
			function dec(res_idx){
				location.href = "res_choose.do?res_state=거절&&res_idx=" + res_idx;
			}
		</script>
	</head>
	
	<body>
		<table border="1">
			<tr>
				<th>예약자</th>
				<th>전화번호</th>
				<th>예약회의실</th>
				<th>예약날짜</th>
				<th>예약시간</th>
				<th>예약인원</th>
				<th>세부설명</th>
				<th>비고</th>
			</tr>
			<c:if test="${empty res_manage}">
				<tr>
					<td colspan="8">승인 대기상태인 예약이 없습니다</td>
				</tr>
			</c:if>
			<c:forEach var="admin" items="${res_manage}" >
			<tr>
				<td>${admin.res_name}</td>
				<td>${admin.res_tel}</td>
				<td>${admin.res_ridx}번</td>
				<td>
					<fmt:formatDate value="${admin.res_date}" pattern="yyyy-MM-dd"/>
				</td>
				<td>${admin.res_btime} ~ ${admin.res_etime}</td>
				<td>${admin.res_people}명</td>
				<td>${admin.res_content}</td>
				<td>
					<input type="button" value="승인" onclick="acc(${admin.res_idx});"/>
					<input type="button" value="거절" onclick="dec(${admin.res_idx});"/>
				</td>
			</tr>
			</c:forEach>
		</table>
	</body>
</html>