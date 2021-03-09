package ex3_buffered_output;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex1_BufferedOutput {
	public static void main(String[] args) throws IOException {
		
		String path = "C:/â�� �ڹ�/buffferedOutput.txt";
		File f = new File(path);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			
			fos = new FileOutputStream(f);
			bos = new BufferedOutputStream(fos);
			
			String msg = "Buf�ƿ�ǲ ��Ʈ���� exam";
			bos.write(msg.getBytes());

			//bos�� close()�� �� �˾Ƽ� flush()�޼��尡 ���������� ȣ��ȴ�.
			//flush()�� ������ ���������� ����ϱ� ���� �޼���.
			bos.flush();
			
		} catch (Exception e) {

		} finally {
			
			
			bos.close();
			fos.close();
			
		}
		
		
		
	}//main
}
