package com.korea.vs;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import dao.VisitDAO;
import util.Util;
import vo.VisitVO;

@Controller
public class VisitOpenAPIController {

	@Autowired
	HttpServletRequest request;
	
	@Autowired
	ServletContext application;
	
	VisitDAO visit_dao;
	public void setVisit_dao(VisitDAO visit_dao) {
		this.visit_dao = visit_dao;
	}
	
	//visit_client.jsp접근
	@RequestMapping("/vc.do")
	public String vc() {
		return Util.Visit.VIEW_PATH + "visit_client.jsp";
	}
	
	//방명록 전체 조회
	@RequestMapping( value={"/", "/list.do"} )
	@ResponseBody
	public List list() {
		
		List<VisitVO> list = visit_dao.selectList();
		return list;
		
	}
	
	//방명록 글쓰기 폼 띄우기
	@RequestMapping("/insert_form.do")
	public String insert_form() {
		return Util.Visit.VIEW_PATH + "visit_insert_form.jsp";
	}
	
	//방명록에 새글쓰기
	@RequestMapping("/insert.do")
	public String insert(VisitVO vo) throws IllegalStateException, IOException {
		
		//ip구하기
		String ip = request.getRemoteAddr();
		vo.setIp(ip);
		
		String webPath = "/resources/upload/";
		String savePath = application.getRealPath(webPath);
		System.out.println(savePath);//파일이 저장되는 경로
		
		//업로드 된 파일의 정보
		MultipartFile photo = vo.getPhoto();
		String filename = "no_file";
		
		if( !photo.isEmpty() ) {
			//정상적으로 파일이 업로드 되었다면...
			//업로드 된 실제 파일명을 가져온다.
			filename = photo.getOriginalFilename();
			File saveFile = new File(savePath, filename);
			
			if( !saveFile.exists() ) {
				saveFile.mkdirs();
			}else {
				long time = System.currentTimeMillis();
				filename = String.format("%d_%s", time, filename);
				saveFile = new File(savePath, filename);
			}
			
			photo.transferTo(saveFile);
			
		}
		
		vo.setFilename(filename);
		
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















