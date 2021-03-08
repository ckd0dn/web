package controller;



import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.CommuteDAO;
import util.Util;
import vo.CommuteVO;
import vo.EmpVO;



@Controller
public class CommuteController {

	CommuteDAO commute_dao;
	String ok = "ok";

	// 임시로 거치는 매핑
	@RequestMapping("/commute_check.do")
	public String commute_check(){

		return Util.Commute.VIEW_PATH_COMMUTE + "commute_check.jsp";
	}


	public CommuteController(CommuteDAO dao) {
		this.commute_dao = dao;
	}

	//조회
	@RequestMapping("/commute_list.do")
	public String select(Model model, HttpSession session) {

		EmpVO vo = (EmpVO)session.getAttribute("loginVO");
		
		List<CommuteVO> list = commute_dao.selectList(vo.getEmp_idx());
		model.addAttribute("list", list);
		return Util.Commute.VIEW_PATH_COMMUTE + "commute_record.jsp";
	}


	//출석
	@RequestMapping("/commute_insert.do")
	@ResponseBody
	public String insert(int emp_idx, Integer commute_idx) {

		String result = "no";
		int res = 0;

		if(commute_idx==null) {
			// 아무 데이터도 없으니까 한방에 들어간다.
			CommuteVO vo_null = new CommuteVO();
			vo_null.setEmp_idx(emp_idx);
			res = commute_dao.insert(vo_null);
			this.ok = "ok";

			if(res==1) {				
				result = "yes";
			}
		}else {

			CommuteVO vo_notnull = commute_dao.selectOne(commute_idx);
			Date now = new Date();

			if(vo_notnull.getC_date().getDate() != now.getDate()) {
				CommuteVO vo = new CommuteVO();
				vo.setEmp_idx(emp_idx);
				res = commute_dao.insert(vo);
				this.ok = "ok";

				if(res == 1) {
					result = "yes";
				}

			}
		}

		return result;
	}

	//퇴근
	@RequestMapping("/commute_update.do")
	@ResponseBody
	public String modify( Integer commute_idx, int emp_idx ) {

		//퇴근 중복방지
		String result = "no";
		int res = 0;
		String resultStr = "";

		// commute_idx가 null값이라는 뜻은 완전한 첫번째 출석이라는 뜻
		if(commute_idx==null) {

			if (ok.equals("ok")) {
				ok = "ok";
			}

			result = "no_date";
			resultStr = String.format("[{'result':'%s'},{'ok':'%s'}]", result, ok);
			return resultStr;
		}

		// commute_idx가 있는 경우 commute_idx를 통해서 새로운 commute의 정보를 불러와서 그 번호의 출근 일자가 지금과 같은지 판단한다.
		// 판단했을 때, 날짜가 같으면 108행의 ok를 해서 update로 퇴근 날짜를 찍어주고 같지 않으면 오늘날짜와 같지않습니다. 출근을 먼저 진행해주세요. 라고 한다.
		CommuteVO baseVO = commute_dao.selectOne(commute_idx);
		Date now = new Date();

		if(baseVO.getGtw().getDate() != now.getDate()) {

			if (ok.equals("ok")) {
				ok = "nok";
				result = "yes";
			}


			result = "no_gtw";
			resultStr = String.format("[{'result':'%s'},{'ok':'%s'}]", result, ok);
			return resultStr;

		}

		if(ok.equals("nok")) {
			result = "no";
			resultStr = String.format("[{'result':'%s'},{'ok':'%s'}]", result, ok);
			return resultStr;
		}

		res = commute_dao.update(commute_idx);

		if(res == 1) {

			if (ok.equals("ok")) {
				ok = "nok";
			}

			result = "yes";
			resultStr = String.format("[{'result':'%s'},{'ok':'%s'}]", result, ok);
		}

		return resultStr;

	}

}
