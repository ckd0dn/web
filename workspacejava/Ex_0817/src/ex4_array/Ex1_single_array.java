package ex4_array;

public class Ex1_single_array {
	public static void main(String[] args) {
		
		//�迭 : '���� �ڷ��� ���� ��Ƶδ� �ϳ��� ����'
		//ȿ������ �ڷ������ ���� �ݵ�� �ʿ��� ����
		
		int su1 = 100;
		int su2 = 200;
		int su3 = 300;
		int su4 = 400;
		
		//1) �迭 ����
		int[] su;
		
		//2) �迭 ����
		su = new int[4];
		
		//** �迭�� ����� ������ �ѹ���
		//int[] su = new int[4];
		
		//3) �迭�� �ʱ�ȭ(�迭�� �� index�� ���� �־��ִ� �۾�)
		su[0] = 10;
		su[1] = 20;
		su[2] = 30;
		su[3] = 40;
		for (int i = 0; i < su.length; i++) {
			
			System.out.println(su[i]);
		}//for
		
		
	}//main
}
