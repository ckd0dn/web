package ex2_printf;

public class Ex1_printf {
	public static void main(String[] args) {
		
		int age = 21;
		System.out.println("�� ���̴� " + age + "�� �Դϴ�");
		System.out.printf("�� ���̴� %d�� �Դϴ�\n", age);
		
		int year = 2000;
		int month = 10;
		int day = 9;
		//2000-10-9
		//2000/10/9
		//2000_10_9
		System.out.printf("%d-%d-%d\n",year,month,day);
		
		char bt = 'A';
		float co = 36.5f;
		//���� 21�� A�� �Դϴ�
		System.out.printf("���� %d�� %c�� �Դϴ�. ü���� %f�� �Դϴ�.\n" , age, bt, co);
		
		//printf�� ���� Ÿ��
		//%d : ����
		//%c : ����
		//%f : �Ǽ�
		System.out.printf("%d-%02d-%03d\n",9,9,9);
		
		System.out.printf("%f, %.2f\n",co,co);
	}
}
