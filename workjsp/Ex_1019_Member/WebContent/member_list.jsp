<%@page import="vo.MemberVO"%>
<%@page import="java.util.List"%>
<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	MemberDAO dao = MemberDAO.getInstance();
	List<MemberVO> member_list = dao.selectList();
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

	function send( f ) {
		
		var email = f.email.value;
		
		/* 이메일 판단 정규식 */
		var em = /^[-A-Za-z0-9_]+[-A-Za-z0-9_.]*[@]{1}[-A-Za-z0-9_]+[-A-Za-z0-9_.]*[.]{1}[A-Za-z]{1,5}$/;
		if( !em.test(email) ){
			alert("이메일 형식이 올바르지 않습니다");
			return;
		}
		
		f.action = "member_register.jsp";
		f.method="post";
		f.submit();
	}
	
	function del( idx ) {
		if( !confirm("정말로 삭제하시겠습니까?") ){
			return;
		}
		location.href = 'member_del.jsp?idx='+idx;
	}
	
</script>

</head>
<body>

	<table border="1">
		<caption>:::회원목록:::</caption>
		<tr>
			<th>회원번호</th>
			<th>이름</th>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이메일</th>
			<th>주소</th>
			<th>비고</th>
		</tr>
		
		<%
		for(int i = 0; i < member_list.size(); i++){ 
			MemberVO vo = member_list.get(i);
		%>
		
		<tr>
			<td><%=vo.getIdx()%></td>
			<td><%=vo.getName()%></td>
			<td><%=vo.getId()%></td>
			<td><%=vo.getPwd()%></td>
			<td><%=vo.getEmail()%></td>
			<td><%=vo.getAddr()%></td>
			
			<td>
				<input type="button" value="삭제"
					   onclick="del('<%=vo.getIdx()%>');">
			</td>
		</tr>
		
		<%} %>
		
	</table>

	<!-- 회원정보 추가 폼 -->
	<div>
		<form>
			<table>
				<caption>:::초간단 회원가입:::</caption>
				<tr>
					<th>이름</th>
					<td><input name="name"></td>
				</tr>
				
				<tr>
					<th>아이디</th>
					<td><input name="id"></td>
				</tr>
				
				<tr>
					<th>비밀번호</th>
					<td><input name="pwd" type="password"></td>
				</tr>
				
				<tr>
					<th>이메일</th>
					<td><input name="email"></td>
				</tr>
				
				<tr>
					<th>주소</th>
					<td><input name="addr"></td>
				</tr>
				
				<tr>
					<th colspan="2">
						<input type="button"
						value="등록" onclick="send(this.form);">
					</th>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>













