package com.korea.fileupload;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import vo.PhotoVO;

@Controller
public class FileuploadController {
	
	@Autowired
	ServletContext application;
	
	@Autowired
	HttpServletRequest request;
	
	public static final String VIEW_PATH = "/WEB-INF/views/";
	
	//파일을 포함한 입력 폼 띄워주기
	@RequestMapping(value={"/", "/insert_form.do"})
	public String insert_form() {
		return VIEW_PATH + "insert_form.jsp";
	}
	
	//파일 업로드
	@RequestMapping("/upload.do")
	public String upload( PhotoVO vo ) throws IllegalStateException, IOException {
		
		String savePath = "c:/myupload";
		
		//업로드 될 파일의 정보
		MultipartFile photo = vo.getPhoto();
		String filename = "no_file";
		
		//파일이 정상적으로 업로드 되었다면...
		if( !photo.isEmpty() ) {
			
			//업로드된 파일의 실제 파일명
			filename = photo.getOriginalFilename();
			
			//저장할 파일경로 생성하기
			File saveFile = new File(savePath, filename);
			if( !saveFile.exists() ) {
				saveFile.mkdirs();
			}else {
				//동일한 파일명이 존재할 경우 현재 업로드 시간을 파일명 뒤에 붙여서
				//중복을 방지해준다.
				long time = System.currentTimeMillis();
				filename = String.format("%d_%s", time, filename);
				saveFile = new File( savePath, filename);
			}
			
			//업로드 된 파일은 MultipartResolver클래스가 지정해놓은 임시 저장소에 자동으로 들어간다
			//임시저장소에 있는 파일은 일정기간이 지나면 자동으로 삭제되기 때문에, 개발자가
			//지정해준 경로로 파일을 복사해둬야 한다.
			photo.transferTo(saveFile);
			
		}//if
		
		vo.setFilename(filename);
		
		return "";
	}
}
















































