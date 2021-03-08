<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		
		<script src="${pageContext.request.contextPath}/resources/js/httpRequest.js"></script>
		
		<script type="text/javascript">
			function send(f) {
				var title = f.title.value;
				var content = f.content.value;
				var qa_idx = f.qa_idx.value;
				var pwd = f.pwd.value;
				var r_pwd = f.r_pwd.value;
				
				if(title==""){
					alert("제목을 입력하세요");
					return;
				}
				
				if(content==""){
					alert("내용을 입력하세요");
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
				
				if(!confirm("내용을 수정하시겠습니까?")){
					return;
				}
				
				var url = "qa_update.do";
				var param = "qa_idx="+qa_idx+"&title="+title+"&content="+content;
				
				sendRequest(url, param, resultFn, "POST");
			}
			
			function resultFn() {
				var f = document.ff;
				
				
				if(xhr.readyState == 4 && xhr.status == 200){
					var data = xhr.responseText;
					
					if(data=='yes'){
						alert("수정을 완료하였습니다");
						location.href="qa_list.do";
					}else{
						alert("수정을 실패하였습니다");
					}
				}
				
			}
		</script>
	</head>
	
	<body>
		<form name="ff">
		
			<input type="hidden" value="${ vo.qa_idx }" name="qa_idx">
			<input type="hidden" value="${ vo.pwd }" name="r_pwd">
			
			<table border="1" align="center">
				<caption>:::글 수정:::</caption>
			
				<tr>
					<th>제목</th>
					<td><input name="title" value="${ vo.title }"></td>
				</tr>
				
				<tr>
					<th>내용</th>
					<td><textarea rows="7" cols="19" name="content">${ vo.content }</textarea></td>
				</tr>
				
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="pwd"></td>
				</tr>
				

			</table>
			
			<input type="button" value="수정" onclick="send(this.form);">
			<input type="button" value="목록으로" onclick="location.href='qa_list.do?page=${param.page}'">
		
		</form>
	</body>
</html>