package ex2_output;

import java.io.PrintStream;

public class Ex1_Output {
	public static void main(String[] args) {
		//PrintStream�� OutputStream�� ��ǥ���� �ڽ�Ŭ�����ν�
		//ȭ�鿡(�ܼ�â) �����͸� ����ϵ��� �ϴ� Ŭ����
		PrintStream ps = null;
		
		try {
			
			ps = System.out;
			ps.write(65);
			ps.write('B');
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			//ps�� close()�� ������ �۾��� �̿ϼ� �Ǿ��ٰ� �Ǵ��Ͽ�
			//ȭ�鿡 �����͸� ������� �ʽ��ϴ�.
			ps.close();
			
		}
	}//main
}
