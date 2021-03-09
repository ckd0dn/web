package ex1_random;

import java.util.Random;

public class Ex1_random {
	public static void main(String[] args) {
		
		//난수를 발생시키는 Random클래스
		
		//예) 1 ~ 4  사이의 난수 발생
		// new Random().nextInt(발생할 난수의 범위) + 시작수;
		// 발생할 난수의 범위 = 큰수 -작은 수 + 1 
		int num = new Random().nextInt(4) + 1;
		System.out.println(num);
		
		//알파벳 대문자중 하나를 랜덤으로 화면에 출력
		//결과 : F
		
		int c = new Random().nextInt(90-65+1) + 65;
		int s = new Random().nextInt('Z'-'A'+1) + 'A';
		System.out.println((char)c);
	}//main
}
