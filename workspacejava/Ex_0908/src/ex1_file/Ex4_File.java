package ex1_file;

import java.io.File;

public class Ex4_File {
	public static void main(String[] args) {
		
		String path = "C:/â�� �ڹ�/abc/hts";
		File f = new File(path);
		
		if( !f.exists() ) {//path ��� ���� �������� �����̳� ������ �������� �ʴ°��
			System.out.println("�������� �Ϸ�!!");
			//�������� ���� ����
			f.mkdirs();
		}else {
			System.out.println("������ �̹� �����մϴ�");
		}
	}//main
}
