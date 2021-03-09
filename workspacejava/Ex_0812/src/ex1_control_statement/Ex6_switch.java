package ex1_control_statement;

public class Ex6_switch {
	public static void main(String[] args) {
		
		char ch = '천';
		
		switch (ch) {//비교값 - 정수 , 문자, 문자열만 가능
		case '천' :
			System.out.println("하늘 천");
			break;
			
		case '지' :
			System.out.println("땅 지");
			break;
			
		case '현' :
			System.out.println("검을 현");
			break;

		default:
			System.out.println("천,지,현 중에서만 입력하세요");
			break;
		}
	}
}
