package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.SawonDAO;
import vo.SawonVO;

@Controller
public class SawonController {

	public static final String VIEW_PATH = "/WEB-INF/views/sawon/";

	SawonDAO sawon_dao;
	public void setSawon_dao(SawonDAO sawon_dao) {
		this.sawon_dao = sawon_dao;
	}

	@RequestMapping("/salist.do")
	public String list( Model model ) {
		
		List<SawonVO> list = sawon_dao.selectSawon();
		model.addAttribute("list", list);//바인딩
		return VIEW_PATH + "sawon_list.jsp";//포워딩
		
	}
	
}













