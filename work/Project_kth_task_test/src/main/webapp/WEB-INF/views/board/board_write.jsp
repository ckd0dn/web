<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		
		<script type="text/javascript">
			function send(f) {
				var title = f.title.value;
				var content = f.content.value;			
				
				if(title==""){
					alert("제목을 입력하세요");
				}
				
				if(content==""){
					alert("내용을 입력하세요");
				}
				
				f.submit();
			}
		</script>
	</head>
	
	<body>
		<form name="ff" method="POST" action="insert.do">
		<input type="hidden" name="id" value="${loginVO.id }">
		<input type="hidden" name="pwd" value="${loginVO.pwd }">
		<input type="hidden" name="mgr" value="${loginVO.mgr }">
		<input type="hidden" name="emp_name" value="${loginVO.emp_name }">
			<table border="1" align="center">
				
				
				<caption>:::공지사항 글 등록:::</caption>
				
				<tr>
					<th>제목</th>
					<td><input name="title"></td>
				</tr>
				
				<tr>
					<th>내용</th>
					<td><textarea rows="7" cols="18" name="content"></textarea> </td>
				</tr>
				
				<tr>
					<th>작성자</th>
					<td><input name="dept_name" value="${ loginVO.dept_name }" readonly="readonly"></td>
				</tr>
				
			
			</table>
			
			<input type="button" value="등록" onclick="send(this.form);">
			<input type="button" value="목록으로" onclick="location.href='list.do?page=${param.page}'">
		</form>
	</body>
</html>