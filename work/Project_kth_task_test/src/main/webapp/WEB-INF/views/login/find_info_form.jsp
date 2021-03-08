<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="${ pageContext.request.contextPath }/resources/js/httpRequest.js"></script>
<script type="text/javascript">
	var id_e_check = false;
	var pwd_e_check = false;
	
	function find_id(f) {
		
		var emp_name = f.id_emp_name.value.trim();
		var id_email = f.id_email.value.trim();
		var mail_pattern = /^[-A-Za-z0-9_]+[-A-Za-z0-9_.]*[@]{1}[-A-Za-z0-9_]+[-A-Za-z0-9_.]*[.]{1}[A-Za-z]{1,5}$/;

		
		
		if(emp_name==''){
			alert("이름을 입력해주세요.");
			return;
		}

		if(id_email==''){
			alert("이메일을 입력해주세요.");
			return;
		}
		
		if (!mail_pattern.test(id_email)) {
			alert("이메일 형식에 맞지 않습니다.");
			return;
		}
		
		if(id_e_check==false){
			alert("이메일 인증을 해주세요.");
			return;
		}
		
		var url = "find_id.do";
		var param = "emp_name="+encodeURIComponent(emp_name)+"&email="+encodeURIComponent(id_email);
		
		sendRequest(url,param,id_resultFn,"POST");
	}
	
	function id_resultFn() {
		if(xhr.readyState==4 && xhr.status==200){
		       var data = xhr.responseText;
		       var json = eval(data);

		       if(json[0].result=='no_info'){
		    	   alert("존재하지 않는 회원입니다. 정보를 확인해주세요.");
		    	   return;
		       }
		       		      
		       alert("찾으시는 아이디는 "+json[1].id+"입니다.\n로그인을 시도해주세요.");
		       location.href='login.do';
	  	}
	}
	
	function find_pwd(f) {
		
		var id = f.pwd_id.value.trim();
		var pwd_email = f.pwd_email.value.trim();
		var alphanum_pattern = /^[a-zA-Z0-9]+$/;
		var mail_pattern = /^[-A-Za-z0-9_]+[-A-Za-z0-9_.]*[@]{1}[-A-Za-z0-9_]+[-A-Za-z0-9_.]*[.]{1}[A-Za-z]{1,5}$/;
		
		if(id==''){
			alert("아이디를 입력해주세요.");
			return;
		}

		if(pwd_email==''){
			alert("이메일을 입력해주세요.");
			return;
		}
		
		if(!alphanum_pattern.test(id)){
			alert("ID는 숫자와 영문의 조합으로만 검색 가능합니다.");
			return;
		}
		
		if (!mail_pattern.test(pwd_email)) {
			alert("이메일 형식에 맞지 않습니다.");
			return;
		}
		
		if(pwd_e_check==false){
			alert("이메일 인증을 해주세요.");
			return;
		}
		
		var url = "find_pwd.do";
		var param = "id="+encodeURIComponent(id)+"&email="+encodeURIComponent(pwd_email);
		
		sendRequest(url,param,pwd_resultFn,"POST");
	}
	
	function pwd_resultFn() {
		if(xhr.readyState==4 && xhr.status==200){
		       var data = xhr.responseText;
		       var json = eval(data);

		       if(json[0].result=='no_info'){
		    	   alert("존재하지 않는 회원입니다. 정보를 확인해주세요.");
		    	   return;
		       }
		       		      
		       alert("찾으시는 비밀번호는 "+json[1].pwd+"입니다.\n로그인을 시도해주세요.");
		       location.href='login.do';
	  	}
	}

	// id의 인증하기 버튼 누를 시
	function id_email_check(f) {
		var email = f.id_email.value;
		
		var url = "email_check.do";
		var param = "email="+email;
		
		sendRequest(url,param,id_email_resultFn,"POST");
	}
	
	function id_email_resultFn() {
		
		var check_button = document.getElementById("id_check_button");
		var code = document.getElementById("id_code");
		
		code.value = "";
		
		id_check_button.disabled=false;
		
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
	
	function id_code_check(f) {
		var email_code = f.id_code.value;
		var check_button = document.getElementById("id_check_button");
		
		if( xhr.readyState == 4 && xhr.status==200 ){
			
			 var data = xhr.responseText;
			 var json = eval(data);
	
			 if(json[1].joinCode!=email_code){
				 alert("인증번호가 틀렸습니다.");
				 return;
			 }
 			 
			 id_e_check = true;
			 id_check_button.disabled="disabled"; 
			 alert("인증이 완료되었습니다.");
			 
			}
		
	}
	
	// pwd의 인증하기 버튼 누를 시
	function pwd_email_check(f) {
		var email = f.pwd_email.value;
		
		var url = "email_check.do";
		var param = "email="+email;
		
		sendRequest(url,param,pwd_email_resultFn,"POST");
	}
	
	function pwd_email_resultFn() {
		
		var check_button = document.getElementById("pwd_check_button");
		var code = document.getElementById("pwd_code");
		
		code.value = "";
		
		pwd_check_button.disabled=false;
		
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
	
	function pwd_code_check(f) {
		var email_code = f.pwd_code.value;
		var check_button = document.getElementById("pwd_check_button");
		
		if( xhr.readyState == 4 && xhr.status==200 ){
			
			 var data = xhr.responseText;
			 var json = eval(data);
	
			 if(json[1].joinCode!=email_code){
				 alert("인증번호가 틀렸습니다.");
				 return;
			 }
 			 
			 pwd_e_check = true;
			 pwd_check_button.disabled="disabled"; 
			 alert("인증이 완료되었습니다.");
			 
			}
		
	}

	
</script>
</head>
<body>

<form>
      <div align="center">
         <h1>아이디 찾기</h1>
      </div>
      
      <table border="1" align="center">
         <tr>
            <th>이름</th>
            <td>
               <input type="text" name="id_emp_name">
            </td>
         </tr>

         <tr>
            <th>이메일</th>
            <td>
               <input type="text" name="id_email">
               <input type="button" value="인증코드 발송" onclick="id_email_check(this.form);">
            </td>
         </tr>
         
         <tr>
         	<th>이메일 인증</th>
         	<td>
				<input size="15" name="id_code" id="id_code">
				<input type="button" id="id_check_button" value="인증하기" onclick="id_code_check(this.form);">
			</td>
         </tr>
         
         <tr>
            <td colspan="2" align="center">
               <input type="button" value="찾기" onclick="find_id(this.form);">
               <input type="button" value="취소" onclick="location.href='login.do'">
            </td>
         </tr>
      </table>
      
      <div align="center">
         <h1>비밀번호 찾기</h1>
      </div>
      
      <table border="1" align="center">
         <tr>
            <th>ID</th>
            <td>
               <input type="text" name="pwd_id">
            </td>
         </tr>

         <tr>
            <th>이메일</th>
            <td>
               <input type="text" name="pwd_email">
               <input type="button" value="인증코드 발송" onclick="pwd_email_check(this.form);">
            </td>
         </tr>
         
         <tr>
         	<th>이메일 인증</th>
         	<td>
				<input size="15" name="pwd_code" id="pwd_code">
				<input type="button" id="pwd_check_button" value="인증하기" onclick="pwd_code_check(this.form);">
			</td>
         </tr>
         
         <tr>
            <td colspan="2" align="center">
               <input type="button" value="찾기" onclick="find_pwd(this.form);">
               <input type="button" value="취소" onclick="location.href='login.do'">
            </td>
         </tr>
      </table>
</form>


</body>
</html>