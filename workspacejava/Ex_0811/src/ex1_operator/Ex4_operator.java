package ex1_operator;

public class Ex4_operator {
	
	public static void main(String[] args) {
		
		//증감 연산자
		//1씩 증가시키거나 1씩 감소시키는 연산자
		//선행증감과 후행증감의 차이점을 알아두자!!
		int a = 10;
		int b = 10;
		
		System.out.println("a : " + ++a);
		System.out.println("b : " + b++);
		System.out.println(b);
		
		++b;
		++b;
		b--;
		b++;
		--b;
		b++;
		b++;
		System.out.println(--b);
		System.out.println("---------------------------------");
		
		//삼항 연산자
		//하나의 조건을 제시하고 그 조건이 참일때와 거짓일때의 결과를 다르게 반환하는 연산자
		int i1 = 10;
		int i2 = 15;
		boolean res = ++i1 >= i2 ? true : false; //참이면 왼쪽 거짓이면 오른쪽 반환
		System.out.println(res);
		
		int i3 = ++i1 >= i2 ? 1 : 2;
		System.out.println(i3);
		
		char i4 = ++i1 >= 12 ? '합' : '불';
		System.out.println(i4);
		System.out.println("---------------------------------");
		
		a = 10;
		b = 12;
		
		char h = ++a >= b || 2 + 7 <= b && 13 - b >= 0 && (a+=b) - (a%b) > 10 ? 'O' : 'X';
		System.out.println(h);
	}
}

