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
				var qa_idx = f.qa_idx.value;
				var pwd = f.pwd.value;
				var r_pwd = f.r_pwd.value;
				
				if(pwd==""){
					alert("비밀번호를 입력하세요");
					return;
				}
				
				if(r_pwd!=pwd){
					alert("비밀번호를 다시 입력하세요");
					return;
				}
				
				if(!confirm("정말로 삭제하시겠습니까?")){
					return;
				}
				
				var url="qa_del.do";
				var param = "qa_idx="+qa_idx+"&pwd="+pwd;
				
				sendRequest(url, param, resultFn, "POST");
			}
			
			function resultFn() {
				if(xhr.readyState == 4 && xhr.status == 200){
					var data = xhr.responseText;
					var json = eval(data);
					
					if(json[0].res=='yes'){
						alert("삭제가 완료되었습니다");
						location.href="qa_list.do?page=${ param.page }";
					}
				}
				
			}
			
			function modify(f) {
				var pwd = f.pwd.value;
				var r_pwd = f.r_pwd.value;
				
				if(pwd==""){
					alert("비밀번호를 입력하세요");
					return;
				}
				
				if(pwd != r_pwd){
					alert("비밀번호가 틀립니다");
					return;
				}
				
				location.href= "qa_update_form.do?qa_idx=${param.qa_idx}&page=${param.page}";
			}
			
			function reply(f) {
				var mgr = f.mgr.value;
				var pwd = f.pwd.value;
				var r_pwd = f.r_pwd.value;
				
				if(mgr!=1){
					alert("권한이 없습니다");
					return;
				}
				
				if(pwd==""){
					alert("비밀번호를 입력하세요");
					return;
				}
				
				if(r_pwd!=pwd){
					alert("비밀번호를 다시 입력하세요");
					return;
				}
				
				location.href="reply_form.do?qa_idx=${param.qa_idx}&page=${param.page}";
			}
		</script>
	</head>
	
	<body>
		<form>
			<input type="hidden" value="${ vo.qa_idx }" name="qa_idx">
			<input type="hidden" value="${loginVO.pwd }" name="r_pwd">
			<input type="hidden" value="${loginVO.mgr }" name="mgr">			
			
			<table border="1" align="center">
				<tr>
					<th>작성자</th>
					<td>${ vo.emp_name }</td>
				</tr>
						
				<tr>
					<th>제목</th>
					<td>${ vo.title }</td>
				</tr>
						
				<tr>
					<th>내용</th>
					<td><pre>${ vo.content }</pre></td>
				</tr>
				
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="pwd"></td>
				</tr>
			</table>
			
				<input type="button" value="수정" onclick="modify(this.form);">
				<input type="button" value="삭제" onclick="del(this.form);">
				<input type="button" value="목록으로" onclick="location.href='qa_list.do?page=${ param.page }'">
				
				<c:if test="${vo.depth lt 1}">
					<input type="button" value="댓글 쓰기" onclick="reply(this.form);">
				</c:if>
				
				
			</form>
	</body>
</html>