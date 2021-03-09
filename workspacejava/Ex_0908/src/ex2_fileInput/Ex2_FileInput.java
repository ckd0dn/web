package ex2_fileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex2_FileInput {
	public static void main(String[] args) throws IOException {
		

		String path = "C:/창우 자바/test.txt";
		File f = new File(path);
		byte[] b_read = new byte[(int) f.length()];//파일의 용량만큼 배열생성
		
		FileInputStream fis = null;
		
		if( f.exists() ) {
			
			try {
				fis = new FileInputStream(f);
			
				fis.read(b_read);
				
				//byte[]을 String타입으로 변경하여 출력이 가능
				String res = new String(b_read);
				
				
				
				System.out.println(res);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				//예외 여부에 상관없이 반드시 거치는 영역
				if( fis != null) {
					
					fis.close();
				}
			}
			
		}
		
		
	}//main
}
