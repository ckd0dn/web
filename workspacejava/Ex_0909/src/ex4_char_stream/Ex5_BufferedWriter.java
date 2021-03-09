package ex4_char_stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex5_BufferedWriter {
	public static void main(String[] args) throws IOException {
		
		String path = "C:\\창우 자바/버퍼드라이터 예제.txt";
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
		
			fw = new FileWriter(path);
			bw = new BufferedWriter(fw);
			
			String str = "기록하자 abc";
			bw.write(str);
			bw.write("갑돌이와 갑순이aa");
			
			bw.newLine();//라인변경("\n")
			
			bw.write("파란해골 13호 납작코가 되었네.");
			
			bw.flush();//물리적으로 내용을 기록하는 메서드
			//bw.close()시 자동으로 호출된다
		} catch (Exception e) {

		}finally {
			
			bw.close();
			fw.close();
		}
		
	}//main
}
