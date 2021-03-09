package ex3_buffered_output;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex1_BufferedOutput {
	public static void main(String[] args) throws IOException {
		
		String path = "C:/창우 자바/buffferedOutput.txt";
		File f = new File(path);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			
			fos = new FileOutputStream(f);
			bos = new BufferedOutputStream(fos);
			
			String msg = "Buf아웃풋 스트림의 exam";
			bos.write(msg.getBytes());

			//bos이 close()될 때 알아서 flush()메서드가 내부적으로 호출된다.
			//flush()는 내용을 물리적으로 기록하기 위한 메서드.
			bos.flush();
			
		} catch (Exception e) {

		} finally {
			
			
			bos.close();
			fos.close();
			
		}
		
		
		
	}//main
}
