package ex1_file;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {
	
		String path = "C:/â�� �ڹ�";
		File f1 = new File(path);
		
		if(f1.isDirectory()) {
			//����Ŭ������ ���� ��ΰ� ������ ��쿡�� ��������� ��������!!
			//�� ��������� ������ ��� ����� ����
			
			//path����� ���� ��ҵ��� FileŬ������ �迭 �������� �޴´�
			//FileŬ���� �������� �޾ұ� ������, ������ ������ ������ ����
			File[] ar = f1.listFiles();
			
			for (int i = 0; i < ar.length; i++) {
				
				//���������� ������Ҹ� ���
				if(ar[i].isDirectory()) {
					System.out.println(ar[i].getName());
				}
			
			}//for
		}
	}//main
}
