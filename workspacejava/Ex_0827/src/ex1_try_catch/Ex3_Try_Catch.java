package ex1_try_catch;

import java.util.Scanner;

public class Ex3_Try_Catch {
	public static void main(String[] args) {
		
		//���� : 10
		//��� : 10
		
		//���� : aa
		//aa��(��) ������ �ƴմϴ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		String str = "";
		
		try {
			
			str = sc.next();
			System.out.println("��� : " + Integer.parseInt(str));
			
		} catch (Exception e) {
			System.out.println(str + "��(��) ������ �ƴմϴ�");
		}
		
	}//main
}









































































