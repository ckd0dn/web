<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="index.jsp"/>
	
	<table align="center" border="1" width="600"
	       style="border-collapse:collapse">
	
		<tr>
			<td>제품 카테고리</td>
			<td>${ vo.category }</td>
		</tr>
		
		<tr>
			<td>모델명</td>
			<td>${ vo.p_num }</td>
		</tr>
	
		<tr>
			<td>제품명</td>
			<td>${ vo.p_name }</td>
		</tr>
	
		<tr>
			<td>제조사</td>
			<td>${ vo.p_company }</td>
		</tr>
		
		<tr>
			<td>제품 가격</td>
			<td>${ vo.p_price }(할인가:${vo.p_saleprice})</td>
		</tr>
		
		<tr>
			<td>제품설명</td>
			<td>${ vo.p_content }</td>
		</tr>
		
		<tr>
			<td colspan="2" align="center">
				<img src="../images/${ vo.p_image_l }" width="500">
			</td>
		</tr>
		
		<tr>
			<td colspan="2" align="center">
				<input type="button" value="장바구니 담기"
				       onclick="location.href='cart_insert.do?idx=${vo.idx}'">
				       
				<input type="button" value="장바구니 보기"
				       onclick="location.href='cart_list.do'">       
			</td>
		</tr>
	</table>
</body>
</html>











