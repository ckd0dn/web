<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	
	<link rel="stylesheet" 
	      href="${ pageContext.request.contextPath }/resources/css/visit.css">
	      
	<script type="text/javascript" 
	        src="${ pageContext.request.contextPath }/resources/js/httpRequest.js"></script>      

	<script type="text/javascript">
	
		function del( f ) {
			
			var pwd = f.pwd.value;//원본비번
			var c_pwd = f.c_pwd.value;//사용자 입력 비번
			
			if( pwd != c_pwd ){
				alert("비밀번호가 다릅니다");
				return;
			}
			
			if( !confirm("정말 삭제하시겠습니까") ){
				return;
			}
			
			var url = "delete.do";
			var param = "idx=" + f.idx.value;
			sendRequest(url, param, resultFn, "GET");
			
		}//del()
		
		function resultFn() {
			
			if( xhr.readyState == 4 && xhr.status == 200 ){
				
				var data = xhr.responseText;
				
				if( data == 'no' ){
					alert("삭제실패. 관리자에게 문의하세요");
					return;
				}
				
				alert("삭제성공");
				location.href="list.do";
			}
			
		}
		
	
		function modify( f ) {
			var pwd = f.pwd.value;//원본비번
			var c_pwd = f.c_pwd.value;//사용자 입력 비번
			
			if( pwd != c_pwd ){
				alert("비밀번호가 다릅니다");
				return;
			}
			
			f.action = 'modify_form.do';
			f.submit();
			
		}
		
	</script>

</head>
<body>
	<div id="main_box">
		<h1>:::방명록 리스트:::</h1>
		
		<div align="center">
			<input type="button" value="글쓰기"
			       onclick="location.href='insert_form.do'">
		</div>
		
		<c:forEach var="vo" items="${list}">
			
			<div class="visit_box">
				<div class="type_content">
					<pre>${ vo.content }</pre><br>
					<c:if test="${ vo.filename ne 'no_file' }">
						<img src="resources/upload/${vo.filename}" width="200"/>
					</c:if>
				</div>
				
				
				
				<div class="type_name">작성자:${vo.name}(${vo.ip})</div>
				<div class="type_regdate">작성일:${ vo.regdate }</div>
				
				<div>
					<form>
						<input type="hidden" name="idx" value="${ vo.idx }">
						<input type="hidden" name="pwd" value="${ vo.pwd }">
						
						비밀번호:<input type="password" name="c_pwd">
						
						<input type="button" value="수정" onclick="modify(this.form);">
						<input type="button" value="삭제" onclick="del(this.form);">
						
					</form>
				</div>
				
			</div>
			
		</c:forEach>
	</div>
</body>
</html>















