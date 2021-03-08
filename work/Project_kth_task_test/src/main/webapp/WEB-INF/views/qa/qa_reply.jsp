<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		
		<script type="text/javascript">
			function reply(f) {
				var title = f.title.value;
				var content = f.content.value;
				
				if(title==''){
					alert("제목을 입력하세요");
					return;
				}
				
				if(content==""){
					alert("내용을 입력하세요");
					return;
				}
				
				f.action="reply.do";
				f.submit();
			}
		</script>
	</head>
	
	<body>
		<form method="get" >
		
		<input type="hidden" name="qa_idx" value="${ param.qa_idx }">
		<input type="hidden" name="page" value="${ param.page }">
		<input type="hidden" name="mgr" value="${ loginVO.mgr }">
		<input type="hidden" name="id" value="${ loginVO.id }">
		<input type="hidden" name="pwd" value="${ loginVO.pwd }">
		<input type="hidden" name="emp_name" value="${ loginVO.emp_name }">
		<input type="hidden" name="dept_name" value="${ loginVO.dept_name }">
		
			<table border="1" align="center">
				<caption>:::댓글 등록:::</caption>
				
				<tr>
					<th>제목</th>
					<td><input name="title"></td>
				</tr>
				
				<tr>
					<th>내용</th>
					<td><textarea rows="7" cols="19" name="content"></textarea> </td>
				</tr>
			</table>
			
			<input type="button" align="center" value="댓글 등록" onclick="reply(this.form);">
		</form>
	</body>
</html>