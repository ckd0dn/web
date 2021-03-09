package ex3_method;

public class MethodMain {
	public static void main(String[] args) {
		
		ValueTest v1 = new ValueTest();
		int su = 100;
		su = v1.test1(su);
		System.out.println("su :" + su);
		
		String name = "홍길동";
		int age = 21;
		String res = v1.test2(age);
		System.out.printf("%s님은 %s 입니다\n", name, res);
		
		System.out.println("--미스코리아 조건---");
		boolean result = v1.test3("남", 21);
		
		if (result == true) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	}//main
}

