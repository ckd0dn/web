<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ include file="/WEB-INF/views/include/head.jsp" %>


<c:if test="${ empty sessionScope.loginVO }">
	<script>
		alert("로그인 후 이용가능한 페이지입니다.");
		// 로그인 페이지로 이동
		location.href="login.do";
	</script>
</c:if>

<script src="${ pageContext.request.contextPath }/resources/js/httpRequest.js"></script>
<script type="text/javascript">
	function enterkey(f) {
		if(event.keyCode==13){
			task_insert(f);
		}
	}
	
	function commute_search(f) {
		
		var emp_name = f.emp_name.value;
		var dept_name = f.dept_name.value;
		
		
		f.action = "commute_view_list.do";		
		f.submit();	
	}
	
	
	function emp_idx(emp_idx) {
		
		// emp_idx를 ajax로 보내서, commute_view에 gow가 있는지 없는지 판단하여 있으면 이미 퇴근했다고 완료시키고 없으면 퇴근을 대신 찍어주는 방식을 이용
		var url = "gow.do";
		var param = "emp_idx="+emp_idx;
		
		sendRequest(url,param,gow_resultFn,"POST");
	}
	
	function gow_resultFn() {
		if(xhr.readyState==4 && xhr.status==200){
			var data = xhr.responseText;
			
			if(data=='no'){
				alert("이미 퇴근한 상태입니다.");
				return;
			}
			
			alert("퇴근이 완료되었습니다.");
			location.href="commute_view_list.do";
		}
	}
</script>
<body id="main">
	<!-- skip navigation -->
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
                            <div class="search_nav">
                            <div class="srchArea w180px">
								<label class="srcLabel">부서</label>
								<select title="소속부서 선택" name="dept_name">
									<option>부서를 선택하세요.</option>
                                    <option>인사</option>
        							<option>회계</option>
                                    <option>영업</option>
        							<option>마케팅</option>
        							<option>디자인</option>
        							<option>IT</option>
								</select>
							</div>
							<div class="srchArea w180px">
								<label class="srcLabel">사원 검색</label>
								<input type="text" name="emp_name" onkeydown="enterkey(this.form);">
							</div>
							<div class="srchArea cdtArea noLabel">
								<input type="button" class="stb-box-btn" value="검색" onclick="commute_search(this.form);">
							</div>
                        </div>

						</div><!-- end Form srchWrap  -->

						<!-- Form postWrap  -->
						<div class="postWrap">
							<h2>근태관리</h2>
							<div class="postTableWrap">
								<table class="postTable vrT">
									<caption>근태관리 페이지입니다. 금일 사원들의 출퇴근 정보를 표시합니다.</caption>
									<colgroup>
										<col class="w10per">
                                        <col class="w10per">
										<col class="w10per">
										<col class="w15per">
										<col class="w15per">
										<col class="w10per">
									</colgroup>
									<thead>
										<tr>
											<th scope="col">날짜</th>
											<th scope="col">부서</th>
											<th scope="col">이름</th>
											<th scope="col">출근시간</th>
											<th scope="col">퇴근시간</th>
											<th scope="col">비고</th>
										</tr>
									</thead>
									<tbody>
                                  <c:forEach var="cv_list" items="${ cv_list }">	
										<tr>
											<td><fmt:formatDate value="${ cv_list.c_date }" pattern="yyyy-MM-dd"/></td>
											<td>${ cv_list.dept_name }</td>
											<td>${ cv_list.emp_name }</td>
											<td><fmt:formatDate value="${ cv_list.gtw }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
											<td><fmt:formatDate value="${ cv_list.gow }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
											<td><input type="button" class="stb-box-btn1" onclick="emp_idx(${cv_list.emp_idx});" value="퇴근하기"></td>
                                    </c:forEach>
										</tr>
									<c:if test="${  empty cv_list }">
		                              <tr>
		                                 <td colspan="6">출근처리한 사원이 없습니다.</td>
		                              </tr>
		                              </c:if>	
												
									</tbody>
								</table>
							</div>

							<c:if test="${ not empty cv_list }">
							<div class="pagingArea">
								<!-- <a class="pageBtn _prev" href="#none">이전 페이지로 이동</a> -->
								<ul class="paging">
									<li class="_active">${ pageMenu }</li>
								</ul>
								<!-- <a class="pageBtn _next" href="#none">다음 페이지로 이동</a>
 -->
							</div><!-- End pagingWrap -->
							</c:if>
						</div><!-- End postWrap -->


					</div><!-- End _contentArea _formArea -->
					
				</div><!-- End _inner -->

			</div><!-- End _content -->
		</div><!-- End _wrap -->
	</article>

	</form>
<%@ include file="/WEB-INF/views/include/footer.jsp" %>
