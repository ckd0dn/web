package ex5_work;

import java.util.Random;



public class Random100 {
	
	
	
	public void showRandom() {
		
		int[] ran = new int[100];//100���� �迭
		int[] num = new int[10];//0~9 �� �迭
		
		for (int i = 0; i < ran.length; i++) {
			ran[i] += new Random().nextInt(10) + 0; 
			System.out.print(ran[i]);
			
		}//for ���� �����迭 ����
		System.out.println();

		
		for (int i = 0; i < ran.length; i++) {
			
			for (int j = 0; j < num.length; j++) {
				
				if (ran[i] == j) {
					num[j]++;
				} //i���� ���� 0~9�� ��ġ�ϴ� ���ڸ�  ������ ���� num ���� 1�� ������ 
			}
			
		}//for 
		
		for (int i = 0; i < num.length; i++) {
			System.out.printf( "%d�� ���� : %d�� \n",i , num[i]);
		}// 0~ 9 �� ���� ���
	}//showRandom()
	
	
}
