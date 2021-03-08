<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="${ pageContext.request.contextPath }/resources/js/httpRequest.js"></script>
<script type="text/javascript">
	function find_id(f) {
		
		var emp_name = f.emp_name.value.trim();
		var reg_num = f.reg_num.value.trim();
		var reg_pattern = /^(?:[0-9]{2}(?:0[1-9]|1[0-2])(?:0[1-9]|[1,2][0-9]|3[0,1]))-[1-4][0-9]{6}$/;
		
		
		if(emp_name==''){
			alert("이름을 입력해주세요.");
			return;
		}

		if(reg_num==''){
			alert("주민등록번호를 입력해주세요.");
			return;
		}
		
		if (!reg_pattern.test(reg_num)) {
			alert("주민등록번호는 숫자 -를 포함하여 14자리만 가능합니다.");
			return;
		}
		
		var url = "id_find.do";
		var param = "emp_name="+encodeURIComponent(emp_name)+"&reg_num="+encodeURIComponent(reg_num);
		
		sendRequest(url,param,id_resultFn,"POST");
	}
	
	function id_resultFn() {
		if(xhr.readyState==4 && xhr.status==200){
		       var data = xhr.responseText;
		       
		       alert(data);
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
               <input type="text" name="emp_name">
            </td>
         </tr>

         <tr>
            <th>주민등록번호</th>
            <td>
               <input type="text" name="reg_num">
            </td>
         </tr>
         
         <tr>
            <td colspan="2" align="center">
               <input type="button" value="찾기" onclick="find_id(this.form);">
               <input type="button" value="취소" onclick="locaton.href='login.do'">
            </td>
         </tr>
      </table>
</form>


</body>
</html>