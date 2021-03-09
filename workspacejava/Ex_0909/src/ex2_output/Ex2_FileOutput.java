package ex2_output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2_FileOutput {
	public static void main(String[] args) throws IOException {
		
		String path = "C:/창우 자바/fileOutput.txt";
		File f = new File(path);
		FileOutputStream fos = null;
		
		//if( !f.exists() ) {
			
			try {
				fos = new FileOutputStream(f);
				String msg = "file Output스트림의 예제";
				String msg2 = "\n두번째 줄, 한글도 잘됨";
				
				//FileOutputStream은 byte기반의 스트림이기 때문에
				//기록하고자 하는 문자열 msg를 byte의 배열로 변환하여 기록해야 한다.
				
				fos.write(msg.getBytes());
				fos.write(msg2.getBytes());
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				
				fos.close();
			}
			
		
		
		
	}//main
}
