package ex2_fileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex1_FileInput {
	public static void main(String[] args) {
		
		String path = "C:/â�� �ڹ�/test.txt";
		File f = new File(path);
		
		if(f.exists() ) {//path��ΰ� ���������� �����ϴ���...
			
			//����Ŭ������ ����� InpputStream�� ����
			try {
				
				//��Ʈ���� ����
				//....Stream : btye����� ��Ʈ��
				//....Reader, ....Writer : char����� ��Ʈ��
				
				FileInputStream fis = new FileInputStream(f);
				
				int code = -1;
				
				//��Ʈ���� ���̻� ���� ���� ���ٸ� -1�� ��ȯ�ϰ� �Ǿ��ִ�.
				//�̰��� EOF(End of File)��� �ϸ�, ������ while����
				//EOF�� ������ ���� �ݺ��ϸ� �ƽ�Ű �ڵ� ������ �����͸� ������ �о�´�.
				while( ( code = fis.read() ) != -1) {
					
					System.out.print( (char)code);
				}//while
				
				if(fis != null) {
					//��Ʈ���� ��� (new) ����� �ڿ��� close()�� ���� �ݵ�� �ݾ���� �Ѵ�.
					fis.close();
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}//main
}
