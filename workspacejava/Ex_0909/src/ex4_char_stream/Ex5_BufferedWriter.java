package ex4_char_stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex5_BufferedWriter {
	public static void main(String[] args) throws IOException {
		
		String path = "C:\\â�� �ڹ�/���۵������ ����.txt";
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
		
			fw = new FileWriter(path);
			bw = new BufferedWriter(fw);
			
			String str = "������� abc";
			bw.write(str);
			bw.write("�����̿� ������aa");
			
			bw.newLine();//���κ���("\n")
			
			bw.write("�Ķ��ذ� 13ȣ �����ڰ� �Ǿ���.");
			
			bw.flush();//���������� ������ ����ϴ� �޼���
			//bw.close()�� �ڵ����� ȣ��ȴ�
		} catch (Exception e) {

		}finally {
			
			bw.close();
			fw.close();
		}
		
	}//main
}
