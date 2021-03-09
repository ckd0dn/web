package ex2_control_statement;

import java.util.Scanner;

public class Ex4_singleFor {
	public static void main(String[] args) {

		//키보드에서 n1과 n2에 정수값을 입력 받는다
		//n1 ~ n2 까지의 합을 계싼하여 결과를 출력
		//(예를 들어 2와 5를 입력 받았다면 2+3+4+5의 결과인 15를 출력)
		//단 ,n1 과 n2의 값이 반대로 입력되어도 결과는 똑같이 나오도록 처리

		//수1 : 2
		//수2 : 5
		//결과 : 14

		//수1 : 5 
		//수2 : 2 
		//결과 : 15

		Scanner scan = new Scanner(System.in);

		System.out.println("정수  n1: ");
		int n1 = scan.nextInt();	
		
		System.out.println("정수  n2: ");
		int n2 = scan.nextInt();	

		int sum=0;
		int a=0;
		
		//변수간의 값 교환
	
		if(n1>n2) {
			a=n1;  
			n1=n2;
			n2=a;
		}

		for (int i = n1; i <= n2; i++) {

			sum+=i;

		}

		System.out.println("결과 : " + sum);
	}//main
}
