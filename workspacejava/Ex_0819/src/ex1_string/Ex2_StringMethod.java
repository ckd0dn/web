package ex1_string;

import java.util.Scanner;

public class Ex2_StringMethod {
	public static void main(String[] args) {
		//��Ʈ�� Ŭ������ �޼����
		//�޼���� ��� �۾��� �����ϱ� ���� ��ɹ����� ����!!
		//�ݺ������� ���Ǵ� �ڵ带 ���̱� ���� ���ߵǾ���. 
		
		String str = "Hong Gil Dong"; 
		int len = str.length();
		System.out.println("Str�� ���� : " + str.length());
		
		int index = str.indexOf('o');
		System.out.println("�� ó�� ���� o�� ��ġ : " + index);
		
		index = str.lastIndexOf('o');
		System.out.println("������ ���� o�� ��ġ : " + index);
		
		index = str.indexOf("Gil");
		System.out.println("Gil�� ������ġ : " + index);
		
		char res = str.charAt(6);
		System.out.println("6��° ��ġ�� ���� : "  + res);
		
		String res2 = str.substring(2, 7); //2���� 6���� 
		System.out.println("�����س� ���� :" + res2);
		
		String name1 = "apple";
		String name2 = "Apple";
		
		if (name1.equals(name2)) {
			System.out.println("�� ������ ���� �����ϴ�.");
		}else {
			System.out.println("�� ������ ���� �ٸ��ϴ�");
		}
		//���� �񱳽� ��ҹ��ڸ� �����ϴ� �޼���
		if (name1.equalsIgnoreCase(name2)) {
			System.out.println(name1 + "��" + name2 + " �� �����ܾ��Դϴ�.");
			
		}
		
		String id = " system";
		String id2 = id.trim();//���� �յ��� �ǹ̾��� ������ ����
		if (id.equals("system")) {
			System.out.println("�����ڷ� �α���");
		}
		
		//��Ʈ���� �޼���� �ƴ����� ���־��־��־��־��� ���� ����ϴ� �޼���
		//���ڿ��� �ۼ��� ���������� �����͸� ���� ���ڷ� �ٲ��ִ� �޼���
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����  :");
		String number = sc.next();
		
		int number2 = Integer.parseInt(number);
		
		System.out.println(number2 + 1 );
		
		String f = "3.14";
		float ff = Float.parseFloat(f);
		System.out.println(ff+1);
		//wrapper Ŭ����
		//int -> Integer
		//char -> Character
		//byte -> Byte
		//boolean -> Boolean
		//short -> Short
		//long -> Long
		//float -> Float
		//double -> Double
	}//main
}
