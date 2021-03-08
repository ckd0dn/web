<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="${ pageContext.request.contextPath }/resources/js/httpRequest.js"></script>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script type="text/javascript">
	var addr_check = false;
	var e_check = false;
	
	// 등록
	function mypage_update(f) {
	
		// 유효성 검사
		var dept_name = f.dept_name.value;
		var emp_name = f.emp_name.value;
		var gender = f.gender.value;
		var reg_num = f.reg_num.value.trim();
		var phone = f.phone.value.trim();
		var email = f.email.value.trim();
		var name_pattern = /^[가-힣a-zA-Z]+$/;
		var reg_pattern = /^(?:[0-9]{2}(?:0[1-9]|1[0-2])(?:0[1-9]|[1,2][0-9]|3[0,1]))-[1-4][0-9]{6}$/;
		var phone_pattern = /^[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}$/;
		var alpanum_pattern = /^[a-zA-Z0-9]+$/;
		var addr = f.addr.value;
		var addr_info = f.addr_info.value;
		var mail_pattern = /^[-A-Za-z0-9_]+[-A-Za-z0-9_.]*[@]{1}[-A-Za-z0-9_]+[-A-Za-z0-9_.]*[.]{1}[A-Za-z]{1,5}$/;
		var addr_api = document.getElementById("addr_api").value;
		var emp_idx = f.emp_idx.value;
		var id = f.id.value;
		var pwd = f.pwd.value;
		var c_pwd = f.c_pwd.value;
		
		// 유효성 검사
		if (dept_name == "부서를 선택하세요.") {
			alert("부서를 선택하세요.");
			return;
		}
	
		if (emp_name == "") {
			alert("이름을 입력해주세요.");
			return;
		}
	
		// 이름은 한글과 영문만 가능한 패턴
		if (!name_pattern.test(emp_name)) {
			alert("이름은 영문과 한글만 가능합니다.");
			return;
		}
	
		if (reg_num == "") {
			alert("주민등록번호를 입력해주세요.");
			return;
		}
	
		// 주민번호 패턴
		if (!reg_pattern.test(reg_num)) {
			alert("주민등록번호는 숫자 -를 포함하여 12자리만 가능합니다.");
			return;
		}
	
		if (phone == "") {
			alert("핸드폰 번호를 입력해주세요.");
			return;
		}
	
		// 핸드폰 패턴
		if (!phone_pattern.test(phone)) {
			alert("핸드폰 번호는 000-0000-0000의 형태로 입력해주세요.");
			return;
		}
	
		if (email == "") {
			alert("메일 주소를 입력해주세요.");
			return;
		}
	
		// id, 패스워드, 이메일은 숫자와 알파벳만 가능한 패턴
		if (!mail_pattern.test(email)) {
			alert("메일 형식에 맞지 않습니다.");
			return;
		}
	
		// 주소 검색 완료 체크
		if (addr_check == "false") {
			alert("주소를 검색해주세요.");
			return;
		}
	
		if (addr == "") {
			alert("주소를 검색해주세요.");
			return;
		}
	
		if (addr_info == "") {
			alert("상세 주소를 검색해주세요.");
			return;
		}
		
		if(c_pwd==''){
			alert("비밀번호 확인을 입력해주세요.");
			return;
		}
		
		if(c_pwd!=pwd){
			alert("비밀번호가 일치하지 않습니다.");
			return;
		}
		
		if(e_check==false){
			alert("이메일 인증을 해주세요.");
			return;
		}
		
		if(!confirm("정말로 수정하시겠습니까?")){
			return;
		}
		
		// 수정 결과를 알기위한 ajax
		var url = "mypage_update.do";
		var update_param = "dept_name="+dept_name+"&emp_name="+emp_name+"&gender="+gender+
							"&reg_num="+reg_num+"&phone="+phone+"&email="+email+"&addr="+addr+
							"&addr_info="+addr_info+"&emp_idx="+emp_idx+"&id="+id+"&pwd="+pwd;
		
		sendRequest(url,update_param,update_resultFn,"POST");
	}
	
	function update_resultFn() {
		if(xhr.readyState==4 && xhr.status==200){
			var update_result = xhr.responseText;
				if(update_result=='no'){
					alert("수정 실패, 관리자에게 문의해주세요.");
				}
				
				alert("수정이 완료되었습니다.");
				location.href="main.do";
		}
	}
	
	
	// 검색 버튼 누를 경우
	function search_addr() {
		new daum.Postcode({
	        oncomplete: function(data) {
	            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분입니다.
	            // 예제를 참고하여 다양한 활용법을 확인해 보세요.
	            var address = data.address;
				var addr = document.getElementById("addr_api");
				
				addr.value = address;
	        }
	    }).open();
	}
	
	
	// 인증하기 버튼 누를 시
	function email_check(f) {
		var email = f.email.value;
		
		var url = "email_check.do";
		var param = "email="+email;
		
		sendRequest(url,param,email_resultFn,"POST");
	}
	
	function email_resultFn() {
		
		var check_button = document.getElementById("check_button");
		var code = document.getElementById("code");
		
		code.value = "";
		
		check_button.disabled=false;
		
		if( xhr.readyState == 4 && xhr.status==200 ){
		
		 var data = xhr.responseText;
		 var json = eval(data);
		 
		 if(json[0].res!='true'){
			 alert("메일 전송이 실패했습니다. 관리자에게 문의해주세요.");
			 return;
		 }
		 
		 alert("인증 메일이 전송되었습니다. 메일을 확인해주세요.");
		 
		 
		}
	}
	
	function code_check(f) {
		var email_code = f.code.value;
		var check_button = document.getElementById("check_button");
		
		if( xhr.readyState == 4 && xhr.status==200 ){
			
			 var data = xhr.responseText;
			 var json = eval(data);
	
			 if(json[1].joinCode!=email_code){
				 alert("인증번호가 틀렸습니다.");
				 return;
			 }
 			 
			 e_check = true;
			 check_button.disabled="disabled"; 
			 alert("인증이 완료되었습니다.");
			 
			}
		
	}


</script>

</head>
<body>
	
	<form>
	<div align="center">
		<h1>내 정보 관리</h1>
	</div>
	
	<table border="1" align="center">
		
		<tr>
			<th>부서명</th>
			<td>
				<input siez="30" type="text" name="dept_name" value="${ loginVO.dept_name }" readonly="readonly">
			</td>
		</tr>	
		
		<tr>
			<th>이름</th>
			<td>
				<input size="30" type="text" name="emp_name" value="${ loginVO.emp_name }">
			</td>			
		</tr>

		<tr>
			<th>성별</th>
			<td>
				<c:if test="${ loginVO.gender eq '남자' }">
					<input type="radio" name="gender" value="남자" checked="checked">남자
					<input type="radio" name="gender"value="여자">여자
				</c:if>

				<c:if test="${ loginVO.gender eq '여자' }">
					<input type="radio" name="gender" value="남자">남자
					<input type="radio" name="gender"value="여자" checked="checked">여자
				</c:if>
			</td>
		</tr>
		
		<tr>
			<th>전화번호</th>
			<td>
				<input size="30" name="phone" value="${ loginVO.phone }">
			</td>
		</tr>

		<tr>
			<th>주민등록번호</th>
			<td>
				<input size="30" name="reg_num" value="${ loginVO.reg_num }">
			</td>
		</tr>


		<tr> 
			<th>이메일</th>
			<td>
				<input size="15" name="email" value="${ loginVO.email }" id="email">
				<input type="button" value="인증 코드 발송" onclick="email_check(this.form);">
			</td>
		</tr>
		
		<tr>
			<th>이메일 인증</th>
			<td>
				<input size="15" name="code" id="code">
				<input type="button" id="check_button" value="인증하기" onclick="code_check(this.form);">
			</td>
		</tr>
		

		<tr>
			<th>주소</th>
				<td>
					<input size="23" readonly="readonly" id="addr_api" value="${ loginVO.addr }" name="addr">
					<button type="button" onclick="search_addr();">검색</button>
				</td>
		</tr>

		<tr>
			<th>상세 주소</th>
				<td>
					<input size="30" id="addr_info" name="addr_info" value="${ loginVO.addr_info }">
				</td>
		</tr>
		
		<tr>
			<th>아이디</th>
			<td>
				<input type="text" value="${ loginVO.id }" readonly="readonly" name="id">
			</td>
		</tr>
		
		<tr>
			<th>비밀번호</th>
			<td>
				<input type="password" value="${ loginVO.pwd }" name="pwd">
			</td>
		</tr>

		<tr>
			<th>비밀번호 확인</th>
			<td>
				<input type="password" name="c_pwd">
			</td>
		</tr>
		
		<tr>
			<td colspan="2" align="center"S>
				<input type="button" value="수정" onclick="mypage_update(this.form);"> 
				<input type="button" value="취소" onclick="location.href='main.do'">
			</td>
		</tr>
		
		<input type="hidden" value="${ loginVO.emp_idx }" name="emp_idx">
		
	</table>
	</form>
	
</body>
</html>