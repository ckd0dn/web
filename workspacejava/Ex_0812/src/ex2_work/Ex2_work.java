package ex2_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		
		/*
		 ��1 : 15
		 ��2 : 5
		 ������ : +
		 15 + 5 = 20
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��1 : ");
	   
		int n1 = scan.nextInt();
		
		System.out.print("��2 : ");
		
		int n2 = scan.nextInt();
		
		System.out.print("������ : ");
		
		String c = scan.next();
		
		switch (c) {
		case "+" :
			System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
			break;
		case "-":
			System.out.printf("%d - %d = %d\n", n1, n2, n1 - n2);
			break;
		case "*" :
			System.out.printf("%d * %d = %d\n", n1, n2, n1 * n2);
			break;
		case "/" :
			System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2);
			break;

		default:
			System.out.println("����");
			break;
		}
	}
}
