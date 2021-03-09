package ex1_string;

import java.util.Scanner;

public class Ex5_StringWork {
	public static void main(String[] args) {
		
		//키보드에서 .next()로 값을 받고
		//회문수(앞으로 읽어도 뒤로 읽어도 똑같이 읽히는 숫자) 구하기
		
		//입력 : a1b1a
		//a1b1a은(는) 회문수 입니다
		
		//입력 : aabb
		//aabb은(는) 회문수가 아닙니다
		
		// 앞뒤로 비교하는 방법
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		String su = sc.next();
		
		int n = su.length();
		
		for (int i = 0; i < su.length(); i++) {
			
			if (su.charAt(i) == su.charAt(n-1)) {
				n--;
				
			}else if (i == su.length()/2) {
				System.out.println(su + "은(는) 회문수 입니다");
			}else {
				System.out.println(su + "은(는) 회문수가 아닙니다");
			}
			
		}//for
		
		
		//통째로 뒤집어서 비교하는 방법
		
		System.out.println("입력 : ");
		
		String ori = sc.next();
		String rev  = "";
		
		for (int i = ori.length()-1; i >= 0; i--) {
			
			rev += ori.charAt(i);
		
		}//for
		
		if (ori.equals(rev)) {
			System.out.println(ori + "은(는) 회문수 입니다");
			
		}else {
			System.out.println(ori + "은(는) 회문수가 아닙니다");
		}
	}//main
}	
