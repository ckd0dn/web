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

	// 실행하자마자 부서 명칭을 select에 넣는 함수
	window.onload = function(){
		
		document.getElementById("dept_name").value = '${vo.dept_name}';
	}

	var addr_check = false;
	
	// 등록
	function emp_update(f) {
	
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
		var alphanum_pattern = /^[a-zA-Z0-9]+$/;
		var addr = f.addr.value;
		var addr_info = f.addr_info.value;
		var mail_pattern = /^[-A-Za-z0-9_]+[-A-Za-z0-9_.]*[@]{1}[-A-Za-z0-9_]+[-A-Za-z0-9_.]*[.]{1}[A-Za-z]{1,5}$/;
		var addr_api = document.getElementById("addr_api").value;
		var emp_idx = f.emp_idx.value;
		
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
		
		if(!confirm("정말로 수정하시겠습니까?")){
			return;
		}
		
		// 수정 결과를 알기위한 ajax
		var url = "emp_update.do";
		var update_param = "dept_name="+dept_name+"&emp_name="+emp_name+"&gender="+gender+
							"&reg_num="+reg_num+"&phone="+phone+"&email="+email+"&addr="+addr+
							"&addr_info="+addr_info+"&emp_idx="+emp_idx;
		
		sendRequest(url,update_param,update_resultFn,"POST");
	}
	
	function update_resultFn() {
		if(xhr.readyState==4 && xhr.status==200){
			var update_result = xhr.responseText;
				if(update_result=='no'){
					alert("수정 실패, 관리자에게 문의해주세요.");
				}
				
				alert("수정이 완료되었습니다.");
				location.href="emp_list.do?page=${param.page}";
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

</script>
</head>
<body>

	<div>
		<h1 align="center">사원 정보 수정</h1>
	</div>

	<form>
	
		<table border="1" align="center">

			<tr>
				<th>부서명</th>
				<c:if test="${ vo.mgr eq 1 }">
				<td>
					<select name="dept_name">
						<option>ADMIN</option>
					</select>	
				</td>
				</c:if>
				
				<c:if test="${ vo.mgr ne 1 }">
				<td>
					<select name="dept_name" id="dept_name">
						<option>부서를 선택하세요.</option>
						<option>인사</option>
						<option>회계</option>
						<option>영업</option>
						<option>마케팅</option>
						<option>디자인</option>
						<option>IT</option>
					</select>
				</td>
				
				</c:if>
			</tr>

			<tr>
				<th>이름</th>
				<td><input name="emp_name" size="30" value="${ vo.emp_name }"></td>
			</tr>

			<tr>
				<th>성별</th>
				<td>
					<c:if test="${ vo.gender eq '남자' }">
						<input type="radio" name="gender" value="남자" checked="checked">남자
						<input type="radio" name="gender"value="여자">여자
					</c:if>

					<c:if test="${ vo.gender eq '여자' }">
						<input type="radio" name="gender" value="남자">남자
						<input type="radio" name="gender"value="여자" checked="checked">여자
					</c:if>
				</td>
			</tr>

			<tr>
				<th>전화번호</th>
				<td><input size="30" name="phone" value="${ vo.phone }"></td>
			</tr>

			<tr>
				<th>주민등록번호</th>
				<td><input size="30" name="reg_num" value="${ vo.reg_num }"></td>
			</tr>


			<tr>
				<th>이메일</th>
				<td><input size="30" name="email" value="${ vo.email }"></td>
			</tr>

			<tr>
				<th>주소</th>
				<td><input size="23" readonly="readonly" id="addr_api" value="${ vo.addr }" name="addr">
					<button type="button" onclick="search_addr();">검색</button></td>
			</tr>

			<tr>
				<th>상세 주소</th>
				<td><input size="30" id="addr_info" name="addr_info" value="${ vo.addr_info }"><td>
			</tr>
						
			<tr>
				<td colspan="2" align="right">
					<input type="button" value="수정" onclick="emp_update(this.form);"> 
					<input type="button" value="취소" onclick="location.href='emp_list.do?page=${ param.page }'"></td>
			</tr>
			
				<input type="hidden" value="${ vo.emp_idx }" name="emp_idx">
		</table>
			
	</form>

</body>
</html>