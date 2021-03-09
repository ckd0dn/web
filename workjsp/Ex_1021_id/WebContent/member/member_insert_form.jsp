<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	
	<script src="../js/httpRequest.js"></script>

	<script type="text/javascript">
		var b_idCheck = false;
		
		function send( f ) {
			//유효성 체크 
			
			if(!b_idCheck){
				alert("아이디 중복체크를 먼저 하십시오");
				return;
			}
						
			//파라미터를 가지고 insert.do로 전환
			f.action = "insert.do";
			f.method = "POST";
			f.submit();
			
		}
		
		//아이디 중복체크를 위한 함수
		function check_id(){
			
			var id = document.getElementById("id").value.trim();
			
			if( id == '' ){
				alert("아이디를 입력하세요");
				return;
			}
			
			//Ajax를 통해 id를 서버로 전송
			var url = "check_id.do";
			
			//encodeURIComponent : 파라미터로 전송하고자 하는 값에
			//@, #등 특수문자가 포함되어 있어도 정상전달하기 위한 인코딩 메서드
			var param = "id=" + encodeURIComponent(id);
			
			sendRequest(url, param, resultFn, "POST");
		}
		
		function resultFn() {
			
			if( xhr.readyState == 4 && xhr.status == 200 ){
				
				//서버로부터 도착한 데이터
				//"[{'result':'%s'}, {'id':'%s'}]"
				var data = xhr.responseText;
				
				var json = eval(data);
				
				if( json[0].result == 'no' ){
					alert(json[1].id + "은(는)이미 사용중입니다");
					return;
				}
				
				alert(json[1].id + "은(는) 사용 가능합니다");
				b_idCheck = true;
				
				//사용가능한 아이디라면 readOnly처리
				document.getElementById("id").readOnly = true;
				
			}
			
		}
		
	</script>

</head>

<body>
	
	<form>
		
		<table border="1" align="center">
			<caption>:::회원가입하기:::</caption>
			
			<tr>
				<th>아이디</th>
				<td>
					<input name="id" id="id">
					<input type="button" value="중복체크" onclick="check_id();">
				</td>
			</tr>
			
			<tr>
				<th>비밀번호</th>
				<td>
					<input type="password" name="pwd">
				</td>
			</tr>
			
			<tr>
				<th>이름</th>
				<td>
					<input name="name">
				</td>
			</tr>
			
			<tr>
				<th>이메일</th>
				<td>
					<input name="email">
				</td>
			</tr>
			
			<tr>
				<th>주소</th>
				<td>
					<input name="addr">
				</td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="가입" onclick="send(this.form);">
					<input type="button" value="취소" 
					       onclick="location.href='member_list.do'">
				</td>
			</tr>
			
		</table>
		
	</form>
	
</body>

</html>













