package ex1_object_stream;

import java.util.Random;
import java.util.Scanner;

public class RspMain {
	public static void main(String[] args) {
		
		RspInfo info = new RspInfo();
		
		Scanner sc = new Scanner(System.in);
		String id = "";
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		System.out.print("id : ");
		id = sc.next();
		info.setId(id);
		
		//아이디를 입력받은 후 로드작업 수행!!
		try {
			
		
		ScoreLoader sl = new ScoreLoader( id );
		
		
		win = sl.getinfo().getWin();
		lose = sl.getinfo().getLose();
		draw = sl.getinfo().getDraw();
		
		info.setWin(win);
		info.setDraw(draw);
		info.setLose(lose);
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.printf("%d승, %d패, %d무\n", win, lose, draw);
		
		while(true) {
			
			int random = new Random().nextInt(3);//0~2사이의 난수
			//0:가위, 1:바위, 2:보
			
			System.out.println("가위(s) | 바위(r) | 보(p) : ");
			String user = sc.next();//s, r, p중 하나를 키보드에서 입력을 받는다!!
			
			//사용자가 받은 값을 정수로 변환
			int usercnt = 0;
			
			switch (user) {
			case "s":
				usercnt = 0;
				break;

			case "r":
				usercnt = 1;
				break;
			case "p":
				usercnt = 2;
				break;
			
				
				
			}
			
			
			
			//경우의 수 판단
			if( usercnt - random == -2 || usercnt - random == 1) {
				//유저가 이긴경우
				System.out.println("이겼습니다!");
				info.setWin(++win);
			}else if( usercnt - random == 0) {
				//비긴경우
				System.out.println("비겼습니다!");
				info.setDraw(++draw);
			}else {
				//진 경우
				System.out.println("졌습니다ㅠㅠ");
				info.setLose(++lose);
			}
			
			System.out.printf("%d승, %d패, %d무\n", info.getWin(), info.getLose(), info.getDraw());
		
			System.out.println("한판 더? y | n : ");
			String exit = sc.next();
			
			if( !exit.equalsIgnoreCase("y") ) {
				System.out.println("게임을 종료합니다");
				break;
			}
			
		}//while
		
		//게임종료 후, info객체를 통째로 저장
		new ScoreWriter( info );
	}//main
}
