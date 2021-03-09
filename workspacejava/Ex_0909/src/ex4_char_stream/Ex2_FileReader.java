package ex4_char_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex2_FileReader {
	public static void main(String[] args) throws IOException {

		//test.txt�� ������ FileReader�� �о�� ��,
		//�빮�ڿ� �ҹ��ڰ� ���� �� ���� �����ϴ��� ���

		//�빮�� : 3
		//�ҹ��� : 3 

		String path = "C:\\â�� �ڹ�/test.txt";
		File f = new File(path);

		int da = 0;
		int so = 0;

		FileReader fr = null;
		try {
			fr = new FileReader(f);
			int code = -1;

			while( (code = fr.read()) != -1 ) {

				if(code >= 65 && code <= 90) {
					da++;
				}else if (code >= 97 && code <= 122) {
					so++;
				}

			}

			System.out.println("�빮�� : " + da);
			System.out.println("�ҹ��� : " + so);
			
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			fr.close();
		}


	}//main
}
