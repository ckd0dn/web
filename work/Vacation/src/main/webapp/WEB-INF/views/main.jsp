<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<script type="text/javascript">
		function management() {
			
			if(${loginVO.mgr}==1){
				location.href='vacation_management.do';
			}else{
				alert("관리자 권한이 없습니다");
				return;
				
			}
			
		}
	</script>
</head>
<body>
	<input type="button" value="휴가신청" onclick="location.href='vacation_apply.do'"> 
	<input type="button" value="휴가관리" onclick="management();"> 
	<input type="button" value="휴가확인" onclick="location.href='calendar.do'"> 
	
${ loginVO.id } 

</body>
</html>