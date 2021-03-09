<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- Ajax(Asynchronus Javascript & xml) : 비동기 통신 
     자바스크립트를 활용한 백그라운드 통신기술(하나의 웹페이지 안에서 변경사항이 발생한 경우
     변경된 특정 부분만 갱신이 가능하도록 한다) -->    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<!-- js폴더에 존재하는 httpRequest.js를 참조 -->
	<script src="js/httpRequest.js"></script>
	
	<script type="text/javascript">
		function send() {
			var dan = document.getElementById("dan").value;
			if( dan < 2 || dan > 9 ){
				alert("2 ~ 9사이의 값을 입력하세요");
				return;
			}
			
			//Ajax를 통해 콜백메서드로 결과를 돌려받기 위한 준비
			var url = "gugudan_ajax.jsp";
			var param = "dan=" + dan;
			
			//sendRequest( 전송url, 파라미터값, 콜백메서드, 전송방식 )
			sendRequest(url, param, resultFn, "GET");
		}//send()
		
		/* Ajax의 요청결과를 돌려받을 콜백메서드 */
		function resultFn(){
			
			console.log( xhr.readyState + " / " + xhr.status );
			//xhr.readyState
			//0 : 초기화 오류
			//1, 2, 3 : 로딩중
			//4 : 로드완료
			
			//xhr.status
			//200 : 이상없음
			//404(경로없음), 500(서버에러)등... : 이상있음
			if( xhr.readyState == 4 && 
					xhr.status == 200 ){
				//서버로부터 도착한 데이터를 돌려받는다
				var data = xhr.responseText;
				
				document.getElementById("disp").innerHTML = data;
				
			}
		}
		
	</script>
	
</head>
<body>
	단:<input id="dan">
	<input type="button" value="결과보기" onclick="send();">
	<hr>
	<div id="disp">
	
	</div>
</body>
</html>










