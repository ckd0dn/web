package ex1_file;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		
		String path = "C:/â�� �ڹ�";
		File f = new File(path);
		
		if( !f.isFile() ) {
			//FileŬ������ ���� ��ΰ� ���������� �ƴ� ���������� ���
			
			//������ ���丮(����)�ȿ� �ִ� ���� ��ҵ��� �̸��� ��� �����ͺ���!!
			String[] name = f.list();
			
			//������ ���� ��� ���
			for (int i = 0; i < name.length; i++) {
				System.out.println(name[i]);
			}//for
			
		}//if
		
	}//main
}
