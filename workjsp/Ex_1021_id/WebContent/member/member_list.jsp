<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- model1 : 서블릿 없이 하나의 jsp영역에서 화면 구현, 입력, 출력까지 모두 다 처리하는 형태 
     model2 : 구현 로직과 처리로직을 분리해서 작업하는 형태
              jsp에서는 화면UI및 요청작업등을 하고, 서블릿에서는 처리(비즈니스)로직을
                            작업하는 형태로 분리해 둔 것.-->    
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<script src="../js/httpRequest.js" ></script>

	<script type="text/javascript">
		function del( idx ) {
			
			if( !confirm("정말로 삭제하시겠습니까?") ){
				return;
			}
			
			var url = "member_del.do";
			var par = "idx="+idx;
			sendRequest(url, par, result, "GET");

		}
		
		function result(){
			
			if( xhr.readyState == 4 && xhr.status == 200 ){
				
				//"[{'res':0}]"
				var data = xhr.responseText;
				var json = eval(data);
				
				if( json[0].res == 1 ){
					alert("삭제성공");
				}else{
					alert("삭제실패");
				}
				
				location.href = "member_list.do";
				
			}//if
			
		}//result()콜백
		
	</script>
</head>
<body>
	<table border="1">
		
		<tr>
			<td colspan="7">
				<input type="button" value="회원가입" 
				        onclick="location.href='member_insert_form.jsp'">
			</td>
		</tr>
		
		<tr>
			<th>회원번호</th>
			<th>이름</th>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이메일</th>
			<th>주소</th>
			<th>비고</th>
		</tr>
		
		<c:forEach var="vo" items="${ list }">
			<tr>
				<td>${ vo.idx }</td>
				<td>${ vo.name }</td>
				<td>${ vo.id }</td>
				<td>${ vo.pwd }</td>
				<td>${ vo.email }</td>
				<td>${ vo.addr }</td>
				<td>
					<input type="button" value="삭제" 
					       onclick="del('${vo.idx}');">
				</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>









