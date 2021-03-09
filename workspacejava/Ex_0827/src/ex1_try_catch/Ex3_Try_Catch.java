package ex1_try_catch;

import java.util.Scanner;

public class Ex3_Try_Catch {
	public static void main(String[] args) {
		
		//정수 : 10
		//결과 : 10
		
		//정수 : aa
		//aa은(는) 정수가 아닙니다
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		String str = "";
		
		try {
			
			str = sc.next();
			System.out.println("결과 : " + Integer.parseInt(str));
			
		} catch (Exception e) {
			System.out.println(str + "은(는) 정수가 아닙니다");
		}
		
	}//main
}









































































