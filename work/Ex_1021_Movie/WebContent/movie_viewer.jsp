<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	
	<script type="text/javascript" src="js/httpRequest.js"></script>

	<script type="text/javascript">
		window.onload = function(){
			//현재 페이지가 로딩완료 되었을 때 맨 처음 자동으로 호출되는 영역
			var url = "movie_list_json.jsp";
			sendRequest(url, null, resultF, "GET");
		}
		
		//sendRequest()를 통한 통신작업이 마무리되면
		//자동으로 호출되는 콜백메서드
		function resultF() {
			
			if( xhr.readyState == 4 && xhr.status == 200 ){
				
				//통신완료 후 넘어온 JSON형식의 데이터
				//"[{"title":"슈스케 장문복", ......]"
				//서버에서 위의 내용처럼 넘어온 데이터는 JSON처럼 보이지만
				//실제로는 ""에 묶여있는 문자열 구조다.
				//우리는 이 데이터를 실제 JSON형식으로 변경해줘야 한다.
				var data = xhr.responseText;
				
				//Json구조의 문자열 데이터를 실제 Json타입으로 변경
				var json = eval( data );
				
				//<select>태그에 <option>태그 추가하기
				var movie_select = document.getElementById("movie_select");
				
				for(var i = 0; i < json.length; i++){
					//옵션태그 '생성'하기
					var opt = document.createElement("option");
					opt.innerHTML = json[i].title;
					opt.value = json[i].path;
					
					//<option>슈스케 장문복</option>
					movie_select.appendChild(opt);
				}
				
			}
			
		}
			
		function movie_play(){
			//현재 선택된 항목의 value(재생경로)를 얻어온다.
			var path = document.getElementById("movie_select").value;
			
			//비디오에 재생시키고자 하는 path추가하기
			var video = document.getElementById("my_video");
			video.src = path;
			video.play();//자동재생
		}
			
	</script>

</head>


<body>
	비디오 목록 : 
	<select id="movie_select" onchange="movie_play();">
		<option>재생할 영상을 선택하세요</option>
	</select>
	
	<hr>
	
	<video id="my_video" src="" controls="controls"
	       width="320" height="240">
	</video>
</body>
</html>










