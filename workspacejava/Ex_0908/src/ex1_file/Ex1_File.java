package ex1_file;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {
		
		//IO( Input, Output)
		//IO�� ����� ��Ʈ���� �ǹ��Ѵ�
		//��Ʈ���̶� �����͸� ������ϱ����� ������ ���
		//���α׷����� ������ �о���δٴ���, �ܼ��� ���� �������� ���� �۾��� ����
		//JVM���� �ַܼ� ���� ���������� Output, �ܼ��� ���� JVM�� �о�ö� Input
		String path = "C:/â�� �ڹ�/test.txt";
		File f = new File( path );
		
		if( f.isFile() ) { //!f.isDirectory() <-- �̷��Ե� ���� !!!
			
			System.out.println("������ ũ�� : " + f.length() + "byte" );
			
		}
		
		
	}//main
}
