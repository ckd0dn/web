package ex4_array;

public class Ex1_single_array {
	public static void main(String[] args) {
		
		//배열 : '같은 자료형 끼리 모아두는 하나의 묶음'
		//효율적인 자료관리를 위해 반드시 필요한 개념
		
		int su1 = 100;
		int su2 = 200;
		int su3 = 300;
		int su4 = 400;
		
		//1) 배열 선언
		int[] su;
		
		//2) 배열 생성
		su = new int[4];
		
		//** 배열의 선언과 생성을 한번에
		//int[] su = new int[4];
		
		//3) 배열의 초기화(배열의 각 index에 값을 넣어주는 작업)
		su[0] = 10;
		su[1] = 20;
		su[2] = 30;
		su[3] = 40;
		for (int i = 0; i < su.length; i++) {
			
			System.out.println(su[i]);
		}//for
		
		
	}//main
}
