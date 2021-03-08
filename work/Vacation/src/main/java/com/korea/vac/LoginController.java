package com.korea.vac;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.LoginDAO;
import util.Util;
import vo.EmpVO;

@Controller
public class LoginController {

	LoginDAO login_dao;

	public void setLogin_dao(LoginDAO login_dao) {
		this.login_dao = login_dao;
	}


	// 로그인 화면으로 이동
	@RequestMapping(value= {"/","login.do"})
	public String login() {

		return Util.Login.VIEW_PATH + "login.jsp";
	}


	@RequestMapping("/login_check.do")
	@ResponseBody
	public String login(String id, String pwd, HttpSession session) {
		// System.out.println(pwd);
		String result = "no";
		String resultStr = "";

		// 아이디를 통한 로그인 확인
		EmpVO loginVO = login_dao.login_one(id);

		// id가 없는 경우
		if(loginVO==null) {
			result = "no_id";
			resultStr = String.format("[{'result':'%s'}]", result);
			return resultStr;
		}

		// 비밀번호가 다를시
		if(!loginVO.getPwd().equalsIgnoreCase(pwd)) {
			result = "no_pwd";
			resultStr = String.format("[{'result':'%s'}]", result);
			return resultStr;

		}

		// 로그인 정보를 세션에서 저장
		session.setAttribute("loginVO", loginVO);
		
		// 세션 유지기간
		session.setMaxInactiveInterval(60*60);

		// 둘다 일치
		result = "clear";
		resultStr = String.format("[{'result':'%s'}]", result);

		return resultStr;
	}
	
	
	// ID찾기 화면 이동
	@RequestMapping("/find_id_form.do")
	public String find_id_form() {
		
		return Util.Login.VIEW_PATH + "find_id_form.jsp";
	}
	
	
	// ID찾기
	@RequestMapping("/find_id.do")
	@ResponseBody
	public String find_id(EmpVO vo) {
		
		// 아이디와 주민등록번호로 일치 (basevo:진짜 있으면 불러오는 기존 정보)
		EmpVO BaseVO = login_dao.find_id(vo);
		
		String result = "no";
		String resultStr = "";
		
		if(BaseVO==null) {
			result = "no_id";
			resultStr = String.format("[{'result':'%s'}]", result);
			return resultStr;
		}
		
		if(!(vo.getEmp_name().equals(BaseVO.getEmp_name())) && !(vo.getReg_num().equals(BaseVO.getReg_num()))) {
			result = "incorrect_info";
			resultStr = String.format("[{'result':'%s'}]", result);
			return resultStr;
		}
		
		// 정보 모두 일치
		
		return resultStr;
	}
	
	@RequestMapping("/main.do")
	public String main() {
		
		return "/WEB-INF/views/" + "main.jsp";
	}
}
