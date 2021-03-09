package ex2_value_type;

public class Ex1_valueType {

	
	public static void main(String[] args) {
		
		/*
		 자료형(기본자료형)
		 
		 논리형 : boolean - 1bit
		 문자형 : char - 2byte
		 정수형 : byte - 1byte .......... -128 ~ 127
		       short - 2byte .......... -32768 ~ 32767
		       int - 4byte .......... -21억 ~ 21억
		       long - 8byte .......... -900경 ~ 900경
		 실수형 : float - 4byte 
		       double - 8byte
		 */
		
		//변수 : 특정 값을 대입하여 저장하기 위한 그릇개념의 키워드
		
		//변수 선언 규칙
		//자료형 변수명;(선언) -> int a;
		//변수명 = 값;(대입) -> a = 21000;
		//자료형 변수명 = 값;(초기화) -> int a = 21000;
		
		//변수명은 대문자나 숫자로 시작하지 않는다
		//_를 제외하고는 특수문자를 사용할 수 없다.
		//한글로 변수명을 짓지 말자
		
		//-----------------------------------------------------
		
		//논리형 : true, false즉, 사실과 거짓의 두 가지 값만을 저장할 수 있다
		boolean b = true;
		System.out.println("b:" + b);
		
		 b = false;
		System.out.println("b:" + b);

		System.out.println("----------------------------" );
		
		//문자형 : 홑따옴표 안에 한글자만 저장 가능한 자료형
		char c = 'A'; 
		System.out.println("c:" + c);
		
		 c = 'B'; 
		System.out.println("c:" + c);
		
		c = 65 + 2; // 아스키 코드값
		System.out.println("c : " + c);
		
		System.out.println("----------------------------" );
		
		//정수형
		//byte by = 128; ---> byte의 표현범위인 127을 넘어가면 오류발생
		int n = 2100000000;
		long lo = 2200000000L;
		
		System.out.println("lo : " + lo);
		
		System.out.println("----------------------------" );
		
		//실수형 : 소수점을 포함하는 숫자값을 담기위한 자료형
		float f = 3.14f;
		double d = 3.14;
	}//main()
}
