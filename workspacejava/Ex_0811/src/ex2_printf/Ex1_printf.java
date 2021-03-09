package ex2_printf;

public class Ex1_printf {
	public static void main(String[] args) {
		
		int age = 21;
		System.out.println("제 나이는 " + age + "세 입니다");
		System.out.printf("제 나이는 %d세 입니다\n", age);
		
		int year = 2000;
		int month = 10;
		int day = 9;
		//2000-10-9
		//2000/10/9
		//2000_10_9
		System.out.printf("%d-%d-%d\n",year,month,day);
		
		char bt = 'A';
		float co = 36.5f;
		//저는 21세 A형 입니다
		System.out.printf("저는 %d세 %c형 입니다. 체온은 %f도 입니다.\n" , age, bt, co);
		
		//printf의 포멧 타입
		//%d : 정수
		//%c : 문자
		//%f : 실수
		System.out.printf("%d-%02d-%03d\n",9,9,9);
		
		System.out.printf("%f, %.2f\n",co,co);
	}
}
