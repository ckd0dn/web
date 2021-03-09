package ex1_quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz extends Thread{

	int su1, su2;
	int timer = 0;
	int playCount = 0;
	boolean isCheck = true;
	Random rnd = new Random();
	Scanner sc = new Scanner(System.in);
	
	public void startGame() {
		
		while(isCheck) {
			//문제 출제 및 정답 확인
			//5문제가 정답처리 되면 break을 통해 while문 빠져나가기
			su1 = rnd.nextInt(100) +  1;
			su2 = rnd.nextInt(100) +  1;
			
			System.out.printf("%d + %d =",su1,su2);
			
			int result = sc.nextInt();
			
			if (result == su1 + su2) {
				System.out.println("정답!");
				playCount++;
			}else {
				System.out.println("오답...");
				
			}
			
			//게임종료 판단
			if (playCount == 5) {
				System.out.println("결과 : " + timer + "초");
				isCheck = false;
			}
		}//while
	}
	//startGame()
	
	@Override 
	
	public void run() {

		while(isCheck) {
			
			try {
				
				Thread.sleep(1000);
				timer++;
				
			}catch (Exception e) {
				// TODO: handle exception
			}
			
		}//while
	}
}
