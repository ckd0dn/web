package ex3_scanner;

import java.util.Scanner;

//ctrl shift o = �ڵ� ����Ʈ                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
public class Ex1_Scanner {
	public static void main(String[] args) {

		// Scanner�� Ű���忡�� ���� �Է¹޾� �����ϱ� ���� Ŭ����
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����  : ");
		int n = scan.nextInt();
		System.out.println("�Է¹��� �� : " + n);
		
		System.out.println("���� : ");
		String s = scan.next();
		System.out.println("�� : " + s);
	}// main
}
