package ex1_file;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		
		String path = "C:/창우 자바";
		File f = new File(path);
		
		if( !f.isFile() ) {
			//File클래스의 접근 경로가 파일형식이 아닌 폴더형식인 경우
			
			//접근한 디렉토리(폴더)안에 있는 하위 요소들의 이름을 모두 가져와보자!!
			String[] name = f.list();
			
			//가져온 하위 요소 출력
			for (int i = 0; i < name.length; i++) {
				System.out.println(name[i]);
			}//for
			
		}//if
		
	}//main
}
