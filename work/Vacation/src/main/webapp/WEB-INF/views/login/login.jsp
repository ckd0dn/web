<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="${ pageContext.request.contextPath }/resources/js/httpRequest.js"></script>
<script type="text/javascript">
   function login(f) {
      
      var id = f.id.value;
      var pwd = f.pwd.value;
      var alphanum_pattern = /^[a-zA-Z0-9]+$/;
      var url = "login_check.do";
      var param = "id="+encodeURIComponent(id)+"&pwd="+encodeURIComponent(pwd);

      if(id==''){
         alert("아이디를 입력하세요.");
         return;
      }
      
      if(!alphanum_pattern.test(id)){
         alert("아이디는 영문과 숫자 조합만 가능합니다.");
         return;
      }
      
      if(pwd==''){
         alert("비밀번호를 입력하세요.");
         return;
      }

      sendRequest(url,param,login_resultFn,"POST");   
   }
   
   function login_resultFn() {
      if(xhr.readyState==4 && xhr.status==200){
        var data = xhr.responseText;
		var json = eval(data);

		if(json[0].result=="no_id"){
			alert("아이디가 없습니다.");
			return;
		}

		if(json[0].result=="no_pwd"){
			alert("비밀번호가 틀렸습니다.");
			return;
		}
		
		alert("로그인 성공");
		location.href="main.do";
		
      }
   }
   
   function find_id(f) {
	
		location.href = "find_id_form.do";
	   
}
</script>
</head>
<body>

<form>
      <div align="center">
         <h1>로그인</h1>
      </div>
      
      <table border="1" align="center">
         <tr>
            <th>ID</th>
            <td>
               <input type="text" name="id">
            </td>
         </tr>

         <tr>
            <th>PWD</th>
            <td>
               <input type="password" name="pwd">
            </td>
         </tr>
         
         <tr>
            <td colspan="2" align="center">
               <input type="button" value="로그인" onclick="login(this.form);">
               <input type="button" value="ID찾기" onclick="find_id(this.form);">
               <input type="button" value="PWD찾기" onclick="find_pwd(this.form);">
            </td>
         </tr>
      </table>
</form>

</body>
</html>