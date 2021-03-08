<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="${ pageContext.request.contextPath }/resources/js/httpRequest.js"></script>
<script type="text/javascript">
	function commute_search(f) {
		
		var emp_name = f.emp_name.value;
		var dept_name = f.dept_name.value;
		
		
		f.action = "commute_view_list.do";		
		f.submit();	
	}
	
	
	function emp_idx(emp_idx) {
		
		// emp_idx를 ajax로 보내서, commute_view에 gow가 있는지 없는지 판단하여 있으면 이미 퇴근했다고 완료시키고 없으면 퇴근을 대신 찍어주는 방식을 이용
		var url = "gow.do";
		var param = "emp_idx="+emp_idx;
		
		sendRequest(url,param,gow_resultFn,"POST");
	}
	
	function gow_resultFn() {
		if(xhr.readyState==4 && xhr.status==200){
			var data = xhr.responseText;
			
			if(data=='no'){
				alert("이미 퇴근한 상태입니다.");
				return;
			}
			
			alert("퇴근이 완료되었습니다.");
			location.href="commute_view_list.do";
		}
	}
</script>
</head>
<body>
	
	<form>
	<table border="1" align="center">
		
		<div align="center">
			<h1>직원별 당일 출퇴근 기록</h1>
		</div>
		
		<tr>
			<th>날짜</th>
			<th>부서명</th>
			<th>이름</th>
			<th>출근</th>
			<th>퇴근</th>
			<th>비고</th>
		</tr>
		
		<c:forEach var="cv_list" items="${ cv_list }">		
		<tr>
			<td align="center">
				<fmt:formatDate value="${ cv_list.c_date }" pattern="yyyy-MM-dd"/>
			</td>
			<td>${ cv_list.dept_name }</td>
			<td>${ cv_list.emp_name }</td>
			
			<td>
				<fmt:formatDate value="${ cv_list.gtw }" pattern="yyyy-MM-dd HH:mm:ss"/>
			</td>
			<td>
				<fmt:formatDate value="${ cv_list.gow }" pattern="yyyy-MM-dd HH:mm:ss"/>
			</td>
			<td>
				<input type="button" value="퇴근" onclick="emp_idx(${cv_list.emp_idx});">
			</td>
		</tr>
		</c:forEach>
	
		<tr>
			<td>
				<select name="dept_name">
					<option>부서를 선택하세요.</option>
					<option>인사</option>
					<option>회계</option>
					<option>영업</option>
					<option>마케팅</option>
					<option>디자인</option>
					<option>IT</option>
				</select>
			</td>
			<td align="center" colspan="3">
				${ pageMenu }
			</td>
			<td align="right" colspan="2">
				<input type="text" name="emp_name" size="16" style="height:17px;">
				<input type="button" value="검색" onclick="commute_search(this.form);">
			</td>
		</tr>
	</table>
	
	</form>
</body>
</html>