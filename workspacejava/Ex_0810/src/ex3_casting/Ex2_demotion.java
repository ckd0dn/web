package ex3_casting;

public class Ex2_demotion {
	
	public static void main(String[] args) {
		
		//2.디모션 캐스팅
		//작은 자료형에 큰 자료형을 대입하는 것(자동으로 이뤄지지x)
		char c ='A';//2byte
		int n = c + 1;//4byte
		c = (char)n;
		System.out.println("c :" +  c );
		
		//system.out.println 단축기 syso ctrl space
		
		System.out.println("---------------------------------");
		
		float f = 5.5f;
		int num = 0;
		num = (int)f;
		
		System.out.println("num : " + num);
	}

}
