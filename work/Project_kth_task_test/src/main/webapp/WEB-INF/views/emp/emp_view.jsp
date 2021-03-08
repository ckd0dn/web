<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="${ pageContext.request.contextPath }/resources/js/httpRequest.js"></script>
<script type="text/javascript">
	function emp_del(f) {
		var emp_idx = f.emp_idx.value;
		if(!confirm("정말 삭제하시겠습니까?")){
			return;
		}
		
		var url = "emp_del.do";
		var param = "emp_idx="+emp_idx;
		
		sendRequest(url,param,resultFn,"POST");
	}
	
	function resultFn() {
		if(xhr.readyState==4 && xhr.status==200){
			var result = xhr.responseText;
			
			if(result=="no"){
				alert("삭제에 실패했습니다. 관리자에게 문의해주세요.");
				return;
			}
			
			alert("삭제에 성공했습니다.");
			location.href="emp_list.do?page=${param.page}";
		}
	}
</script>
</head>
<body>

	<div>
		<h1 align="center">사원 상세 정보</h1>
	</div>

	<form>
		<input type="hidden" name="emp_idx" value="${ vo.emp_idx }">
		<table border="1" align="center">
		<tr>
			<th>부서</th>
			<td>${ vo.dept_name }</td>
		</tr>

		<tr>
			<th>이름</th>
			<td>${ vo.emp_name }</td>
		</tr>

		<tr>
			<th>성별</th>
			<td>${ vo.gender }</td>
		</tr>

		<tr>
			<th>주민등록번호</th>
			<td>${ vo.reg_num }</td>
		</tr>

		<tr>
			<th>이메일</th>
			<td>${ vo.email }</td>
		</tr>

		<tr>
			<th>주소</th>
			<td>${ vo.addr } ${ vo.addr_info }</td>
		</tr>

		<tr>
			<th>입사일</th>
			<td>
				<fmt:formatDate value="${ vo.hire_date }" pattern="yyyy-MM-dd"/>
			</td>	
		</tr>

		<tr>
			<th>아이디</th>
			<td>${ vo.id }</td>
		</tr>

		<tr>
			<th>비밀번호</th>
			<td>${ vo.pwd }</td>
		</tr>

		<tr>
			<td align="center">
				<input type="button" value="취소" onclick="location.href='emp_list.do?page=${param.page}'">
			</td>
			<td align="right">
				<input type="button" value="수정" onclick="location.href='emp_update_form.do?emp_idx=${vo.emp_idx}&page=${param.page}'">
				<input type="button" value="삭제" onclick="emp_del(this.form);">
			</td>
		</tr>		
		</table>

	</form>

</body>
</html>