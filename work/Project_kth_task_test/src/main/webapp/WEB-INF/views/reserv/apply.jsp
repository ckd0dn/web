<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>::예약신청::</title>
		<script src="http://code.jquery.com/jquery-3.5.1.min.js">
		</script>
		<script type="text/javascript">	
			var r_val;	//선택된 회의실 번호
			var reserv_btime;
			var reserv_etime;
			var r_btime_v;
			var r_etime_v;
			
			//회의실 선택시 내일부터 60일을 옵션요소로 추가
			function sel_room(r_value){
				r_val = r_value;	//선택한 회의실 번호의 값을 저장
				
				// hidden으로 만들어둔곳의 value값을 res_idx로 설정
				document.getElementById("res_ridx").value = r_value;
				
				// 날짜 셀렉트와 사용인원 셀렉트를 변수로 설정
				var sel_p = document.getElementById("res_people");
				var res_date_s = document.getElementById("res_date_s");
				
				var max_p;
				var str;
				var str_val;
				
				//시작 시간 ~ 종료 시간 셀렉트를 변수로 설정
				var sel_btime = document.getElementById("res_btime");
				var sel_etime = document.getElementById("res_etime");
				
				
				/* 클릭마다 옵션을 모두 삭제함 */
				res_date_s.value = "";
				sel_p.options.length = 0;
				sel_btime.options.length = 0;
				sel_etime.options.length = 0;
				
				var nextday = new Date();
				
				//시작시간 옵션태그 추가
				var opt = document.createElement("option");
				opt.text = "시작시간";
				sel_btime.appendChild(opt);
				
				//종료시간 옵션태그 추가
				opt = document.createElement("option");
				opt.text = "종료시간";
				sel_etime.appendChild(opt);
				
				//예약가능 날짜 2달 출력
				res_date_s.style.display = "block";
				nextday.setDate(nextday.getDate()+1);
				
				var yyyy = nextday.getFullYear();
				var mm = nextday.getMonth()+1;
				var dd = nextday.getDate();
				
				if (mm < 10) {
					if (dd < 10) {
						str = yyyy + "-" + "0" + mm + "-" + "0" + dd;
					}else{
						str = yyyy + "-" + "0" + mm + "-" + dd;
					}
				}else{
					if (dd < 10) {
						str = yyyy + "-" + mm + "-" + "0" + dd;
					}else{
						str = yyyy + "-" + mm + "-" + dd;	
					}
				}
				res_date_s.setAttribute("min", str);
				
				for (var i = 0; i <= 60; i++) {
					nextday.setDate(nextday.getDate()+1);
					
					yyyy = nextday.getFullYear();
					mm = nextday.getMonth()+1;
					dd = nextday.getDate();
				}
				if (mm < 10) {
					if (dd < 10) {
						str = yyyy + "-" + "0" + mm + "-" + "0" + dd;
					}else{
						str = yyyy + "-" + "0" + mm + "-" + dd;
					}
				}else{
					if (dd < 10) {
						str = yyyy + "-" + mm + "-" + "0" + dd;
					}else{
						str = yyyy + "-" + mm + "-" + dd;	
					}
				}
				res_date_s.setAttribute("max", str);

				
				// 체크 값에 따른 가능인원수(회의실 최대인원)
				if (r_value == "1"|| r_value == "2") {
					max_p = 10;
				}
				if (r_value == "3"|| r_value == "4" || r_value == "5") {
					max_p = 5;
				}
				
				// 선택한 회의실값에 따른 가능인원수 출력
				for (var i = 1; i <= max_p; i++) {
					opt = document.createElement("option");
					opt.value = i;
					opt.text = i+" 명";
					sel_p.appendChild(opt);
				}
			}
			
			//날짜 선택후 시간 나오는 코드
			function sel_date(value){
				//시작 시간 ~ 종료 시간 셀렉트를 변수로 설정
				var sel_btime = document.getElementById("res_btime");
				var sel_etime = document.getElementById("res_etime");
				
				var opt;
				var string;
				var string_time;
				var times;
				
				// 배열변수 선언
				var num = new Array();
				var str_time = new Array();
				var btime = new Array();
				var etime = new Array();
				
				/* 클릭마다 옵션을 모두 삭제함 */
				sel_btime.options.length = 0; 
				sel_etime.options.length = 0;       
				
				//시작시간 옵션태그 추가
				var opt = document.createElement("option");
				opt.text = "시작시간";    
				sel_btime.appendChild(opt);
				
				//종료시간 옵션태그 추가
				opt = document.createElement("option");
				opt.text = "종료시간";  
				sel_etime.appendChild(opt);
  
				//DB에서 DATE값 가져오기 
				<c:forEach var="insert" items="${res_apply}" varStatus="c">
					<fmt:formatDate var="test_d" value="${insert.res_date}" pattern="yyyy-MM-dd"/>
						if (${insert.res_ridx} == r_val) {  
							if (value == "${test_d}") {
								btime[${c.count}] = "${insert.res_btime}";
								etime[${c.count}] = "${insert.res_etime}";
						}
					}
				</c:forEach>
				
				var time = new Date();
				time.setHours(8);
				time.setMinutes(30);
				
				//09:00 부터 20:00시 까지 저장된 배열 만들기
				for (var i = 1; i <= 22; i++) {
					time.setMinutes(time.getMinutes()+30);
					var hh = time.getHours();
					var MM = time.getMinutes();
					if (hh > 9 && MM > 0) {
						string = hh + ":" + MM;
						string_time = hh+"";
						times = string_time.concat(MM);
					}else if(hh < 10){
						if (MM < 10) {
							string = "0" + hh + ":" + MM+ "0";
							string_time = hh+"";
							times = string_time.concat(MM, "0");
						}else{	
							string = "0" + hh + ":" + MM;
							string_time = hh+"";
							times = string_time.concat(MM);
						}
					}else{
						string = hh + ":" + MM+ "0";
						string_time = hh+"";
						times = string_time.concat(MM, "0");
					}
					num[i] = string;
					str_time[i] = times;
				}

				//stime 띄워주기
				for (var i = 1; i < btime.length; i++) {
					var b_index = str_time.indexOf(btime[i]);
					var e_index = str_time.indexOf(etime[i]) - b_index;
					str_time.splice(str_time.indexOf(btime[i]), e_index);
					num.splice(b_index, e_index);
				}				
			
				//stime 옵션 추가하기
				for (var i = 1; i < num.length; i++) {
					opt = document.createElement("option");
					opt.value = str_time[i];
					opt.text = num[i];
					sel_btime.appendChild(opt);
				}
				
				//시작시간 출력후 시간 배열 재생성
				time.setHours(8);
				time.setMinutes(30);
				num = new Array();
				str_time = new Array();
				
				for (var i = 1; i <= 23; i++) {
					time.setMinutes(time.getMinutes()+30);
					var hh = time.getHours();
					var MM = time.getMinutes();
					if (hh > 9 && MM > 0) {
						string = hh + ":" + MM;
						string_time = hh+"";
						times = string_time.concat(MM);
					}else if(hh < 10){
						if (MM < 10) {
							string = "0" + hh + ":" + MM+ "0";
							string_time = hh+"";
							times = string_time.concat(MM, "0");
						}else{	
							string = "0" + hh + ":" + MM;
							string_time = hh+"";
							times = string_time.concat(MM);
						}
					}else{
						string = hh + ":" + MM+ "0";
						string_time = hh+"";
						times = string_time.concat(MM, "0");
					}
					num[i] = string;
					str_time[i] = times;
				}
				
				//etime 띄워주기
				for (var i = 1; i < etime.length; i++) {	//조건식만 수정하면됨
					var b_index = str_time.indexOf(btime[i]);
					var e_index = str_time.indexOf(etime[i]) - b_index;
					str_time.splice(str_time.indexOf(btime[i])+1, e_index);
					num.splice(b_index+1, e_index);
				}
				str_time.splice(1, 1);
				num.splice(1, 1);
				
				//etime 옵션 추가하기
				for (var i = 1; i < num.length; i++) {
					opt = document.createElement("option");
					opt.value = str_time[i];
					opt.text = num[i];
					sel_etime.appendChild(opt);
				}
			}	
	
			//회의룸 예약 코드
			function insert_reserv(f){
				var res_name = f.res_name.value;
				var res_tel = f.res_tel.value;
				var res_date_s = f.res_date_s.value;
				console.log(r_val);
				var res_ridx = f.res_ridx.value;
				var res_content = f.res_content.value;
				
				r_btime_v = document.getElementById("res_btime").value;
				r_etime_v = document.getElementById("res_etime").value;

				//유효성체크
				if (res_ridx == "") {
					alert("회의실을 먼저 선택해 주세요");
					return;
				}
				
				if (res_date_s == "") {
					alert("날짜를 선택해주세요");
					return;
				}
				
				if (r_btime_v == "시작시간" || r_etime_v == "종료시간") {
					alert("예약시간은 비워둘수 없습니다");
					return;
				}
				
				r_btime_v = Number(r_btime_v);
				r_etime_v = Number(r_etime_v);
				
				if (r_btime_v >= r_etime_v) {
					alert("시작시간과 종료시간을 재선택해주세요");
					return;
				}	
				
				if (res_content == "") {
					alert("세부설명은 비워둘수 없습니다");
					return;
				}
				f.action = "res_insert.do?res_date_s"+res_date_s;
				f.submit();
			}
			
		</script>
	</head>
	
	<body>
		<table border="1" style="float:left;">
		<caption>:회의실:</caption>  
			<tr>
				<td>회의실1</td>
				<td>
					<input type="radio" name="room" value="1" onclick="sel_room(this.value);"/>
				</td>
			</tr>
			<tr>
				<th>회의실2</th>
				<td>
					<input type="radio" name="room" value="2" onclick="sel_room(this.value);"/>
				</td>
			</tr>
			<tr>
				<th>회의실3</th>
				<td>
					<input type="radio" name="room" value="3" onclick="sel_room(this.value);"/>
				</td>
			</tr>
			<tr>
				<th>회의실4</th>
				<td>
					<input type="radio" name="room" value="4" onclick="sel_room(this.value);"/>
				</td>
			</tr>
			<tr>
				<th>회의실5</th>
				<td>
					<input type="radio" name="room" value="5" onclick="sel_room(this.value);"/>
				</td>
			</tr>
		</table>
		
		<form method="GET">
		<input type="hidden" name="res_ridx" id="res_ridx"/>
		<table border="1" style="float: right;">
		<caption>::예약신청::</caption>
			<tr>
				<th>신청자 이름</th>
				<td colspan="3"> 
					<input name="res_name" value="${loginVO.emp_name}" readonly="readonly"> 
				</td> 
			</tr>
			<tr>
				<th>전화번호</th>
				<td colspan="3"> 
					<input name="res_tel" value="${loginVO.phone}" readonly="readonly"> 
				</td> 
			</tr>
			<tr>
				<th>예약 날짜</th>
				<td colspan="3">
					<input id="res_date_s" name="res_date_s" type="date" onchange="sel_date(this.value);" style="display:none;"> 
				</td>
			</tr>
			<tr>
				<th>예약 시간</th>
				<td>
					<select id="res_btime" name="res_btime"></select>
					~
					<select id="res_etime" name="res_etime"></select>
				</td>  
			</tr>
			<tr>
				<th>예약 인원</th>
				<td colspan="3">
					<select id="res_people" name="res_people"></select>
				</td>
			</tr>
			<tr>
				<td colspan="4">
					<textarea rows="10" cols="30" id="res_content" name="res_content" placeholder="ex) (예약자 제외)이용자 이름/소속"></textarea>
				</td>
			</tr>
			<tr>
				<td>
					<input type="button" value="예약하기" onchange="insert_reserv(this.form);" onclick="insert_reserv(this.form);"/>
				</td>
			</tr>
		</table>
		</form>
	</body>
</html>