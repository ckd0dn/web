package ex3_casting;

public class Ex1_promotion {
	public static void main(String[] args) {
		
		//ĳ����(����ȯ)
		//1.���θ�� ĳ���� : ū �ڷ����� ���� �ڷ����� ���ԵǴ� ��(�ڵ�)
		double d = 100.5; //8byte
		int n = 200; //4yte
		d = n ;
		
		System.out.println("d: " + d);
		
		char c ='A'; //2byte
		int n2 = c + 1 ; //4byte
		System.out.println("n2 : " + n2);
	}

}
