package ex2_while;

import java.util.Random;

public class Ex2_do_while {
	public static void main(String[] args) {
		
		//do-while : �� ó��, �� ��
		//��� �� �����ϰ� ;���� ������
		
		//do{
		//	���ǽ��� ���� �� ����Ǵ� ����
		//}while(���ǽ�);
		
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10 );
		
		/*
		 java, jsp, android�� ������ �ô�.
		 �� ���� ������ �������� 0 ~ 130�� ����
		 
		 �� ���� ���� �˻縦 do-while�� ���� �����ϴµ�,
		 0 ~ 100������ ������ �ƴ� ��쿡�� �ݵ�� 0 ~ 100������ ���� ���ö����� 
		 �ڵ����� ����� ��ų��.
		 
		 �̷��� �� ������ ������ ��� 0 ~ 100���̰� �Ǹ� do-while�� ��������
		 ���� ������ ȭ�鿡 ����� ��!!
		 */
		
		int java = 0;
		int jsp = 0;
		int android = 0;
		
		
		do {
			java = new Random().nextInt(131);
			jsp = new Random().nextInt(131); 
			android = new Random().nextInt(131); 
			
		} while (java >100 || jsp > 100 || android > 100);
		
		System.out.println("java ���� : " + java );
		System.out.println("jsp ���� : " + jsp );
		System.out.println("android ���� : " + android );
	}//main
}
