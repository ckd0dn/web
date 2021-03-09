package ex2_control_statement;

public class Ex1_singleFor {
	public static void main(String[] args) {
		
		//반복문 : 특정 문장을 여러번 반복할 수 있도록 해주는 제어문
		
		//for( 초기식; 조건식; 증감식){
		//조건식이 참일 때 실행 되는 영역
		//}
		
		//1부터 3까지 자동으로 반복하는 for문 만들기
		for(float i=1; i<100; i+=4.5f ) {
			
			System.out.println(i);
			
		}//for
		
		System.out.println("-----------------------------------------");
		//10부터 1까지 감소하는 값을 출력하는 for문 생성
		for(int j=10; j>=1 ; j-- ) {
			
			System.out.println(j);
		
		}
		
		System.out.println("-----------------------------------------");
		
		for (int i = 0; i < 5; ) {
			
			System.out.println(i);
			i++;
		}
		
		System.out.println("-----------------------------------------");
		
		//1부터 100까지 반복하는 for문을 만들고 3의 배수만 화면에 출력! 
		
		for (int i = 1; i <= 100; i++) {
			
			if(i % 3 == 0) {
			System.out.println(i); 
			}
		}
		
		
	}//main
}
