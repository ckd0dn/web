package ex2_control_statement;

import java.util.Scanner;

public class Ex3_singleFor {
	public static void main(String[] args) {
		
		//Ű���忡�� ���� n�� �Է¹޴´�.
		//1���� n������ ���� ����Ͽ� ����� ���
		//(������� 5�� �޾Ҵٸ� 1+2+3+4+5�� ����� 15�� ��µǸ� �ȴ�)
		
		//���� : 4
		//��� : 10
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� :" );
		int n = scan.nextInt();
		int s=0;
		
		for (int i = 1; i <= n; i++) {
			s += i;
			
		}//for
		
		System.out.println("��� :" + s);
	}//main
}
