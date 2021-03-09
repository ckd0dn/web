package ex1_file;

import java.io.File;

public class Ex4_File {
	public static void main(String[] args) {
		
		String path = "C:/창우 자바/abc/hts";
		File f = new File(path);
		
		if( !f.exists() ) {//path 경로 까지 물리적인 파일이나 폴더가 존재하지 않는경우
			System.out.println("폴더생성 완료!!");
			//물리적인 폴더 생성
			f.mkdirs();
		}else {
			System.out.println("폴더가 이미 존재합니다");
		}
	}//main
}
