package ex2_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		// �����? : 3
		// 3���� 31�� ���� �ֽ��ϴ�.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�����? : ");
		int month = scan.nextInt();

		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "���� 31�� ���� �ֽ��ϴ�");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "���� 30�� ���� �ֽ��ϴ�");
			break;
		case 2:
			System.out.println(month + "���� 28�� ���� �ֽ��ϴ�");
			break;
		default:
			System.out.println("�߸��� �Է°� �Դϴ�.");
			break;
		}// switch
	}// main
}
