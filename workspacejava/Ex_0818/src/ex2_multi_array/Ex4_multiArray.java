package ex2_multi_array;

public class Ex4_multiArray {
	public static void main(String[] args) {
		
		//2���� �� arr�� ��� ��� ���� �հ� ����� ȭ�鿡 ����Ͻÿ�.
		
		int[][] arr = { {4,14, 6, 72,4} , {63, 24,1,45, 3} ,{52,15,6,7,4,24} };
		
		int sum = 0;
		float avg = 0;
		int len = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				sum += arr[i][j];
				len++;
			}//inner
			
		}//outer
		
		
		avg = (float)sum/len; 
		
		System.out.println("�� : " + sum);
		System.out.println("��� : " + avg);
	}//main
}
