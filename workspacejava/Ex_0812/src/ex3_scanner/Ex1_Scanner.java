package ex3_scanner;

import java.util.Scanner;

//ctrl shift o = 자동 임포트                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
public class Ex1_Scanner {
	public static void main(String[] args) {

		// Scanner는 키보드에서 값을 입력받아 전달하기 위한 클래스
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수  : ");
		int n = scan.nextInt();
		System.out.println("입력받은 값 : " + n);
		
		System.out.println("문장 : ");
		String s = scan.next();
		System.out.println("값 : " + s);
	}// main
}
