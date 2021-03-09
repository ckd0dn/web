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
	
	<table align="center" width="600" border="1"
	       style="border-collapse:collapse">
	
		<tr>
			<td colspan="6" align="center">나의 장바구니</td>
		</tr>
	
		<tr>
			<th>모델명</th>
			<th>제품명</th>
			<th>단가</th>
			<th>수량</th>
			<th>금액</th>
			<th>삭제</th>
		</tr>
		
		<tr align="center">
			<td>vc-123</td>
			<td>샘숭 최신 브라운관 TV</td>
			<td>
				단가:1500000<br>
				<font color="red">
					(할인가:1400000)
				</font>
			</td>
			
			<td>
				<form>
					<input type="hidden">
					<input name="" size="4" align="center">
					<input type="submit" value="수정">
				</form>
			</td>
			
			<td>1400000</td>
			
			<td>
				<input type="button" value="삭제" onclick="">
			</td>
		</tr>
		
		<tr>
			<td colspan="6" align="center">장바구니가 비었습니다</td>
		</tr>
		
		<tr>
			<td colspan="5" align="right">총 결제액</td>
			<td>1400000</td>
		</tr>
	</table>
	
</body>
</html>


















