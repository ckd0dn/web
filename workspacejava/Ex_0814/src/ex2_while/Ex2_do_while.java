package ex2_while;

import java.util.Random;

public class Ex2_do_while {
	public static void main(String[] args) {
		
		//do-while : 선 처리, 후 비교
		//제어문 중 유일하게 ;으로 끝난다
		
		//do{
		//	조건식이 참일 때 실행되는 영역
		//}while(조건식);
		
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10 );
		
		/*
		 java, jsp, android의 시험을 봤다.
		 각 과목별 점수는 랜덤으로 0 ~ 130을 대입
		 
		 각 과목별 점수 검사를 do-while을 통해 진행하는데,
		 0 ~ 100사이의 점수가 아닌 경우에는 반드시 0 ~ 100사이의 값이 나올때까지 
		 자동으로 재실행 시킬것.
		 
		 이렇게 세 과목의 점수가 모두 0 ~ 100사이가 되면 do-while을 빠져나와
		 과목별 점수를 화면에 출력할 것!!
		 */
		
		int java = 0;
		int jsp = 0;
		int android = 0;
		
		
		do {
			java = new Random().nextInt(131);
			jsp = new Random().nextInt(131); 
			android = new Random().nextInt(131); 
			
		} while (java >100 || jsp > 100 || android > 100);
		
		System.out.println("java 점수 : " + java );
		System.out.println("jsp 점수 : " + jsp );
		System.out.println("android 점수 : " + android );
	}//main
}
