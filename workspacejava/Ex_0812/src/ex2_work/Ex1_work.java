package ex2_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		// 몇월생? : 3
		// 3월은 31일 까지 있습니다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("몇월생? : ");
		int month = scan.nextInt();

		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "월은 31일 까지 있습니다");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "월은 30일 까지 있습니다");
			break;
		case 2:
			System.out.println(month + "월은 28일 까지 있습니다");
			break;
		default:
			System.out.println("잘못된 입력값 입니다.");
			break;
		}// switch
	}// main
}
