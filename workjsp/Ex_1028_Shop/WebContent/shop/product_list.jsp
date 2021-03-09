<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<script type="text/javascript">
		function regi() {
			location.href="insert_form.do";
		}
	</script>

</head>
<body>
	<jsp:include page="index.jsp"/>
	
	<div class="regi" align="center">
		<input id="reg" type="button" value="상품등록" onclick="regi();">
	</div>
	
	<br>
	
	<table border="1"
		   align="center"
		   width="600"
		   style="border-collapse:collapse">
	
		<tr bgcolor="#dedede">
			<th width="10%">모델명</th>
			<th width="10%">이미지</th>
			<th width="35%">제품명</th>
			<th width="25%">제품가격</th>
			<th width="20%">비고</th>
		</tr>
		
		<!-- 카테고리에 제품이 없을 때 -->
		<c:if test="${ empty list }">
			<center>
			해당 카테고리에는 아직 등록된 상품이 없습니다
			</center>
		</c:if>
	
		<c:forEach var="p" items="${ list }">
	
		<tr align="center">
			<td>${ p.p_num }</td>
			
			<td>
				<img src="../images/${ p.p_image_s }" width="100" height="90">
			</td>
			
			<td>
				<a href="view.do?idx=${p.idx}">${p.p_name}</a>
			</td>
			
			<td>
				할인가:<fmt:formatNumber value="${ p.p_saleprice }"/><br>
				<font color="red">
					( ${ p.sale_rate }% 할인 )
				</font>
			</td>
			
			<td>
				단가:<fmt:formatNumber value="${ p.p_price }"/>
			</td>
			
		</tr>
		</c:forEach>
	
	</table>
	
</body>
</html>












