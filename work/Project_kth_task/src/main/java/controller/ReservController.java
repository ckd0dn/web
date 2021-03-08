package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.corba.se.impl.javax.rmi.CORBA.Util;

import dao.ReservDAO;
import vo.EmpVO;
import vo.ReservVO;

@Controller
public class ReservController {
	ReservDAO reserv_dao;
	
	public ReservController(ReservDAO reserv_dao) {
		this.reserv_dao = reserv_dao;
	}
	
	// 예약 확인 체크 페이지
	@RequestMapping("res_manage_check.do")
	public String res_manage_check() {
		
		return util.Util.RESERV_PATH.WEB_PATH + "res_manage_check.jsp";
	}
	
	// 예약 페이지 띄워주기 + 예약DB 전체 정보 가져오기
	@RequestMapping("/res_apply.do")
	public String res_apply(Model model, HttpSession session) {
		session.getAttribute("loginVO");
		
		List<ReservVO> res_apply = reserv_dao.res_apply();
		model.addAttribute("res_apply", res_apply);

		return util.Util.RESERV_PATH.WEB_PATH + "apply.jsp";
	}
	
	
	// 예약 신청하기
	@RequestMapping("/res_insert.do")
	public String res_insert(ReservVO vo ,HttpServletRequest request) throws ParseException{
		String var_date = request.getParameter("res_date_s");
		System.out.println(var_date);
		SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
		Date date = fm.parse(var_date);
		
		vo.setRes_date(date);
		System.out.println(date);
		reserv_dao.res_insert(vo);
		
		return "main.jsp";
	}
	
	// 예약 관리페이지 띄워주기 
	@RequestMapping("/res_manage.do")
	public String res_manage(Model model, HttpSession session) {
		EmpVO vo = (EmpVO)session.getAttribute("loginVO");
		int mgr = vo.getMgr();
		if (mgr != 1) {
			return "main.jsp";
		}
		List<ReservVO> res_manage = reserv_dao.res_manage();
		model.addAttribute("res_manage", res_manage);
		
		return util.Util.RESERV_PATH.WEB_PATH + "management.jsp";
	}
	
	// 예약관리 페이지 승인/거절 선택
	@RequestMapping("/res_choose.do")
	public String res_choose(String res_state, int res_idx) {
		reserv_dao.res_choose(res_state, res_idx);
		
		return "redirect:res_manage.do";
	}
	
	// 각 유저별 예약 확인하기
	@RequestMapping("/res_user.do")
	public String res_user(Model model, HttpSession session){
		EmpVO vo = (EmpVO)session.getAttribute("loginVO");
		String res_name = vo.getEmp_name();
		
		List<ReservVO> res_user = reserv_dao.res_user(res_name);
		model.addAttribute("res_user", res_user);
		
		return util.Util.RESERV_PATH.WEB_PATH + "confirm.jsp";
	}
	
	// 유저별 예약 삭제
	@RequestMapping("/res_del.do")
	public String res_del(int res_idx) {
		reserv_dao.res_del(res_idx);
		
		return "redirect:res_user.do";
	}
}
