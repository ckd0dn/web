package ex1_try_catch;

import java.util.Scanner;

public class Ex2_Try_Catch {
	public static void main(String[] args) {
		//���� : 10
		//��� : 10
		
		//���� : aa
		//������ �Է��� �� �ֽ��ϴ�.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		
		try {
			int n = sc.nextInt();
			System.out.println("��� : " + n);
			
		} catch (Exception e) {
			System.out.println("������ �Է��Ͻʽÿ�");
		}
	}
}


















