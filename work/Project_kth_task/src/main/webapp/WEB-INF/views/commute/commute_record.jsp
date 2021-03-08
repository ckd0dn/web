<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ include file="/WEB-INF/views/include/head.jsp" %>

<c:if test="${ empty sessionScope.loginVO }">
	<script>
		alert("로그인 후 이용가능한 페이지입니다.");
		// 로그인 페이지로 이동
		location.href="login.do";
	</script>
</c:if>

<script type="text/javascript"
	src="${ pageContext.request.contextPath }/resources/js/httpRequest.js"></script>

<script type="text/javascript">
	

	function gtw(f) {
		
		var commute_idx;
		var emp_idx = f.emp_idx.value;
		var url = "commute_insert.do";
		var param = "emp_idx="+emp_idx+"&commute_idx=";
		
		try {
			var commute_idx = f.commute_idx.value;
			param = "emp_idx="+emp_idx+"&commute_idx="+commute_idx;
			sendRequest(url, param, gtw_resultFn, "POST");
			
		} catch (e) {
			sendRequest(url, param, gtw_resultFn, "POST");
		}		
	}

	function gow(f) {
				
		if (!confirm("퇴근시간을 기록하시겠습니까?")) {
			return;

		}
		
		
		var commute_idx;
		var emp_idx = f.emp_idx.value;
		var url = "commute_update.do";
		var param = "emp_idx="+emp_idx+"&commute_idx=";
		
		try {
			var commute_idx = f.commute_idx.value;
			param = "emp_idx="+emp_idx+"&commute_idx="+commute_idx;
			sendRequest(url, param, gow_resultFn, "POST");
			
		} catch (e) {
			sendRequest(url, param, gow_resultFn, "POST");
		}				
	}

	function gtw_resultFn() {

		if (xhr.readyState == 4 && xhr.status == 200) {

			var data = xhr.responseText;

			if (data == 'no') {
				alert("오늘은 이미 출근하셨습니다.");
				return;
			}
			
			alert("출근이 완료되었습니다.")
			location.href = "commute_list.do";
		}

	}
 
	function gow_resultFn() {

		if (xhr.readyState == 4 && xhr.status == 200) {

			var data = xhr.responseText;
			var json = eval(data);
//			alert(data);
			if(json[0].result=='no' && json[1].ok=='nok'){
				alert("이미 퇴근한 상태입니다.");
				return;
			}
			
			if(json[0].result=='no_date' && json[1].ok=='ok'){
				alert("출근을 먼저 해주세요.");
				return;
			}
			
			
			alert("퇴근이 완료되었습니다.");
			location.href='commute_list.do';
		}

	}
	
</script>
</head>
<body id="main">

	<form>
		<div id="skip">
		<h2 class="hidden">Skip Navigation</h2>
		<ul>
		  <li><a href="#sub_content" onclick="document.getElementById('sub_content').tabIndex = -1;document.getElementById('sub_content').focus();return false;">본문 바로가기</a></li>
		  <li><a href="#_sideNav" onclick="document.getElementById('_sideNav').tabIndex = -1;document.getElementById('_sideNav').focus();return false;">메뉴 바로가기</a></li>
		</ul>
	</div>
	<!--// skip navigation -->
	
	<%@ include file="/WEB-INF/views/include/header.jsp" %>
	<form>
	<article id="_subArticle">
		<div class="_wrap">
			<div id="_content">
				<div id="sub_content" class="_inner">					
					<div class="_contentArea _formArea">
						<!-- Form srchWrap  -->
						<div class="f-srchWrap">
                            
							 <div class="alignC">
								<input type="button" class="stb-box-btn" value="출근" onclick="gtw(this.form);">
                                <input type="button" class="stb-box-btn" value="퇴근" onclick="gow(this.form);">
                                <input type="hidden" name="emp_idx" value="${loginVO.emp_idx}">
							</div>
                       

						</div><!-- end Form srchWrap  -->

						<!-- Form postWrap  -->
						<div class="postWrap">
							<div class="postTableWrap">
								<table class="postTable vrT">
									<caption>출퇴근 기록 페이지입니다. 나의 출퇴근 정보를 표시합니다.</caption>
									<colgroup>
										<col class="w10per">
                                        <col class="w20per">
										<col class="w25per">
										<col class="w25per">
										<col class="w20per">
									</colgroup>
									<thead>
										<tr>
											<th scope="col">번호</th>
											<th scope="col">날짜</th>
											<th scope="col">출근시간</th>
											<th scope="col">퇴근시간</th>
											<th scope="col">근무시간</th>
										</tr>
									</thead>
									<tbody>
                                    <c:if test="${ empty list }">
                                        <tr>
						                  <td colspan="5" align="center">출퇴근 기록이 없습니다.</td>
                                        </tr>
                                    </c:if>  
                                    <c:forEach var="vo" items="${ list }" varStatus="status">		
                                        <tr>
											<td>
                                                ${ vo.commute_idx }
                                            </td>
                                            
											<td>
                                                <fmt:formatDate value="${vo.c_date }" pattern="yyyy-MM-dd" />
                                            </td>
                                            
											<td>
                                                <fmt:formatDate value="${ vo.gtw }" pattern="yyyy-MM-dd HH:mm:ss"/>
                                            </td>
                                            
											<td>
                                                <fmt:formatDate value="${ vo.gow }" pattern="yyyy-MM-dd HH:mm:ss"/>
                                            </td>
                                            
											<td>
                                                <fmt:formatNumber value="${ vo.diffhour / 60 }" pattern="0" />시간
                                                <fmt:formatNumber value="${ vo.diffhour % 60 }" />분
                                            </td>
                                            <c:if test="${ status.first }">
                                                <td style="border:0 solid white;">
                                                    <input type="hidden" value="${ list[0].commute_idx }" name="commute_idx">
                                                </td>
                                            </c:if>
										</tr>	
                                    </c:forEach>
									</tbody>
								</table>

						</div><!-- End postWrap -->


					</div><!-- End _contentArea _formArea -->
					
				</div><!-- End _inner -->

			</div><!-- End _content -->
		</div><!-- End _wrap -->
	</article>
	</form>
<%@ include file="/WEB-INF/views/include/footer.jsp" %>