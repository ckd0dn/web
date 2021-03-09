package ex2_fileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex2_FileInput {
	public static void main(String[] args) throws IOException {
		

		String path = "C:/â�� �ڹ�/test.txt";
		File f = new File(path);
		byte[] b_read = new byte[(int) f.length()];//������ �뷮��ŭ �迭����
		
		FileInputStream fis = null;
		
		if( f.exists() ) {
			
			try {
				fis = new FileInputStream(f);
			
				fis.read(b_read);
				
				//byte[]�� StringŸ������ �����Ͽ� ����� ����
				String res = new String(b_read);
				
				
				
				System.out.println(res);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				//���� ���ο� ������� �ݵ�� ��ġ�� ����
				if( fis != null) {
					
					fis.close();
				}
			}
			
		}
		
		
	}//main
}
