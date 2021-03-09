package ex1_string;

import java.util.Scanner;

public class Ex4_StringWork {
	public static void main(String[] args) {
		
		//주민번호 판단 로직 구현하기
		
		//주민번호를 입력하세요 (-포함)
		//>> 991203-1122334
		//당신은 99년 12월 03일에 태어난 남자입니다
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하세요 (-포함)");
		System.out.print(">>");
		String number = sc.next();
		
		String year = number.substring(0,2);
		String month = number.substring(2,4);
		String day = number.substring(4,6);
		String gender = "";
		
		
		if (number.charAt(7) == '1' || number.charAt(7) == '3') {
			gender = "남자";
		}else if (number.charAt(7) == '2' || number.charAt(7) == '4') {
			gender = "여자";			
		}
		
		System.out.println("당신은 " + year + "년 " + month + "월 " + day + "일에 태어난 " + gender + "입니다");
		
		
	}//main
}
