<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		
		<script type="text/javascript">
			function send(qa_idx) {
				location.href="qa_view.do?qa_idx="+qa_idx+"&page=${empty param.page ? 1 : param.page}";
			}
			
			function qa_insert_form(mgr) {
				if(mgr==1){
					alert("권한이 없습니다.");
					return;
				}
				
				location.href="qa_insert_form.do";
			}
		</script>
	</head>
	
	<body>
		<table border="1" align="center">
		<caption>:::Q&A 게시판:::</caption>
			<tr>
				<th>no</th>
				<th>제목</th>
				<th>작성자</th>
				<th>등록일자</th>
				<th>조회수</th>
			</tr>
				
			<c:forEach var="vo" items="${ list }">
				<tr>
				
					<td>${vo.qa_idx }</td>
					
					<td>
					
						<c:forEach begin="1" end="${ vo.depth }">
						&nbsp;
						</c:forEach>
					
						<!-- 댓글 기호 -->
						<c:if test="${ vo.depth ne 0 }">
							ㄴ
						</c:if>
						
						<c:if test="${ vo.del_info eq -1}">
							<a href="" style="color: gray; text-decoration: none;">
								${ vo.title }
							</a>
						</c:if>
						
						<c:if test="${ vo.del_info eq 0 }">
						
							<a href="#" onclick="send('${vo.qa_idx}');">${vo.title }</a>
						</c:if>
					</td>
					
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
		<input type="button" value="등록" onclick="qa_insert_form('${loginVO.mgr}');">
	</body>
</html>