package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.PayDAO;

@Controller
public class PayController {

	PayDAO pay_dao;
	
	public static final String VIEW_PAHT_LOGIN = "/WEB-INF/views/";
	
	public void setPay_dao(PayDAO pay_dao) {
		this.pay_dao = pay_dao;
	}
	
	//결제 페이지
	@RequestMapping(value = {"/","payment.do"})
	public String list() {
		return VIEW_PAHT_LOGIN + "payment.jsp";
	}
	
}
