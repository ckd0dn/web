package ex1_string;

import java.util.Scanner;

public class Ex4_StringWork {
	public static void main(String[] args) {
		
		//�ֹι�ȣ �Ǵ� ���� �����ϱ�
		
		//�ֹι�ȣ�� �Է��ϼ��� (-����)
		//>> 991203-1122334
		//����� 99�� 12�� 03�Ͽ� �¾ �����Դϴ�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ֹι�ȣ�� �Է��ϼ��� (-����)");
		System.out.print(">>");
		String number = sc.next();
		
		String year = number.substring(0,2);
		String month = number.substring(2,4);
		String day = number.substring(4,6);
		String gender = "";
		
		
		if (number.charAt(7) == '1' || number.charAt(7) == '3') {
			gender = "����";
		}else if (number.charAt(7) == '2' || number.charAt(7) == '4') {
			gender = "����";			
		}
		
		System.out.println("����� " + year + "�� " + month + "�� " + day + "�Ͽ� �¾ " + gender + "�Դϴ�");
		
		
	}//main
}
