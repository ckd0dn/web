package ex4_char_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex2_FileReader {
	public static void main(String[] args) throws IOException {

		//test.txt의 내용을 FileReader로 읽어온 후,
		//대문자와 소문자가 각각 몇 개씩 존재하는지 출력

		//대문자 : 3
		//소문자 : 3 

		String path = "C:\\창우 자바/test.txt";
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

			System.out.println("대문자 : " + da);
			System.out.println("소문자 : " + so);
			
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			fr.close();
		}


	}//main
}
