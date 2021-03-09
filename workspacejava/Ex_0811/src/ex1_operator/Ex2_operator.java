package ex1_operator;

public class Ex2_operator {
	
	public static void main(String[] args) {
		
		//비교연산자
		//비교연산자는 변수나 상수의 값을 비교하여 참과 거짓을 판단하는 연산자
		
		int n1 = 10;
		int n2 = 20;
		boolean result = n1 < n2;
		
		System.out.println("n1 < n2 : " + result);
		
		result = n1 >= n2;
		System.out.println("n1 >= n2 : " + result);
		
		result = n1 == n2;
		System.out.println("n1 == n2 : " + result);
		
		result = n1 != n2;
		System.out.println("n1 != n2 : " + result);
		
		System.out.println("---------------------------------");
		
		//논리연산자 
		//비교연산자를 통한 연산이 두 개 이상 필요할 때 사용
		int age = 21;
		int limit = 25;
		
		
		//&&(and)연산자 : 앞쪽 연산이 false라면 뒤쪽 연산은 수행하지 않는다!!
		
		//true && true -> true
		//true && false -> false
		//false && true -> false
		//false && false -> false
		boolean res = limit - age >= 5 && (age += 2) > 20;
		System.out.println(age);
		System.out.println(res);
		System.out.println("---------------------------------");
		
		int i1 = 10;
		int i2 = 20;
		
		//||(or)연산자 :앞쪽 연산이 true라면 뒤쪽 연산은 수행하지 않는다!!
		//true || true -> true
		//true || false -> true
		//false || true -> true
		//false || false -> false
		
		res = (i1 += 10) > 20 || i2 - 10 == 11; 
		System.out.println(res);
		System.out.println("---------------------------------");
		
		//!(not)연산자 : boolean변수 앞쪽에 기술하며,
		//참은 거짓으로, 거짓은 참으로 값을 일시적으로 변경해준다.
		System.out.println(!res);
		System.out.println(res);
		res = !res;//영구적으로 값을 바꾸려면 이렇게
		
 	}
	
}
