package ex2_control_statement;

import java.util.Scanner;

public class Ex2_singleFor {
	public static void main(String[] args) {
		
		//스캐너를 통해 키보드에서 2 ~ 9중 한가지를 입력 받고
		//입력받은 숫자에 해당되는 구구단을 출력
		//단 , 2 ~9사이의 숫자가 입려고디지 않았을 경우
		//"2 ~ 9사이의 숫자만 입력하세요" 라는 문장을 출력
		
		//단 : 5
		//5 * 1 = 5 
		// ....
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("단 :");
		int num = scan.nextInt();
		
		
			
		
		if(num>=2 && num<=9) {
			for (int m = 1; m <=9; m++) {
				System.out.printf("%d * %d = %d\n", num , m , num*m);
			}
		}	
		else{
		System.out.println("2 ~ 9사이의 숫자만 입력하세요");
		
		}


	
		
		
	}//main
}
