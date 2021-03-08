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

		if (!confirm("출근시간을 기록하시겠습니까?")) {
			return;
		}
		
		
		var commute_idx;
		var emp_idx = f.emp_idx.value;		
		var url = "commute_insert.do";
		var param = "emp_idx=" + emp_idx + "&commute_idx=";

		try {
			var commute_idx = f.commute_idx.value;
			param = "emp_idx=" + emp_idx + "&commute_idx=" + commute_idx;
			sendRequest(url, param, resultFn1, "GET");
			
		} catch (e) {
			sendRequest(url, param, resultFn1, "GET");
		}
		
		

	}

	function gow(f) {

		if (!confirm("퇴근시간을 기록하시겠습니까?")) {
			return;

		}

		var idx = document.getElementById('commute_idx').value;
		var url = "commute_update.do";
		var param = "commute_idx=" + commute_idx;
		sendRequest(url, param, resultFn2, "GET");

	}

	function resultFn1() {

		if (xhr.readyState == 4 && xhr.status == 200) {

			var data = xhr.responseText;

			if (data == 'yes') {
				alert("출근");
				return;
			}
			alert("오늘은 이미 출근하였습니다.")
			location.href = "commute_list.do";
		}

	}

	function resultFn2() {

		if (xhr.readyState == 4 && xhr.status == 200) {

			var data = xhr.responseText;

			if (data == 'yes') {
				alert("퇴근");
				return;
			}
			alert("이미 퇴근하였습니다.")
			location.href = "commute_list.do";
		}

	}
</script>

</head>
<body>
	<form>
		<div align="center" style="margin-bottom: 30px">

			<input type="button" value="출근" onclick="gtw(this.form);"> 
			<input type="button" value="퇴근" onclick="gow(this.form);"> 
			<input value="1">
		</div>

		<div>



			<table width="800" align="center" border="1"
				style="border-collapse: collapse">



				<tr>
					<th width="25%">날짜</th>
					<th width="25%">출근시간</th>
					<th width="25%">퇴근시간</th>
					<th width="25%">근무시간</th>
				</tr>

				<c:forEach var="vo" items="${ list }">

					<input type="text" name="emp_idx" value="1"/>
					<input type="text" name="commute_idx" value="${ vo.idx }"/>
					<tr>
						<td align="center"><fmt:formatDate value="${vo.c_date }"
								pattern="yyyy-MM-dd" /></td>
						<td align="center">${ vo.gtw }</td>
						<td align="center">${ vo.gow }</td>
						<td align="center"><fmt:formatNumber
								value="${ vo.diffhour / 60 }" pattern="0" />시<fmt:formatNumber
								value="${ vo.diffhour % 60 }" />분</td>
					</tr>
				</c:forEach>
			</table>


		</div>
	</form>
</body>
</html>