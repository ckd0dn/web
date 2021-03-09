package ex2_control_statement;

import java.util.Scanner;

public class Ex3_singleFor {
	public static void main(String[] args) {
		
		//키보드에서 정수 n을 입력받는다.
		//1부터 n까지의 합을 계산하여 결과를 출력
		//(예를들어 5를 받았다면 1+2+3+4+5의 결과인 15가 출력되면 된다)
		
		//정수 : 4
		//결과 : 10
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 :" );
		int n = scan.nextInt();
		int s=0;
		
		for (int i = 1; i <= n; i++) {
			s += i;
			
		}//for
		
		System.out.println("결과 :" + s);
	}//main
}
