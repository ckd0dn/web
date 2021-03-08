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
				var title= f.title.value;
				var content = f.content.value;
				var idx = f.idx.value;
				
				if(title==""){
					alert("제목을 입력하세요");
					return;
				}
				if(content==""){
					alert("내용을 입력하세요");
					return;
				}
				
				if(!confirm("내용을 수정하시겠습니까?")){
					return;
				}

				var url="update.do";
				var param = "idx=${param.idx}"+"&title="+title+"&content="+content;
				
				sendRequest(url, param, resultFn, "POST");
				
			}
			
			function resultFn() {
				
				var f = document.ff;
				var idx = f.idx.value;
				
				if(xhr.readyState ==4 && xhr.status==200){
					var data = xhr.responseText;
					
					if(data=='yes'){
						alert("수정을 완료하였습니다");
						location.href="list.do?mgr=${param.mgr}";
					}else{
						alert("수정을 실패하였습니다.");
					}
					
				}
			}
		</script>
	</head>
	
	<body>
		<form name="ff" method="POST" action="insert.do">
		
		
			<input type="hidden" value="${ vo.board_idx }" name="idx">
				
			<table border="1" align="center">
				
				
				<caption>:::공지사항 글 수정:::</caption>
				
				<tr>
					<th>제목</th>
					<td><input name="title" value="${vo.title }"></td>
				</tr>
				
				<tr>
					<th>내용</th>
					<td><pre><textarea rows="7" cols="18" name="content">${vo.content }</textarea></pre> </td>
				</tr>
				
				<tr>
					<th>작성자</th>
					<td><input name="emp_name" value="관리자" readonly="readonly"></td>
				</tr>

			</table>
			
			
			<input type="button" value="확인" onclick="send(this.form);">
		</form>
	</body>
</html>