<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="${ pageContext.request.contextPath }/resources/js/httpRequest.js"></script>

<script type="text/javascript">
	

	function gtw(f) {
		
		var commute_idx;
		var emp_idx = f.emp_idx.value;
		var url = "commute_insert.do";
		var param = "emp_idx="+emp_idx+"&commute_idx=";
		
		try {
			var commute_idx = f.commute_idx.value;
			param = "emp_idx="+emp_idx+"&commute_idx="+commute_idx;
			sendRequest(url, param, gtw_resultFn, "POST");
			
		} catch (e) {
			sendRequest(url, param, gtw_resultFn, "POST");
		}		
	}

	function gow(f) {
				
		if (!confirm("퇴근시간을 기록하시겠습니까?")) {
			return;

		}
		
		
		var commute_idx;
		var emp_idx = f.emp_idx.value;
		var url = "commute_update.do";
		var param = "emp_idx="+emp_idx+"&commute_idx=";
		
		try {
			var commute_idx = f.commute_idx.value;
			param = "emp_idx="+emp_idx+"&commute_idx="+commute_idx;
			sendRequest(url, param, gow_resultFn, "POST");
			
		} catch (e) {
			sendRequest(url, param, gow_resultFn, "POST");
		}				
	}

	function gtw_resultFn() {

		if (xhr.readyState == 4 && xhr.status == 200) {

			var data = xhr.responseText;

			if (data == 'no') {
				alert("오늘은 이미 출근하셨습니다.");
				return;
			}
			
			alert("출근이 완료되었습니다.")
			location.href = "commute_list.do";
		}

	}
 
	function gow_resultFn() {

		if (xhr.readyState == 4 && xhr.status == 200) {

			var data = xhr.responseText;
			var json = eval(data);
//			alert(data);
			if(json[0].result=='no' && json[1].ok=='nok'){
				alert("이미 퇴근한 상태입니다.");
				return;
			}
			
			if(json[0].result=='no_date' && json[1].ok=='ok'){
				alert("출근을 먼저 해주세요.");
				return;
			}
			
			
			alert("퇴근이 완료되었습니다.");
			location.href='commute_list.do';
		}

	}
	
</script>

</head>
<body>
	<form>
		<div align="center">
			<input type="button" value="출근" onclick="gtw(this.form);"> 
			<input type="button" value="퇴근" onclick="gow(this.form);"> 
			<input type="hidden" name="emp_idx" value="${loginVO.emp_idx}">
		</div>

		<div>
			<table border="1" align="center">

				<tr>
					<th>번호</th>
					<th>날짜</th>					
					<th>출근시간</th>
					<th>퇴근시간</th>
					<th>근무시간</th>
				</tr>

				<c:if test="${ empty list }">
					<tr>
						<td colspan="5" align="center">출퇴근 기록이 없습니다.</td>
					</tr>
				</c:if>


				<c:forEach var="vo" items="${ list }" varStatus="status">					
										
					<tr>
						<td>
							${ vo.commute_idx }
						</td>
						<td align="center">
							<fmt:formatDate value="${vo.c_date }" pattern="yyyy-MM-dd" />
						</td>
						<td align="center">
							<fmt:formatDate value="${ vo.gtw }" pattern="yyyy-MM-dd HH:mm:ss"/>
						</td>
						<td align="center">
							<fmt:formatDate value="${ vo.gow }" pattern="yyyy-MM-dd HH:mm:ss"/>
						</td>
						<td align="center">
							<fmt:formatNumber value="${ vo.diffhour / 60 }" pattern="0" />시
							<fmt:formatNumber value="${ vo.diffhour % 60 }" />분
						</td>
						<c:if test="${ status.first }">
						<td style="border:0 solid white;">
							<input type="hidden" value="${ list[0].commute_idx }" name="commute_idx">
						</td>
						</c:if>
					</tr>
					
				</c:forEach>
			</table>
			

		</div>
	</form>
</body>
</html>