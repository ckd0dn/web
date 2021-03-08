package controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.EmpDAO;
import dao.VacDAO;
import net.sf.json.JSONArray;
import util.Util;
import vo.EmpVO;
import vo.Emp_Vac_ViewVO;
import vo.VacVO;

@Controller
public class VacController {

	VacDAO vacdao;
	EmpDAO emp_dao;
	
	public VacController( VacDAO dao) {
		this.vacdao = dao;
	}
	
	// 휴가를 체크하는 페이지
	@RequestMapping("/vacation_management_check.do")
	public String vacation_management_check() {
		
		return Util.Vacation.VIEW_PATH + "vac_check.jsp";
	}
	
	
	//휴가 승인된 리스트 달력에 뿌려줌	
	@RequestMapping("/calendar.do")
	public String calendar(Model model) {
		
		List<Emp_Vac_ViewVO> list = vacdao.selectViewRecList();
		//list를 제이슨 형식으로
		JSONArray jsonArray = new JSONArray();
		
		model.addAttribute("list", list); 
		model.addAttribute("jsonList", jsonArray.fromObject(list));
		
		return Util.Vacation.VIEW_PATH + "calendar.jsp";
	}
	
	//휴가 신청 페이지
	@RequestMapping("vacation_apply.do")
	public String apply( Model model) {
		
		List<VacVO> list = vacdao.selectOverlapList();
		model.addAttribute("list",list);
		return  Util.Vacation.VIEW_PATH +"vacation_apply.jsp";
	}
	
	//휴가 신청하기
	@RequestMapping("/vacation_insert.do")
	public String insert( VacVO vo, HttpSession session ) {
		
		
		
		//세션에 등록된 로그인사용자의 정보를 가져오는 vo생성
		EmpVO testvo = (EmpVO)session.getAttribute("loginVO");
		//vacVO에 로그인 사용자의 emp_idx담아줌
		vo.setEmp_idx(testvo.getEmp_idx());
		
		vacdao.insert(vo);
		
		return "redirect:vacation_apply.do";
	}
	
	//휴가 관리하기
	@RequestMapping("vacation_management.do")
	public String management( HttpSession session, Model model ) {
		
		EmpVO testvo = (EmpVO)session.getAttribute("loginVO");
		
		//휴가 관리 조회
		List<Emp_Vac_ViewVO> list = vacdao.selectViewList();
		model.addAttribute("list",list);
		
			return Util.Vacation.VIEW_PATH + "vacation_management.jsp";
	}
	
	//휴가 승인
	@RequestMapping("recognize.do")
	public String recognize( int vac_idx ) {
		
	VacVO vo = vacdao.selectOne(vac_idx);
	int res = vacdao.recognize(vo);

	return "redirect:vacation_management.do";
	}
	
	//휴가 거절
	@RequestMapping("reject.do")
	public String reject( int vac_idx ) {
		
	VacVO vo = vacdao.selectOne(vac_idx);
	int res = vacdao.reject(vo);
	
	return "redirect:vacation_management.do";
	}
}
