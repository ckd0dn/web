package ex4_char_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex3_BufferedReader {
	public static void main(String[] args) throws IOException {
		
		String path = "C:\\â�� �ڹ�/test.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
		
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String msg ="";
			
			//BufferedReader�� ���پ� �����͸� ������ �� ������
			//EOF�� null�̴�.
			while ( (msg = br.readLine() ) != null) {
				System.out.println(msg);
			}
			
		} catch (Exception e) {

		}finally {
			br.close();
			fr.close();
		}
		
		
	}//main
}
