package ex1_control_statement;

public class Ex2_if_else {
	
	public static void main(String[] args) {
		
		//if-else문 : 하나의 조건을 가지고 두가지의 결과를 얻어내기 위한 if문
		
		//if(조건식){
		//조건식이 참일 때 실행되는 영역
		//}else{
		//조건식이 거짓일 때 실행되는 영역
		//}
		int n =49;
		String str = "";
		
		if( ++n >= 50) {
			str = "50이상의 수";
		}else {
			str = "50미만의 수";
		}
		
		System.out.println(str);
		
		System.out.println("----------------------------");
		
		//변수 age에 나이를 대입하고, 30세 이상이면 "드실만큼 드셨군요"를,
		//그렇지 않으면 "조금 기다리셔야 겠네요"를 출력하는 if문을 만드시오
		
		int age = 25;
		String a = "";
		
		if( age >= 30) {
			a = "드실만큼 드셨군요";
		}else {
			a = "조금 기다리셔야 겠네요";
		}
		
		System.out.println(a);                         
		System.out.println("----------------------------");
		
		//바로 위의 나이코드를 삼항 연산자로 바꾸시오
		
		a = age >= 30 ? "드실만큼 드셨군요" : "조금 기다리셔야 겠네요";
		System.out.println(a);
	}
}
