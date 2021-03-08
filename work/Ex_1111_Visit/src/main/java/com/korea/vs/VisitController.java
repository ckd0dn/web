package com.korea.vs;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.VisitDAO;
import util.Util;
import vo.VisitVO;

@Controller
public class VisitController {

	VisitDAO visit_dao;
	public void setVisit_dao(VisitDAO visit_dao) {
		this.visit_dao = visit_dao;
	}
	
	//방명록 전체 조회
	@RequestMapping( value={"/", "/list.do"} )
	public String list( Model model ) {
		
		List<VisitVO> list = visit_dao.selectList();
		model.addAttribute("list", list);
		return Util.Visit.VIEW_PATH + "visit_list.jsp";
		
	}
	
	//방명록 글쓰기 폼 띄우기
	@RequestMapping("/insert_form.do")
	public String insert_form() {
		return Util.Visit.VIEW_PATH + "visit_insert_form.jsp";
	}
	
	//방명록에 새글쓰기
	@RequestMapping("/insert.do")
	public String insert(VisitVO vo, HttpServletRequest request) {
		
		//ip구하기
		String ip = request.getRemoteAddr();
		vo.setIp(ip);
		
		int res = visit_dao.insert(vo);
		
		//DB에 새 글 추가가 완료되었다면 list.do로 복귀
		//response.sendRedirect("list.do");
		return "redirect:list.do";
		
	}
	
	//게시글 삭제
	@RequestMapping("/delete.do")
	@ResponseBody //return되는 결과값을 콜백메서드로 돌려줘라
	public String delete( int idx ) {
		
		int res = visit_dao.delete(idx);
		
		String result = "no";
		if( res == 1 ) {
			result = "yes";
		}
		
		return result;
		
	}
	
	//방명록 수정 폼으로 이동
	@RequestMapping("/modify_form.do")
	public String modify_form(Model model, int idx) {
		
		//파라미터로 넘어온 idx에 해당되는 객체를 얻어온다
		VisitVO vo = visit_dao.selectOne(idx);
		
		model.addAttribute("vo", vo);
		
		return Util.Visit.VIEW_PATH + "visit_modify_form.jsp";
		
	}
	
	//글 수정
	@RequestMapping("/modify.do")
	public String modify( VisitVO vo, HttpServletRequest request) {
		
		String ip = request.getRemoteAddr();
		vo.setIp(ip);
		
		int res = visit_dao.update(vo);
		
		return "redirect:list.do";
		
	}
	
}















