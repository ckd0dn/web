package ex3_work;

public class Ex1_Work {
	
	public static void main(String[] args) {
		
		/*
		 �������� �ִ�.
		 ��, ���, �������� Ű����ִµ�, �Ϸ� ���귮�� ���� 
		 5, 7, 5����.
		 
		  ���������� �Ϸ翡 ����Ǵ� ������ �� ������ ����ϰ�, �ð���
		  ��ü ������ ��� ���� ������ ���
		  
		  ��, ������ ������ �Ϸ� ���귮�� ������ ������ intŸ������,
		  ��� ���귮�� ������ ������ floatŸ������ �����ϵ��� �Ѵ�)
		  */
		 
		int pear = 5;
		int apple = 7;
		int orange = 5;
		int sum = pear + apple + orange;
		float avg = (float)sum/24f;
		
		System.out.println(" ���������� �Ϸ翡 ����Ǵ� ������ �� ���� : " + sum + "��");
		System.out.println("�ð��� ��ü ������ ��� ���� ������ ��� :" + avg + "��");
		
		System.out.printf(" ���������� �Ϸ翡 ����Ǵ� ������ �� ���� : %d��\n", sum);
		System.out.printf("�ð��� ��ü ������ ��� ���� ������ ��� : %.4f��\n:", avg);
		
	}
}
