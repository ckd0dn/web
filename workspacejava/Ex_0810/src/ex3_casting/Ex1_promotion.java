package ex3_casting;

public class Ex1_promotion {
	public static void main(String[] args) {
		
		//캐스팅(형변환)
		//1.프로모션 캐스팅 : 큰 자료형에 작은 자료형이 대입되는 것(자동)
		double d = 100.5; //8byte
		int n = 200; //4yte
		d = n ;
		
		System.out.println("d: " + d);
		
		char c ='A'; //2byte
		int n2 = c + 1 ; //4byte
		System.out.println("n2 : " + n2);
	}

}
