<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ include file="/WEB-INF/views/include/head.jsp" %>

<c:if test="${ empty sessionScope.loginVO }">
	<script>
		alert("로그인 후 이용가능한 페이지입니다.");
		// 로그인 페이지로 이동
		location.href="login.do";
	</script>
</c:if>

<script
	src="${ pageContext.request.contextPath }/resources/js/httpRequest.js"></script>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>

<script type="text/javascript">
	var id_check = false;
	var addr_check = false;
	
	// 등록
	function emp_reg(f) {

		// 유효성 검사
		var dept_name = f.dept_name.value;
		var emp_name = f.emp_name.value;
		var gender = f.gender.value;
		var reg_num = f.reg_num.value.trim();
		var phone = f.phone.value.trim();
		var email = f.email.value.trim();
		var id = f.id.value.trim();
		var pwd = f.pwd.value.trim();
		var name_pattern = /^[가-힣a-zA-Z]+$/;
		var reg_pattern = /^(?:[0-9]{2}(?:0[1-9]|1[0-2])(?:0[1-9]|[1,2][0-9]|3[0,1]))-[1-4][0-9]{6}$/;
		var phone_pattern = /^[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}$/;
		var alphanum_pattern = /^[a-zA-Z0-9]+$/;
		var addr = f.addr_api.value;
		var addr_info = f.addr_info.value;
		var mail_pattern = /^[-A-Za-z0-9_]+[-A-Za-z0-9_.]*[@]{1}[-A-Za-z0-9_]+[-A-Za-z0-9_.]*[.]{1}[A-Za-z]{1,5}$/;
		var addr_api = document.getElementById("addr_api").value;
		
		
		
		// 유효성 검사
		if (dept_name == "부서를 선택하세요.") {
			alert("부서를 선택하세요.");
			return;
		}

		if (emp_name == "") {
			alert("이름을 입력해주세요.");
			return;
		}

		// 이름은 한글과 영문만 가능한 패턴
		if (!name_pattern.test(emp_name)) {
			alert("이름은 영문과 한글만 가능합니다.");
			return;
		}

		if (reg_num == "") {
			alert("주민등록번호를 입력해주세요.");
			return;
		}

		// 주민번호 패턴
		if (!reg_pattern.test(reg_num)) {
			alert("주민등록번호는 숫자 -를 포함하여 14자리만 가능합니다.");
			return;
		}

		if (phone == "") {
			alert("핸드폰 번호를 입력해주세요.");
			return;
		}

		// 핸드폰 패턴
		if (!phone_pattern.test(phone)) {
			alert("핸드폰 번호는 000-0000-0000의 형태로 입력해주세요.");
			return;
		}

		if (email == "") {
			alert("메일 주소를 입력해주세요.");
			return;
		}

		// id, 패스워드, 이메일은 숫자와 알파벳만 가능한 패턴
		if (!mail_pattern.test(email)) {
			alert("메일 형식에 맞지 않습니다.");
			return;
		}

		// 주소 검색 완료 체크
		if (addr_check == "false") {
			alert("주소를 검색해주세요.");
			return;
		}

		if (addr == "") {
			alert("주소를 검색해주세요.");
			return;
		}

		if (addr_info == "") {
			alert("상세 주소를 검색해주세요.");
			return;
		}

		// 아이디 중복체크
		if (id_check == false) {
			alert("아이디 중복 체크 먼저 해주세요.");
			return;
		}
		
		if (pwd == "") {
			alert("비밀번호를 입력해주세요.");
			return;
		}

		if (!alphanum_pattern.test(pwd)) {
			alert("비밀번호는 영문과 숫자 조합만 가능합니다.");
			return;
		}
		
		// 등록 결과를 알기위한 ajax
		var url = "emp_insert.do";
		var reg_param = "dept_name="+dept_name+"&emp_name="+emp_name+"&gender="+gender+"&reg_num="+reg_num+"&phone="+phone+"&email="+email+"&addr="+addr+"&addr_info="+addr_info+"&id="+id+"&pwd="+pwd;
		
		sendRequest(url,reg_param,reg_resultFn,"POST");
	}
	
	function reg_resultFn() {
		if (xhr.readyState == 4 && xhr.status == 200) {
			var reg_result = xhr.responseText;
			
			if(reg_result==0){
				alert("등록에 실패했습니다. 관리자에게 문의해주세요.");
				}
				alert("등록이 완료되었습니다.");
				location.href="emp_list.do?page=${param.page}";
			
			}
	}

	// 아이디 중복체크
	function check_id(f) {
		var id = f.id.value.trim();
		var alphanum_pattern = /^[a-zA-Z0-9]+$/;

		if (id == '') {
			alert("아이디를 입력하세요.");
			return;
		}

		if (!alphanum_pattern.test(id)) {
			alert("아이디는 영문과 숫자 조합만 가능합니다.");
			return;
		}

		// ajax
		var url = "id_check.do";
		var param = "id=" + encodeURIComponent(id);

		sendRequest(url, param, resultFn, "POST");
	}

	function resultFn() {
		if (xhr.readyState == 4 && xhr.status == 200) {
			var data = xhr.responseText;
			var json = eval(data);

			if (json[0].result == 'no') {
				alert(json[1].id + "는(은) 이미 사용중인 아이디입니다.");
				return;
			}

			alert(json[1].id + "는(은) 사용가능한 아이디입니다.");

			if (!confirm(json[1].id + "를 사용하시겠습니까?")) {
				return;
			}

			// 사용하겠다고 클릭한 경우
			id_check = true;

			// 입력상자 검색 후 readonly true로 변경
			var id = document.getElementById("id").readOnly = "true";
		}
	}

	// 검색 버튼 누를 경우
	function search_addr() {
		new daum.Postcode({
	        oncomplete: function(data) {
	            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분입니다.
	            // 예제를 참고하여 다양한 활용법을 확인해 보세요.
	            var address = data.address;
				var addr = document.getElementById("addr_api");
				
				addr.value = address;
	        }
	    }).open();
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
	
	<article id="_subArticle">
		<div class="_wrap">
			<div id="_content">
				<div id="sub_content" class="_inner">					
					<div class="_contentArea _formArea">
						<div class="postWrap">
							<!-- Form postWriteWrap  -->
                            <div class="postCon">
                            <h2>사원정보 등록</h2>
                                <div class="postWrite">
                                    <dl>
                                        <dt><label>부서</label></dt>
                                        <dd class="sel_3part">
                                            <div class="srchArea">
                                                <div class="srchBox">
                                                <select name="dept_name" >
													<option>부서를 선택하세요.</option>
													<option>인사</option>
													<option>회계</option>
													<option>영업</option>
													<option>마케팅</option>
													<option>디자인</option>
													<option>IT</option>
												</select>
                                                </div>
                                            </div>
                                        </dd>
                                    </dl>
                                    <dl>
                                        <dt><label>이름</label></dt>
                                        <dd class="sel_2part">
                                            <input type="text" title="이름" name="emp_name">
                                        </dd>
                                    </dl>

                                    <dl>
                                        <dt><label>성별</label></dt>
                                            <dd class="sel_2part">
                                                <div class="_radioBox enter-chkBox">
                                            <span class="radio-area">
                                                <input type="radio" id="chk-local" name="gender" value="남자" checked="checked">
                                                <label for="chk-local">남자<span></span></label>
                                            </span>
                                            <span class="radio-area">
                                                <input type="radio" id="chk-foreign" name="gender" value="여자" >
                                                <label for="chk-foreign">여자<span></span></label>
                                            </span>
                                                </div>
                                            </dd>
                                    </dl>

                                    <dl>
                                        <dt><label>전화번호</label></dt>
                                        <dd class="sel_2part">
                                            <input type="text" title="전화번호 입력" name="phone">
                                        </dd>
                                    </dl>
                                    <dl>
                                        <dt><label>주민등록번호</label></dt>
                                        <dd class="sel_2part">
                                            <input type="text" title="주민등록번호 입력"  name="reg_num" placeholder="-을 포함하여 14자리 숫자">
                                        </dd>
                                    </dl>
                                    <dl>
                                        <dt><label>이메일</label></dt>
                                        <dd class="sel_2part">
                                            <input type="text" title="이메일 입력" name="email">
                                        </dd>
                                    </dl>
                                    <dl>
                                        <dt><label>주소</label></dt>
                                        <dd class="sel_2part">
                                            <input type="text" title="주소 검색" readonly="readonly" id="addr_api" name="addr">
                                            <input type="button" class="stb-box-btn" value="주소 검색" onclick="search_addr();">

                                        </dd>
                                    </dl>
                                    <dl>
                                        <dt><label>상세주소</label></dt>
                                        <dd class="sel_2part">
                                            <input type="text" title="상세주소 입력" name="addr_info">
                                        </dd>
                                    </dl>
                                     <dl>
                                        <dt><label>아이디</label></dt>
                                        <dd class="sel_2part">
                                            <input type="text" title="아이디 입력" name="id" id="id">
                                            <input type="button" class="stb-box-btn" value="중복 확인" onclick="check_id(this.form);">
                                        </dd>
                                    </dl>
                                     <dl>
                                        <dt><label>비밀번호</label></dt>
                                        <dd class="sel_2part">
                                            <input type="password" title="비밀번호 입력" name="pwd">
                                        </dd>
                                    </dl>
                                </div><!-- End postWriteWrap -->
                                <div class="btnWrap alignR">
                                        <input type="button" class="_btn _grey" onclick="emp_reg(this.form);" value="등록">
                                        <a class="_btn _line" onclick="location.href='emp_list.do?page=${param.page}'">취소</a>
                                </div>
                            </div><!-- End postWrap -->
                        </div>
					</div><!-- End _contentArea _formArea -->
					
				</div><!-- End _inner -->

			</div><!-- End _content -->
		</div><!-- End _wrap -->
	</article>
	</form>
	
<%@ include file="/WEB-INF/views/include/footer.jsp" %>