package ex4_array;

public class Ex2_single_array {
	public static void main(String[] args) {
		
		char[] ch = new char[4];
		ch[0] = 'A';
		ch[1] = 'B';
		ch[2] = 'C';
		ch[3] = 'D';
		
		for(int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
		System.out.println();
		
		//ch배열의 값을 개선된  for문을 사용하여 출력
		for(char c : ch) {
			System.out.println(c);
		}
		System.out.println("--------------------------");
		
		//배열의 선언, 생성, 초기화를 한번에
		String[] str = {"hong", "kim", "lee", "park"};
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i] );
		}
		
		System.out.println("--------------------------------");
		
		//개선된 for문
		for(String s : str) {
			//배열의 각 index에 대한 접근이 불가능 
			System.out.println(s);
		}
	}//main
}
