package ex1_string;

public class Ex1_String {
	public static void main(String[] args) {
		
		//String은 두 가지 특징이 있다.
		//1) 객체 생성법이 두가지다( 암시적 , 명시적)
		//2) 한 번 생성된 문자열의 내용은 변하지 않는다(불변적 특징)
		
		//암시적 객체생성
		//기존에 생성된 값과 같은 데이터를 갖고자 하는 객체간 주소를 공유하는 방식
		String s1 = "abc";
		String s2= "abc";
		
		//명시적 객체생성
		//기존 heap 메모리에 추가되어있는 데이터와는 상관없이
		//무조건 새로운 영역을 생성하는 방식
		String s3 = new String("abc"); 
		
		//==연산자는 객체간 비교에서는 값이 아닌 주소를 비교한다.
		if (s1 == s3) {
			System.out.println("주소가 같습니다.");			
		}
		else {
			System.out.println("주소가 다릅니다.");
		}
		//String클래스는 일반적으로 주소비교가 아닌 값 비교를 하는 경우가
		//대부분 이므로, == 대신 equals()라는 기능을 사용+한다
		if (s1.contentEquals(s3)) {
			System.out.println("s1과 s3의 값이 같습니다.");
		}
	
		System.out.println("------------------------------------");
		
		String greet = "안녕";
		greet += "하세요";
		System.out.println(greet);
	}//main
}