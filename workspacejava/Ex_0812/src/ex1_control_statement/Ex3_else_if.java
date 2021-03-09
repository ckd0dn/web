package ex1_control_statement;

public class Ex3_else_if {
	public static void main(String[] args) {
		
		//다중if문(else if ) : 여러개의 조건비교가 필요한 경우 사용하는 제어문 
		
		int num = 40;
		String str = "";
		
		if(num >= 90) {
			str ="A";
		}
		else if(num>=80){
			str ="B";
		}
		else if(num>=70){
			str ="C";
		}
		else if(num>=60){
			str ="D";
		}
		else {
			//위쪽의 모든 조건이 거짓일 때 무조건 실행되는 영역
			str ="F";
		}
		System.out.println(str);
	}//MAIN
}
