package ex1_string;

import java.util.Scanner;

public class Ex3_StringWork {
	public static void main(String[] args) {
		
		//Ű���忡�� next()�� ���� ������ �Է¹޴´�
		//�Է¹��� ���忡�� �ҹ���  a�� � �ִ����� ���
		
		//�Է� : asdzxcafqweawdascxzc;
		//a�� ���� : 2
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ��� : ");
		String a = sc.next();
		
		int total = 0;
		
		
	
		
		for (int i = 0; i < a.length(); i++) {
			
			if (a.charAt(i) == 'a') { //a ������ i��° ���ڸ� �߶�ͼ� ��
				total++;
				
			} 
			
		}
		System.out.println("a�� ���� : " + total);
	}//main
}
