package ex1_string;

public class Ex1_String {
	public static void main(String[] args) {
		
		//String�� �� ���� Ư¡�� �ִ�.
		//1) ��ü �������� �ΰ�����( �Ͻ��� , �����)
		//2) �� �� ������ ���ڿ��� ������ ������ �ʴ´�(�Һ��� Ư¡)
		
		//�Ͻ��� ��ü����
		//������ ������ ���� ���� �����͸� ������ �ϴ� ��ü�� �ּҸ� �����ϴ� ���
		String s1 = "abc";
		String s2= "abc";
		
		//����� ��ü����
		//���� heap �޸𸮿� �߰��Ǿ��ִ� �����Ϳʹ� �������
		//������ ���ο� ������ �����ϴ� ���
		String s3 = new String("abc"); 
		
		//==�����ڴ� ��ü�� �񱳿����� ���� �ƴ� �ּҸ� ���Ѵ�.
		if (s1 == s3) {
			System.out.println("�ּҰ� �����ϴ�.");			
		}
		else {
			System.out.println("�ּҰ� �ٸ��ϴ�.");
		}
		//StringŬ������ �Ϲ������� �ּҺ񱳰� �ƴ� �� �񱳸� �ϴ� ��찡
		//��κ� �̹Ƿ�, == ��� equals()��� ����� ���+�Ѵ�
		if (s1.contentEquals(s3)) {
			System.out.println("s1�� s3�� ���� �����ϴ�.");
		}
	
		System.out.println("------------------------------------");
		
		String greet = "�ȳ�";
		greet += "�ϼ���";
		System.out.println(greet);
	}//main
}