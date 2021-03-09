package ex1_first;

public class Ex1_sysout {
	//주석 : 컴파일시 JVM은 인식하지 못하는 개발자들간의 메모를 위한 장치
	
	//main()메서드 : 컴파일시 가장 먼저 호출되는 영역
	public static void main(String[] args) {
		System.out.println(100);
		System.out.println("홍길동 hello");
		
		// ""뒤의 +기호는 문장을 연결하는 역할
		System.out.println("100"+100+10);
		System.out.println("10 + 10 = " + (10 + 10));
		
		System.out.println(10 + 1 + "안녕" + 1 + 1 );
	}
}
