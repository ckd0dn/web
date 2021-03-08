<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	function recognize( f ) {
		var vac_idx = f.vac_idx.value;
		f.action = "recognize.do";
		f.submit();
	}
	function reject( f ) {
		var vac_idx = f.vac_idx.value;
		f.action = "reject.do";
		f.submit();
	}
</script>
</head>
<body>
	<table border="1" align="center">
			<caption style="margin-bottom: 10px ">직원 휴가 관리</caption>
			<tr> 
				<th>이름</th>
				<th>부서</th>
				<th>휴가 시작 날짜</th>
				<th>휴가 마지막 날짜 </th>
				<th colspan="2">승인 요청</th>
			</tr>
		<form>
		<c:forEach var="vo" items="${list}">
			
			
			<tr> 
				<td>${vo.emp_name}</td>
				<td>${vo.dept_name}</td>
				<td>${fn:substring(vo.start,0,10) }</td>
				<td>${fn:substring(vo.end,0,10) }</td>
				<td><input type="button" value="승인" onclick="recognize(this.form);"/></td>
				<td><input type="button" value="거절" onclick="reject(this.form);"/></td>
				<td><input type="text" value="${vo.vac_idx}" name="vac_idx"/></td>
			</tr>
			
			
			
		</c:forEach>
		</form>
	</table>
</body>
</html>