package com.korea.vac;

import java.net.PasswordAuthentication;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import common.Common;
import dao.EmpDAO;
import util.Paging;
import util.Util;
import vo.EmpVO;

@Controller
public class EmpController {

	EmpDAO emp_dao;

	public void setEmp_dao(EmpDAO emp_dao) {
		this.emp_dao = emp_dao;
	}

	// 사원 목록 맵핑
	@RequestMapping("/emp_list.do")
	public String emp_list(Model model, Integer page) {
		
		// 페이징 처리
		int nowPage = 1;
		
		if(page!=null) {
			nowPage = page;
		}
		
		// 한페이지에 표시될 게시물의 시작과 끝 번호 계산
		int start = (nowPage - 1) * Common.Emp.BLOCKLIST + 1;
		int end = start + Common.Emp.BLOCKLIST -1;
		
		// HashMap으로 포장하여 SELECTLIST전송
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start",start);
		map.put("end",end);
		
		List<EmpVO> emp_list = null;
		
		emp_list = emp_dao.selectList(map);
		
		// 전체 게시물 조회
		int row_total = emp_dao.getRowTotal();
		
		// 페이지 메뉴 생성
		String pageMenu = Paging.getPaging("emp_list.do", nowPage, row_total, Common.Emp.BLOCKLIST, Common.Emp.BLOCKPAGE);
		
		model.addAttribute("emp_list", emp_list);
		model.addAttribute("pageMenu", pageMenu);
		
		return Util.Emp.VIEW_PATH + "emp_list.jsp";
	}

	// 사원 등록 맵핑
	@RequestMapping("/emp_reg_form.do")
	public String emp_reg() {
		return Util.Emp.VIEW_PATH + "emp_reg.jsp";
	}

	// 아이디 중복 체크를 위한 selectOne
	@RequestMapping("/id_check.do")
	@ResponseBody
	public String emp_one_id(String id) {
		String result = "no";
		String resultStr = "";
		EmpVO vo = emp_dao.emp_one_id(id);

		if (vo == null) {
			result = "yes";
			resultStr = String.format("[{'result':'%s'},{'id':'%s'}]", result, id);
		} else {
			resultStr = String.format("[{'result':'%s'},{'id':'%s'}]", result, id);
		}

		return resultStr;
	}

	// 직원 등록
	@RequestMapping("/emp_insert.do")
	@ResponseBody
	public String emp_insert(EmpVO vo) {
		int res = emp_dao.emp_insert(vo);
		String reg_result = "no";
		
		if(res==1) {
			reg_result = "yes";
		}
		
		return reg_result; 
	}

	// 직원 상세보기 페이지
	@RequestMapping("/emp_view.do")
	public String emp_view(int emp_idx, Model model) {
		
		// 직원 검색
		EmpVO vo = emp_dao.emp_one_idx(emp_idx);
		model.addAttribute("vo",vo);
		
		return Util.Emp.VIEW_PATH + "emp_view.jsp";
	}
	
	// 직원 삭제를 위한 ajax 맵핑
	@RequestMapping("/emp_del.do")
	@ResponseBody
	public String emp_del(int emp_idx) {
		
		String result = "no";
		// 해당 직원이 있는지 idx로 검색
		EmpVO vo = emp_dao.emp_one_idx(emp_idx);
		
		// 직원이 없는 경우
		if(vo==null) {
			return result; 
		}
		
		// 삭제
		int res = emp_dao.emp_del(emp_idx);
		
		if(res==1) {
			result = "yes";
		}
		
		return result;
	}
	
	// 회원 수정 페이지 이동
	@RequestMapping("/emp_update_form.do")
	public String emp_update_form(int emp_idx, Model model) {
		
		// 파라미터로 가져온 값을 이용하여 EmpVO로드
		EmpVO vo = emp_dao.emp_one_idx(emp_idx);
		model.addAttribute("vo", vo);
		
		return Util.Emp.VIEW_PATH + "emp_update_form.jsp";
	}
	
	// 회원 정보 수정
	@RequestMapping("/emp_update.do")
	@ResponseBody
	public String emp_update(EmpVO vo) {
		
		String update_result = "no";
		int res = emp_dao.emp_update(vo);
		
		if(res==1) {
			update_result = "yes";
		}
		
		return update_result;
	}
}
