package com.korea.vs;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import vo.VisitVO;

@Controller
public class JsonMakerController {

	@RequestMapping("/vo_to_json.do")
	@ResponseBody
	public VisitVO vo_to_json() {
		
		VisitVO vo = new VisitVO();
		vo.setContent("내용");
		vo.setFilename("acid2Test.jpg");
		vo.setName("스마일");
		vo.setPwd("1111");
		
		return vo;
	}
	
	@RequestMapping("/map_to_json.do")
	@ResponseBody
	public Map<String, Object> map_to_json(){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "홍길동");
		map.put("age", "20");
		
		Map<String, String> telMap = new HashMap<String, String>();
		telMap.put("home", "02-111-2222");
		telMap.put("cell", "010-123-1234");
		
		map.put("tel", telMap);
		
		return map;
		
	}
	
}










