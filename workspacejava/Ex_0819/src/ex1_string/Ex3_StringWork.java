package ex1_string;

import java.util.Scanner;

public class Ex3_StringWork {
	public static void main(String[] args) {
		
		//키보드에서 next()를 통해 문장을 입력받는다
		//입력받은 문장에서 소문자  a가 몇개 있는지를 출력
		
		//입력 : asdzxcafqweawdascxzc;
		//a의 갯수 : 2
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문장을 입력하세요 : ");
		String a = sc.next();
		
		int total = 0;
		
		
	
		
		for (int i = 0; i < a.length(); i++) {
			
			if (a.charAt(i) == 'a') { //a 문장의 i번째 문자를 잘라와서 비교
				total++;
				
			} 
			
		}
		System.out.println("a의 개수 : " + total);
	}//main
}
