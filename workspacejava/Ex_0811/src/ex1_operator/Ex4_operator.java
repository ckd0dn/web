package ex1_operator;

public class Ex4_operator {
	
	public static void main(String[] args) {
		
		//���� ������
		//1�� ������Ű�ų� 1�� ���ҽ�Ű�� ������
		//���������� ���������� �������� �˾Ƶ���!!
		int a = 10;
		int b = 10;
		
		System.out.println("a : " + ++a);
		System.out.println("b : " + b++);
		System.out.println(b);
		
		++b;
		++b;
		b--;
		b++;
		--b;
		b++;
		b++;
		System.out.println(--b);
		System.out.println("---------------------------------");
		
		//���� ������
		//�ϳ��� ������ �����ϰ� �� ������ ���϶��� �����϶��� ����� �ٸ��� ��ȯ�ϴ� ������
		int i1 = 10;
		int i2 = 15;
		boolean res = ++i1 >= i2 ? true : false; //���̸� ���� �����̸� ������ ��ȯ
		System.out.println(res);
		
		int i3 = ++i1 >= i2 ? 1 : 2;
		System.out.println(i3);
		
		char i4 = ++i1 >= 12 ? '��' : '��';
		System.out.println(i4);
		System.out.println("---------------------------------");
		
		a = 10;
		b = 12;
		
		char h = ++a >= b || 2 + 7 <= b && 13 - b >= 0 && (a+=b) - (a%b) > 10 ? 'O' : 'X';
		System.out.println(h);
	}
}

