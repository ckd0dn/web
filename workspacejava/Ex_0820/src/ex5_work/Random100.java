package ex5_work;

import java.util.Random;



public class Random100 {
	
	
	
	public void showRandom() {
		
		int[] ran = new int[100];//100난수 배열
		int[] num = new int[10];//0~9 비교 배열
		
		for (int i = 0; i < ran.length; i++) {
			ran[i] += new Random().nextInt(10) + 0; 
			System.out.print(ran[i]);
			
		}//for 랜덤 난수배열 생성
		System.out.println();

		
		for (int i = 0; i < ran.length; i++) {
			
			for (int j = 0; j < num.length; j++) {
				
				if (ran[i] == j) {
					num[j]++;
				} //i번재 열에 0~9에 일치하는 숫자를  만날때 마다 num 열에 1씩 더해줌 
			}
			
		}//for 
		
		for (int i = 0; i < num.length; i++) {
			System.out.printf( "%d의 개수 : %d개 \n",i , num[i]);
		}// 0~ 9 의 개수 출력
	}//showRandom()
	
	
}
