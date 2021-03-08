package com.korea.web;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.CommuteDAO;

import vo.CommuteVO;



@Controller
public class CommuteController {

	CommuteDAO dao;
	String ok = "ok";
	

	public CommuteController(CommuteDAO dao) {
		this.dao = dao;
	}

	public static final String VIEW_PATH = "/WEB-INF/views/";

	//조회
	@RequestMapping(value={"/","/commute_list.do"})
	public String select( Model model) {

		List<CommuteVO> list = dao.selectList();
		model.addAttribute("list", list);
		return VIEW_PATH + "commute_record.jsp";
	}


	//출석
	@ResponseBody
	@RequestMapping("/commute_insert.do")
	public String insert( CommuteVO vo, Integer commute_idx) {
		
		//null값이 넘어오는 경우에는 comm=1;
		int comm = 0;
		if(commute_idx == null) {
			comm = 1;
		}
		
		if(comm==1) {
			String result = "no";
			dao.insert(vo);
			this.ok = "ok";
			return result;
		}else {
		
			
			//출근 중복 방지
			String result = "no";
			int res=0;
	
			CommuteVO vo2 = dao.selectOne(commute_idx);
			Date now = new Date();
	
			if(vo2.getC_date().getDate() != now.getDate()) {
				res = dao.insert(vo);
				this.ok = "ok";
			}
	
			if(res == 1) {
				result = "yes";
			}
			return result;
		
		}

	}

	//퇴근
	@RequestMapping("/commute_update.do")
	@ResponseBody
	public String modify( int commute_idx ) {


		//퇴근 중복방지
		String result = "no";
		int res = 0;


		if (ok.equals("ok")) {
			res = dao.update(commute_idx);
			ok = "nok";
		}

		if(res == 1) {
			result = "yes";
		}
		return result;

	}

	@RequestMapping("/restaurant.do")
	public String restaurant() {
		return VIEW_PATH + "restaurant.jsp";
	}
}
