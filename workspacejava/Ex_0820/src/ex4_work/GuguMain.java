package ex4_work;

import java.util.Scanner;

public class GuguMain {
	public static void main(String[] args) {
		//Ű���忡�� ����� ���� �Է¹޾�, �ش� ���� showTable()�� ����
		//ȭ�鿡 ����Ͻÿ�
		
		//�� : 5
		//5 * 1 = 5
		// ...
		//5 * 9 = 45
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� :");
		int dan = sc.nextInt();
		
		Gugudan gu = new Gugudan();
		gu.showTable(dan);
		
	}
}
