package ex1_string;

import java.util.Scanner;

public class Ex5_StringWork {
	public static void main(String[] args) {
		
		//Ű���忡�� .next()�� ���� �ް�
		//ȸ����(������ �о �ڷ� �о �Ȱ��� ������ ����) ���ϱ�
		
		//�Է� : a1b1a
		//a1b1a��(��) ȸ���� �Դϴ�
		
		//�Է� : aabb
		//aabb��(��) ȸ������ �ƴմϴ�
		
		// �յڷ� ���ϴ� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է� : ");
		String su = sc.next();
		
		int n = su.length();
		
		for (int i = 0; i < su.length(); i++) {
			
			if (su.charAt(i) == su.charAt(n-1)) {
				n--;
				
			}else if (i == su.length()/2) {
				System.out.println(su + "��(��) ȸ���� �Դϴ�");
			}else {
				System.out.println(su + "��(��) ȸ������ �ƴմϴ�");
			}
			
		}//for
		
		
		//��°�� ����� ���ϴ� ���
		
		System.out.println("�Է� : ");
		
		String ori = sc.next();
		String rev  = "";
		
		for (int i = ori.length()-1; i >= 0; i--) {
			
			rev += ori.charAt(i);
		
		}//for
		
		if (ori.equals(rev)) {
			System.out.println(ori + "��(��) ȸ���� �Դϴ�");
			
		}else {
			System.out.println(ori + "��(��) ȸ������ �ƴմϴ�");
		}
	}//main
}	
