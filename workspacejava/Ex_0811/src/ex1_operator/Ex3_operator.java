package ex1_operator;

public class Ex3_operator {

	public static void main(String[] args) {
		
		//비트연산자
		//논리연산자와 유사하지만 bit단위(2진수)의 연산만 가능
		int a = 10;//1010
		int b = 7;//0111
		
		//논리곱(and)
		//2진수로 변경시 두 값이 모두 1일때만 결과가 1 나머지는 0
		int c = a & b;
		System.out.println("논리곱 : " + c);
		
		//논리합(or)
		//2진수로 변경시 두 값이 모두 0일 때만 결과가 0, 나머지는 1 
		c = a | b; 
		System.out.println("논리합 : " + c);
		
		//배타적 or(xor)
		//2진수로 변경시 두 값이 같으면 0 다르면 1
		c = a ^ b;
		System.out.println("배타적or : " + c);
		System.out.println("---------------------------------");
		
		//시프트 연산자
		//bit단위의 연산을 수행하되 왼쪽, 또는 오른쪽으로 이동시켜 값에 대한 변화를 준다
		int n1 = 12;//
		int n2 = n1 >> 2;
		System.out.println(n2);
		
		char ch ='F';//1000110
		char ch_res = (char)(ch >> 1) ;//100011 = 350
		System.out.println(ch_res);
	}
}
