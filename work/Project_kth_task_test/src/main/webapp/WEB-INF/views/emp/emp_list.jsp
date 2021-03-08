<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
			
		function emp_search(f) {
			
			var emp_name = f.emp_name.value;
			var dept_name = f.dept_name.value;
			
			
			f.action = "emp_list.do";		
			f.submit();	
		}


		</script>

</head>

<body>
<form>
	<div align="left">
		<input type="button" value="등록"
			onclick="location.href='emp_reg_form.do?page=${ empty param.page ? 1 : param.page }'">
	</div>

	<div>
		<h1 align="center">사원 목록</h1>
	</div>



	<table border="1" align="center">
		<tr>
			<td colspan="5"><select name="dept_name">
					<option>부서를 선택하세요.</option>
					<option>인사</option>
					<option>회계</option>
					<option>영업</option>
					<option>마케팅</option>
					<option>디자인</option>
					<option>IT</option>
			</select></td>

			<td align="right" colspan="2">
				<input type="text" name="emp_name" size="16" style="height: 17px;">
				<input type="button" value="검색" onclick="emp_search(this.form);">
			</td>
		</tr>

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
				<td><input type="button" value="상세보기"
					onclick="location.href='emp_view.do?emp_idx=${ vo.emp_idx }&page=${ param.page }'">
				</td>
			</tr>
		</c:forEach>

		<!-- 페이지 목록 -->
		<tr>
			<td colspan="7" align="center">${ pageMenu }</td>
		</tr>
	</table>
</form>

</body>
</html>