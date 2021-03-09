package ex1_control_statement;

public class Ex4_switch {
	public static void main(String[] args) {
		
		//switch - case문 : 비교값과 조건값을 통해 결과를 실행하는 제어문
		//switch(비교값){
		//case 조건값 :
		// 비교값과 조건값이 일치하는 경우 실행되는 영역
		// break;
		//}
		int n = 2;
		switch(n ) {//비교값
		case 1: //조건값
			System.out.println("게임시작");
			break;
			
		case 2: 
			System.out.println("게임소개");
			break;
			
		case 3: 
			System.out.println("게임종료");
			break;
			
		default:
			//비교값과 조건값이 한개도 일치하지 않을 때 반드시 실행되는 영역
			System.out.println("잘못된 메뉴");
			break;
		}//switch
		
	}//main
}
