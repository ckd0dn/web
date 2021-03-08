<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset='utf-8' />
<link
	href='${ pageContext.request.contextPath }/resources/packages/core/main.css'
	rel='stylesheet' />
<link
	href='${ pageContext.request.contextPath }/resources/packages/daygrid/main.css'
	rel='stylesheet' />
<link
	href='${ pageContext.request.contextPath }/resources/packages/timegrid/main.css'
	rel='stylesheet' />
<link
	href='${ pageContext.request.contextPath }/resources/packages/list/main.css'
	rel='stylesheet' />
<script
	src='${ pageContext.request.contextPath }/resources/packages/core/main.js'></script>
<script
	src='${ pageContext.request.contextPath }/resources/packages/interaction/main.js'></script>
<script
	src='${ pageContext.request.contextPath }/resources/packages/daygrid/main.js'></script>
<script
	src='${ pageContext.request.contextPath }/resources/packages/timegrid/main.js'></script>
<script
	src='${ pageContext.request.contextPath }/resources/packages/list/main.js'></script>

<script>

 console.log('${list}')

 console.log('${jsonList}')



 var list = '${list}';

 var arrayList = new Array('${list}');

 
 console.log(list);

 console.log(arrayList);



 var json = JSON.parse('${jsonList}');

 console.log(json);

</script>

<script>


    
  document.addEventListener('DOMContentLoaded', function() {
    var calendarEl = document.getElementById('calendar');

    var calendar = new FullCalendar.Calendar(calendarEl, {
      plugins: [ 'interaction', 'dayGrid', 'timeGrid', 'list' ],
      header: {
        left: 'prev,next today',
        center: 'title',
        right: 'dayGridMonth,timeGridWeek,timeGridDay,listMonth'
      },
      defaultDate: '2020-11-29',
      navLinks: true, // can click day/week names to navigate views
      businessHours: true, // display business hours
      editable: true,
      events: ${jsonList}
    });

    calendar.render();
  });

</script>
<style>
body {
	margin: 40px 10px;
	padding: 0;
	font-family: Arial, Helvetica Neue, Helvetica, sans-serif;
	font-size: 14px;
}

#calendar {
	max-width: 900px;
	margin: 0 auto;
}
</style>
</head>
<body>
	<form>
		<div id='calendar'></div>




	</form>

</body>
</html>