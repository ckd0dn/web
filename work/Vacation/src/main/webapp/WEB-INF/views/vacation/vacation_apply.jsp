<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
	
	function apply( f ) {
		
		var start_date = f.start.value;
		var end_date = f.end.value;
		alert(start_date + "일부터 " + end_date + "일까지 휴가신청 되었습니다.");
		
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
		
		f.action="vacation_insert.do"
		f.submit();
	}
	
	
</script>
</head>
<body>
	<form action="">
			
			<ul>
				<li>이름: ${loginVO.emp_name}</li>
				<li>부서: ${loginVO.dept_name}</li>
				<li>관리자: ${loginVO.mgr}</li>
				<li>휴가 시작 날짜  <input type="date" name="start"> </li>
				<li>휴가 마지막 날짜  <input type="date" name="end"></li>
				<li><input type="button" value="신청하기" onclick="apply(this.form);"></li> 
			</ul>
		
	</form>
	
</body>
</html>