package ex4_char_stream;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Ex4_FileWriter {
	public static void main(String[] args) throws IOException {
		
		String path = "C:\\창우 자바/fileWriter예제.txt";
		FileWriter fw = null;
		
		try {
			
			fw = new FileWriter(path);
			String str1 = "저는 FileWriter의 예제입니다\n";
			String str2 = "나도 같은 예제입니다";
			
			//FileOutputStream fos = new FileOutputStream(path);
			//fos.write(str1.getBytes());
			
			//char기반의 출력스트림(Writer)은 문자열을 2byte씩 전송할수 있다!!
			fw.write(str1);
			fw.write(str2);
			
			//fw.flush();
		} catch (Exception e) {
			
		}finally {
			fw.close();
		}
		
	}//main
}
