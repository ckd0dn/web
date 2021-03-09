package ex1_beffered_input;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex1_BufferedInput {
	public static void main(String[] args) throws IOException {
		//일반 스트림과 Buffered스트림을 연결함으로써
		//파일을 읽거나 쓸 때 버퍼링작업을 수행하도록 한다.
		//버퍼링이란, 출력하고자 하는 데이터들을 버퍼라는메모리 공간에바이트배열로 미리저장해두는 작업
		//버퍼라는 영역은 입출력을 위해 마련된 기억장치의 한 부분으로써 버퍼에 자료를 모아두면
		//입출력 속도 향상에 도움이된다.
		//Buffered 스트림을 사용하면 "입출력 속도 향상에 도움이 된다!!"
		
		
		
		String path = "C:/창우 자바/test.txt";
		File f = new File(path);
		byte[] read = new byte[(int)f.length()];
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream(f);
			bis = new BufferedInputStream(fis);
			
			//bis로 전용 통로를 통해 데이터를 읽어온다!!
			bis.read(read);
			
			System.out.println(new String(read));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			//스트림이 여러개일 경우 생성된 역순으로 close()해주는 것이 좋다!!
			bis.close();
			fis.close();
		}
	}//main
}
