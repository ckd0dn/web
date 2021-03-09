package ex1_try_catch;

import java.util.Scanner;

public class Ex2_Try_Catch {
	public static void main(String[] args) {
		//정수 : 10
		//결과 : 10
		
		//정수 : aa
		//정수만 입력할 수 있습니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		
		try {
			int n = sc.nextInt();
			System.out.println("결과 : " + n);
			
		} catch (Exception e) {
			System.out.println("정수만 입력하십시오");
		}
	}
}


















