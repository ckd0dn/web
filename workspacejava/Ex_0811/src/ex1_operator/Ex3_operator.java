package ex1_operator;

public class Ex3_operator {

	public static void main(String[] args) {
		
		//��Ʈ������
		//�������ڿ� ���������� bit����(2����)�� ���길 ����
		int a = 10;//1010
		int b = 7;//0111
		
		//����(and)
		//2������ ����� �� ���� ��� 1�϶��� ����� 1 �������� 0
		int c = a & b;
		System.out.println("���� : " + c);
		
		//����(or)
		//2������ ����� �� ���� ��� 0�� ���� ����� 0, �������� 1 
		c = a | b; 
		System.out.println("���� : " + c);
		
		//��Ÿ�� or(xor)
		//2������ ����� �� ���� ������ 0 �ٸ��� 1
		c = a ^ b;
		System.out.println("��Ÿ��or : " + c);
		System.out.println("---------------------------------");
		
		//����Ʈ ������
		//bit������ ������ �����ϵ� ����, �Ǵ� ���������� �̵����� ���� ���� ��ȭ�� �ش�
		int n1 = 12;//
		int n2 = n1 >> 2;
		System.out.println(n2);
		
		char ch ='F';//1000110
		char ch_res = (char)(ch >> 1) ;//100011 = 350
		System.out.println(ch_res);
	}
}
