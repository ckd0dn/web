package ex4_char_stream;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Ex4_FileWriter {
	public static void main(String[] args) throws IOException {
		
		String path = "C:\\â�� �ڹ�/fileWriter����.txt";
		FileWriter fw = null;
		
		try {
			
			fw = new FileWriter(path);
			String str1 = "���� FileWriter�� �����Դϴ�\n";
			String str2 = "���� ���� �����Դϴ�";
			
			//FileOutputStream fos = new FileOutputStream(path);
			//fos.write(str1.getBytes());
			
			//char����� ��½�Ʈ��(Writer)�� ���ڿ��� 2byte�� �����Ҽ� �ִ�!!
			fw.write(str1);
			fw.write(str2);
			
			//fw.flush();
		} catch (Exception e) {
			
		}finally {
			fw.close();
		}
		
	}//main
}
