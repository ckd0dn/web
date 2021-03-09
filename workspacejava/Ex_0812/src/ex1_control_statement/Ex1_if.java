package ex1_control_statement;

public class Ex1_if {
	
	public static void main(String[] args) {
		
		//제어문 : 프로그램의 흐름을 제어하는 문장
		//분기문과 반복문으로 나뉜다.
		//분기문 : if, switch
		//반복문 : for,while
		
		//단순if문
		//if(조건식){
		//조건식이 참일 때 실행되는 영역
		//}
		
		int n = 51;
		
		//String은 쌍 따옴표 안에 여러글자(문자열)을 저장할 수 있는 자료형
		String str = "";
		System.out.println(str);
		
		if(n==50) {
			//조건이 참인경우 아래의 코드를 실행한다.
			str = "n은 50입니다.";
			
		}
		
		
		if(n!=50) {
			str = "n은 50이 아닙니다";
		}
		System.out.println(str);
	}//main

}
