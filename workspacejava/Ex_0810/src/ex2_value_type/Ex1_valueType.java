package ex2_value_type;

public class Ex1_valueType {

	
	public static void main(String[] args) {
		
		/*
		 �ڷ���(�⺻�ڷ���)
		 
		 ���� : boolean - 1bit
		 ������ : char - 2byte
		 ������ : byte - 1byte .......... -128 ~ 127
		       short - 2byte .......... -32768 ~ 32767
		       int - 4byte .......... -21�� ~ 21��
		       long - 8byte .......... -900�� ~ 900��
		 �Ǽ��� : float - 4byte 
		       double - 8byte
		 */
		
		//���� : Ư�� ���� �����Ͽ� �����ϱ� ���� �׸������� Ű����
		
		//���� ���� ��Ģ
		//�ڷ��� ������;(����) -> int a;
		//������ = ��;(����) -> a = 21000;
		//�ڷ��� ������ = ��;(�ʱ�ȭ) -> int a = 21000;
		
		//�������� �빮�ڳ� ���ڷ� �������� �ʴ´�
		//_�� �����ϰ�� Ư�����ڸ� ����� �� ����.
		//�ѱ۷� �������� ���� ����
		
		//-----------------------------------------------------
		
		//���� : true, false��, ��ǰ� ������ �� ���� ������ ������ �� �ִ�
		boolean b = true;
		System.out.println("b:" + b);
		
		 b = false;
		System.out.println("b:" + b);

		System.out.println("----------------------------" );
		
		//������ : Ȭ����ǥ �ȿ� �ѱ��ڸ� ���� ������ �ڷ���
		char c = 'A'; 
		System.out.println("c:" + c);
		
		 c = 'B'; 
		System.out.println("c:" + c);
		
		c = 65 + 2; // �ƽ�Ű �ڵ尪
		System.out.println("c : " + c);
		
		System.out.println("----------------------------" );
		
		//������
		//byte by = 128; ---> byte�� ǥ�������� 127�� �Ѿ�� �����߻�
		int n = 2100000000;
		long lo = 2200000000L;
		
		System.out.println("lo : " + lo);
		
		System.out.println("----------------------------" );
		
		//�Ǽ��� : �Ҽ����� �����ϴ� ���ڰ��� ������� �ڷ���
		float f = 3.14f;
		double d = 3.14;
	}//main()
}
