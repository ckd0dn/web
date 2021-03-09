package ex1_beffered_input;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex1_BufferedInput {
	public static void main(String[] args) throws IOException {
		//�Ϲ� ��Ʈ���� Buffered��Ʈ���� ���������ν�
		//������ �аų� �� �� ���۸��۾��� �����ϵ��� �Ѵ�.
		//���۸��̶�, ����ϰ��� �ϴ� �����͵��� ���۶�¸޸� ����������Ʈ�迭�� �̸������صδ� �۾�
		//���۶�� ������ ������� ���� ���õ� �����ġ�� �� �κ����ν� ���ۿ� �ڷḦ ��Ƶθ�
		//����� �ӵ� ��� �����̵ȴ�.
		//Buffered ��Ʈ���� ����ϸ� "����� �ӵ� ��� ������ �ȴ�!!"
		
		
		
		String path = "C:/â�� �ڹ�/test.txt";
		File f = new File(path);
		byte[] read = new byte[(int)f.length()];
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream(f);
			bis = new BufferedInputStream(fis);
			
			//bis�� ���� ��θ� ���� �����͸� �о�´�!!
			bis.read(read);
			
			System.out.println(new String(read));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			//��Ʈ���� �������� ��� ������ �������� close()���ִ� ���� ����!!
			bis.close();
			fis.close();
		}
	}//main
}
