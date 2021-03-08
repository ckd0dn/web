<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		
		<script type="text/javascript">
			function send(idx) {
				var f = document.ff;
				var mgr = f.mgr.value;
				location.href="view.do?idx="+idx+"&page=${param.page}";
			}
			
			function send_mgr() {
				var f = document.ff;
				var mgr = f.mgr.value;
				
				
				if(mgr != 1){
					alert("권한이 없습니다");
					return;
				}
				
				location.href="insert_form.do?page=${param.page}";
			}
		</script>
	</head>
	
	<body>
		<form name="ff" method="POST">
		
		<input type="hidden" name="mgr" value="${ loginVO.mgr }">
			<table border="1" align="center">
				<caption>:::공지 사항:::</caption>
				<tr>
					<th>no</th>
					<th>제목</th>
					<th>작성자</th>
					<th>등록일자</th>
					<th>조회수</th>
				</tr>
				
				<c:forEach var="vo" items="${ list }">
					<tr>
							<td>${vo.board_idx }</td>
							<td><a href="#" onclick="send('${vo.board_idx}');">${vo.title }</a></td>
							<td>${vo.emp_name }</td>
							<td>${vo.regdate }</td>
							<td>${vo.readhit }</td>
					</tr>
				</c:forEach>
			
				<!-- 글이 없는 경우 -->
				<c:if test="${ empty list }">
					<tr>
						<td align="center" colspan="5">
							현재 등록된 글이 없습니다.
						</td>
					</tr>
				</c:if>
				
				<!-- 페이지 목록 -->
				<tr align="center">
					<td align="center" colspan="5">
						${ pageMenu }
					</td>
				</tr>
				
			</table>
			<input type="button" value="등록" onclick="send_mgr();">
			
		</form>
	</body>
</html>