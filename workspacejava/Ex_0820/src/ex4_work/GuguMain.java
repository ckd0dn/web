package ex4_work;

import java.util.Scanner;

public class GuguMain {
	public static void main(String[] args) {
		//키보드에서 출력할 단을 입력받아, 해당 단을 showTable()을 거쳐
		//화면에 출력하시오
		
		//단 : 5
		//5 * 1 = 5
		// ...
		//5 * 9 = 45
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단 :");
		int dan = sc.nextInt();
		
		Gugudan gu = new Gugudan();
		gu.showTable(dan);
		
	}
}
