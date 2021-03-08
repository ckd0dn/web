<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script src="${pageContext.request.contextPath}/resources/js/httpRequest.js"></script>
		
		<script type="text/javascript">
			function del(f) {
				var idx = f.idx.value;
				var mgr = f.mgr.value;
				
				if(mgr!=1){
					alert("권한이 없습니다");
					return;
				}
				
				
				if(!confirm("정말로 삭제하시겠습니까 ?")){
					return;
				}
					
				var url = "del.do";
				var param = "idx=" + idx;
					
				sendRequest(url, param, resultFn, "POST");
			}
			
			function resultFn() {
				var f = document.ff;
				var mgr = f.mgr.value;
				
				if(xhr.readyState==4 && xhr.status==200){
					var data = xhr.responseText;
					var json = eval(data);
					
					if(json[0].res=="yes"){
						alert("삭제가 완료되었습니다");
						location.href="list.do?page=${param.page}";
					}
					
				}
			}
			
			function modify(f) {
				var idx = f.idx.value;
				var mgr = f.mgr.value;
				
				if(mgr!=1){
					alert("권한이 없습니다");
					return;
				}
				
				location.href="update_form.do?idx="+idx;
			}
			
			function home() {
				location.href="list.do?page=${param.page}";
				
			}
		</script>
	</head>
	
	<body>
		<form name="ff" >
		
		<input type="hidden" name="mgr" value="${loginVO.mgr }">
		<input type="hidden" value="${ vo.board_idx }" name="idx">
		
			<table border="1" align="center">
			
					<tr>
						<td>작성자</td>
						<td>${ vo.emp_name }</td>
					</tr>
					
					<tr>
						<td>제목</td>
						<td>${ vo.title }</td>
					</tr>
					
					<tr>
						<td>내용</td>
						<td><pre>${ vo.content }</pre></td>
					</tr>
	
			</table>
			
			<input type="button" value="수정" onclick="modify(this.form);">
			<input type="button" value="삭제" onclick="del(this.form);">
			<input type="button" value="목록으로" onclick="home();">
		</form>
	</body>
</html>