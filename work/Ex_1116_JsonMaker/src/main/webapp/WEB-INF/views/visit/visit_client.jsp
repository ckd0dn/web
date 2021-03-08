<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<script type="text/javascript" 
	src="${pageContext.request.contextPath}/resources/js/httpRequest.js"></script>

	<script type="text/javascript">
		function visit_list() {
			var url = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=430156241533f1d058c603178cc3ca0e&targetDt=20120101";
			sendRequest(url, null, resultFn, "GET");
		}
		
		function resultFn() {
			if( xhr.readyState == 4 && xhr.status == 200 ){
			
				var data = xhr.responseText;
				//alert(data);
				var json = eval("["+data+"]");
				
				alert(json[0].boxOfficeResult.dailyBoxOfficeList[0].movieNm);
				
				/* var display_data = "";
				
				for( var i = 0; i < json.length; i++ ){
					display_data = display_data + 
					( json[i].name + ':' + json[i].content ) + "<br>";
				}
				
				alert(display_data); */ 
			}
		}
	</script>

</head>
<body>
	<input type="button" value="조회" onclick="visit_list();">
</body>
</html>










