<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<script type="text/javascript">
	
		function send( f ) {
			
			var title = f.title.value;
			var photo = f.photo.value;
			
			if( title == '' ){
				alert("사진의 제목을 입력하세요");
				return;
			}
			
			if( photo == '' ){
				alert("첨부파일을 넣어야 합니다");
				return;
			}
			
			f.action = "upload.do";
			f.submit();
			
		}	
	
	</script>

</head>

<body>
	<!-- 파일업로드시 고려사항
	1.전송방식(method)은 반드시 POST
	2.enctype : form태그에서 파일을 전송한다는것을 알려주는 인코딩 속성 -->
	<form method="POST" enctype="multipart/form-data">
		제목:<input name="title"><br>
		첨부:<input type="file" name="photo"><br>
		<input type="button" value="업로드" onclick="send(this.form);">
	</form>
</body>

</html>














