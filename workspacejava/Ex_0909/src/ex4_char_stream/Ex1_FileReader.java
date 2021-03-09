package ex4_char_stream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex1_FileReader {
	public static void main(String[] args) throws IOException {
		
		String path = "C:/창우 자바/fileOutput.txt";
		File f = new File(path);
		
		//char기반의 스트림인 FileReader는 한글을 입력받기에 적합하다
		FileReader fr = null;
		
		try {
		
			fr = new FileReader(f);
			int code = -1;
			
			//char기반의 스트림은 read()메서드가 2byte씩 데이터를 읽을 수  있으므로
			//한글이 정상적으로 출력된다!
			while( (code = fr.read()) != -1 ) {
				
				System.out.print((char)code);
			}
			
		} catch (Exception e) {

		} finally {
			fr.close();
		}
	}
}
