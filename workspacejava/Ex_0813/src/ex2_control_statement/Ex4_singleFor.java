package ex2_control_statement;

import java.util.Scanner;

public class Ex4_singleFor {
	public static void main(String[] args) {

		//Ű���忡�� n1�� n2�� �������� �Է� �޴´�
		//n1 ~ n2 ������ ���� ����Ͽ� ����� ���
		//(���� ��� 2�� 5�� �Է� �޾Ҵٸ� 2+3+4+5�� ����� 15�� ���)
		//�� ,n1 �� n2�� ���� �ݴ�� �ԷµǾ ����� �Ȱ��� �������� ó��

		//��1 : 2
		//��2 : 5
		//��� : 14

		//��1 : 5 
		//��2 : 2 
		//��� : 15

		Scanner scan = new Scanner(System.in);

		System.out.println("����  n1: ");
		int n1 = scan.nextInt();	
		
		System.out.println("����  n2: ");
		int n2 = scan.nextInt();	

		int sum=0;
		int a=0;
		
		//�������� �� ��ȯ
	
		if(n1>n2) {
			a=n1;  
			n1=n2;
			n2=a;
		}

		for (int i = n1; i <= n2; i++) {

			sum+=i;

		}

		System.out.println("��� : " + sum);
	}//main
}
