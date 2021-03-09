<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<script src="js/httpRequest.js"></script>

	<script>
		function send( f ) {
			
			var id = f.id.value;
			var pwd = f.pwd.value;
			
			if( id == ""){
				alert("아이디를 입력해야 됩니다");
				return;
			}
			
			if( pwd == ""){
				alert("비밀번호를 입력해야 됩니다");
				return;
			}
			
			var url = "login.do";
			var param = "id="+encodeURIComponent(id) + "&pwd="+encodeURIComponent(pwd);
			
			sendRequest(url, param, resultFn, "POST");
			
			function resultFn() {
				
					if (xhr.readyState == 4 && xhr.status == 200) {
					
					var data = xhr.responseText;
					var json = eval(data);
					
					if( json[0].param =='no_id'){
						alert("존재하지않는 아이디 입니다");
					}else if (json[0].param =='no_pwd') {
						alert("존재하지않는 비밀번호 입니다");
					}else if (json[0].param =='clear') {
						alert("로그인 성공");
						//전체목록 갱신
						location.href = "main_content.jsp";
					}
					
					
					
				}
			}
			
		}
	</script>
</head>
<body>
	<form>
		<table border="1" align="center">
			<caption>:::로그인:::</caption>
			
			<tr>
				<th>아이디</th>
				<td><input name="id" placeholder="아이디를 입력해야 합니다"></td>
			</tr>
			
			<tr>
				<th>비밀번호</th>
				<td><input name="pwd" type="password"></td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="로그인" onclick="send(this.form);">
					
					<input type="reset" value="취소">
				</td>
			</tr>		
		</table>
	</form>
</body>
</html>