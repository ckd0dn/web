package ex2_fileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex1_FileInput {
	public static void main(String[] args) {
		
		String path = "C:/창우 자바/test.txt";
		File f = new File(path);
		
		if(f.exists() ) {//path경로가 물리적으로 존재하는지...
			
			//파일클래스와 연결된 InpputStream을 생성
			try {
				
				//스트림의 종류
				//....Stream : btye기반의 스트림
				//....Reader, ....Writer : char기반의 스트림
				
				FileInputStream fis = new FileInputStream(f);
				
				int code = -1;
				
				//스트림은 더이상 읽을 것이 없다면 -1을 반환하게 되어있다.
				//이것을 EOF(End of File)라고 하며, 현재의 while문은
				//EOF를 만날때 까지 반복하며 아스키 코드 형태의 데이터를 정수로 읽어온다.
				while( ( code = fis.read() ) != -1) {
					
					System.out.print( (char)code);
				}//while
				
				if(fis != null) {
					//스트림을 열어서 (new) 사용한 뒤에는 close()를 통해 반드시 닫아줘야 한다.
					fis.close();
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}//main
}
