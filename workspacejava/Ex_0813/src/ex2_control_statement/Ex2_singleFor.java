package ex2_control_statement;

import java.util.Scanner;

public class Ex2_singleFor {
	public static void main(String[] args) {
		
		//��ĳ�ʸ� ���� Ű���忡�� 2 ~ 9�� �Ѱ����� �Է� �ް�
		//�Է¹��� ���ڿ� �ش�Ǵ� �������� ���
		//�� , 2 ~9������ ���ڰ� �Է������ �ʾ��� ���
		//"2 ~ 9������ ���ڸ� �Է��ϼ���" ��� ������ ���
		
		//�� : 5
		//5 * 1 = 5 
		// ....
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("�� :");
		int num = scan.nextInt();
		
		
			
		
		if(num>=2 && num<=9) {
			for (int m = 1; m <=9; m++) {
				System.out.printf("%d * %d = %d\n", num , m , num*m);
			}
		}	
		else{
		System.out.println("2 ~ 9������ ���ڸ� �Է��ϼ���");
		
		}


	
		
		
	}//main
}
