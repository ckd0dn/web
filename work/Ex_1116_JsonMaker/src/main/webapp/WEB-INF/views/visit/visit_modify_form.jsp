<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<script type="text/javascript">
		function send( f ) {
			
			f.method="post";
			f.action="modify.do";
			f.submit();
			
		}
	</script>

</head>
<body>
	<form>
		
		<input type="hidden" name="idx" value="${ vo.idx }">
		
		<table border="1" align="center">
			<caption>:::방명록 수정하기:::</caption>
			
			<tr>
				<th>작성자</th>
				<td><input value="${ vo.name }" name="name"></td>
			</tr>
				
			<tr>
				<th>내용</th>
				<td>
					<textarea rows="5" cols="50" name="content">${ vo.content }</textarea>
				</td>
			</tr>	
			
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="pwd" value="${ vo.pwd }"></td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="수정하기"
					       onclick="send(this.form);">
					       
					<input type="button" value="목록으로"
					       onclick="location.href='list.do'">       
				</td>
			</tr>
			
		</table>
		
	</form>
</body>
</html>











