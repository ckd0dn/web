package ex2_output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2_FileOutput {
	public static void main(String[] args) throws IOException {
		
		String path = "C:/â�� �ڹ�/fileOutput.txt";
		File f = new File(path);
		FileOutputStream fos = null;
		
		//if( !f.exists() ) {
			
			try {
				fos = new FileOutputStream(f);
				String msg = "file Output��Ʈ���� ����";
				String msg2 = "\n�ι�° ��, �ѱ۵� �ߵ�";
				
				//FileOutputStream�� byte����� ��Ʈ���̱� ������
				//����ϰ��� �ϴ� ���ڿ� msg�� byte�� �迭�� ��ȯ�Ͽ� ����ؾ� �Ѵ�.
				
				fos.write(msg.getBytes());
				fos.write(msg2.getBytes());
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				
				fos.close();
			}
			
		
		
		
	}//main
}
