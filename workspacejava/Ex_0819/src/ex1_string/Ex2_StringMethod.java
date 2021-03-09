package ex1_string;

import java.util.Scanner;

public class Ex2_StringMethod {
	public static void main(String[] args) {
		//스트링 클래스의 메서드들
		//메서드란 어떠한 작업을 수행하기 위한 명령문들의 집합!!
		//반복적으로 사용되는 코드를 줄이기 위해 개발되었다. 
		
		String str = "Hong Gil Dong"; 
		int len = str.length();
		System.out.println("Str의 길이 : " + str.length());
		
		int index = str.indexOf('o');
		System.out.println("맨 처음 문자 o의 위치 : " + index);
		
		index = str.lastIndexOf('o');
		System.out.println("마지막 문자 o의 위치 : " + index);
		
		index = str.indexOf("Gil");
		System.out.println("Gil의 시작위치 : " + index);
		
		char res = str.charAt(6);
		System.out.println("6번째 위치의 문자 : "  + res);
		
		String res2 = str.substring(2, 7); //2부터 6까지 
		System.out.println("추출해낸 문장 :" + res2);
		
		String name1 = "apple";
		String name2 = "Apple";
		
		if (name1.equals(name2)) {
			System.out.println("두 문장의 값이 같습니다.");
		}else {
			System.out.println("두 문장의 값이 다릅니다");
		}
		//영문 비교시 대소문자를 무시하는 메서드
		if (name1.equalsIgnoreCase(name2)) {
			System.out.println(name1 + "과" + name2 + " 는 같은단어입니다.");
			
		}
		
		String id = " system";
		String id2 = id.trim();//문장 앞뒤의 의미없는 공백을 제거
		if (id.equals("system")) {
			System.out.println("관리자로 로그인");
		}
		
		//스트링의 메서드는 아니지만 아주아주아주아주아주 많이 사용하는 메서드
		//문자열로 작성한 숫자형태의 데이터를 실제 숫자로 바꿔주는 메서드
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수  :");
		String number = sc.next();
		
		int number2 = Integer.parseInt(number);
		
		System.out.println(number2 + 1 );
		
		String f = "3.14";
		float ff = Float.parseFloat(f);
		System.out.println(ff+1);
		//wrapper 클래스
		//int -> Integer
		//char -> Character
		//byte -> Byte
		//boolean -> Boolean
		//short -> Short
		//long -> Long
		//float -> Float
		//double -> Double
	}//main
}
