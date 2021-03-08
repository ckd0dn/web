<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
	
	function apply( f ) {
		
		//휴가 중복 체크
		<c:forEach var="vo" items="${list}">
			if (${loginVO.emp_idx} == ${vo.emp_idx}) {
				if (${vo.check_vac} == 0) {
					alert("이미 휴가 신청이 되어있습니다");
					return;
				}
			} 
		</c:forEach>
		
		var start_date = f.start.value;
		var end_date = f.end.value;
		
		<c:forEach var="vo" items="${list}">
		if (${loginVO.emp_idx} == ${vo.emp_idx} && ${vo.check_vac} != 2) {
			if ( ("${vo.start}" >= start_date && "${vo.start}" <= end_date ) ||
					start_date >= "${vo.start}" && start_date <= "${vo.end}")  {
				alert("휴가 날짜가 겹치는 구간이 있습니다.");
				return;
				}
			} 
		</c:forEach>
		
		
		//유효성 체크
		if( start_date == ""){
			alert("시작 날짜를 등록하세요")
			return;
		}
		
		if( end_date == ""){
			alert("마지막 날짜를 등록하세요")
			return;
		}
		
		/* 시작날짜가 마지막날짜 보다 큰경우 */
		if(end_date < start_date){
			alert("시작 날짜가 마지막 날짜보다 나중입니다")
			return;
		}
		
		alert(start_date + "일부터 " + end_date + "일까지 휴가신청 되었습니다.");
		
		f.action="vacation_insert.do";
		f.submit();
	}
	
	
</script>
</head>
<body>
	<form>

		<ul>
			<li>이름: ${loginVO.emp_name}</li>
			<li>부서: ${loginVO.dept_name}</li>
			<li>관리자: ${loginVO.mgr}</li>
			<li>휴가 시작 날짜 <input type="date" name="start">
			</li>
			<li>휴가 마지막 날짜 <input type="date" name="end"></li>
			<li><input type="button" value="신청하기"
				onclick="apply(this.form);"></li>
		</ul>

	</form>

	<table border="1">
		<tr>
			<th>NO</th>
			<th>휴가 시작날짜</th>
			<th>휴가 마지막날짜</th>
			<th>승인여부</th>
		</tr>

		<c:forEach var="v" items="${list}">
			<tr>
				<td>${v.vac_idx}</td>
				<td>${v.start}</td>
				<td>${v.end}</td>

				<c:if test="${v.check_vac eq 0}">
					<td>대기</td>
				</c:if>

				<c:if test="${v.check_vac eq 1}">
					<td>승인</td>
				</c:if>

				<c:if test="${v.check_vac eq 2}">
					<td>거절</td>
				</c:if>
			</tr>

		</c:forEach>
	</table>

</body>
</html>