package ex1_file;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {
	
		String path = "C:/창우 자바";
		File f1 = new File(path);
		
		if(f1.isDirectory()) {
			//파일클래스의 접근 경로가 폴더일 경우에만 하위목록을 가져오자!!
			//단 하위목록중 폴더만 골라서 출력할 예정
			
			//path경로의 하위 요소들을 File클래스의 배열 형식으로 받는다
			//File클래스 형식으로 받았기 때문에, 폴더나 파일의 구분이 가능
			File[] ar = f1.listFiles();
			
			for (int i = 0; i < ar.length; i++) {
				
				//폴더형식의 하위요소만 출력
				if(ar[i].isDirectory()) {
					System.out.println(ar[i].getName());
				}
			
			}//for
		}
	}//main
}
