<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- JSON( Javascript Object Notation ) : 
     서로 다른 프로그램( 또는 os )에서 데이터를 교환하기 위한 약속된 표기법-->    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<script type="text/javascript">
		//JSON표기법은 마치 map처럼 key:value 형태로 저장된다
		var p = {'name':'일길동', 'age':'30', 'tel':'010-111-1111'};
		document.write( "이름 : " + p.name + "<br>" );
		document.write( "나이 : " + p.age + "<br>");
		document.write( "전화 : " + p['tel'] + "<br>");
		
		document.write("<hr>");
		
		//JSON배열
		var p_arr = [{'name':'hong', 'age':'30', 'tel':'010'}, 
					 {'name':'kim', 'age':'35', 'tel':'011'},
					 {'name':'oh', 'age':'27', 'tel':'017'}];
		
		document.write( p_arr[1].tel + "<br>" );
		
		for( var i = 0; i < p_arr.length; i++ ){
			document.write( p_arr[i].name + " / " + 
					        p_arr[i].age + " / " + 
					        p_arr[i].tel + "<br>");
		}
		
		document.write("<hr>");
		
		//JSON 혼합
		var course = { 'name':'웹개발3', 
					   'start':'2020-07-01', 
					   'end':'2021-01-02', 
					   'sub':['java', 'jsp', 'android'], 
					   'student':[{'name':'hong', 'age':'20'}, 
						   		  {'name':'kim', 'age':'22'}, 
						   		  {'name':'park', 'age':'25'}]};
		
		document.write("과목명 : " + course.name + "<br>");
		document.write("시작일 : " + course.start + "<br>");
		
		document.write("과목명1 : " + course.sub[0] + "<br>");
		document.write("과목명2 : " + course.sub[1] + "<br>");
		
		document.write("학생1 : " + course.student[0].name );
		document.write("학생2 : " + course.student[1].name );
		
	</script>

</head>
<body>

</body>
</html>













































