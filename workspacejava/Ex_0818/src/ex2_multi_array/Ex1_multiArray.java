package ex2_multi_array;

public class Ex1_multiArray {
	public static void main(String[] args) {
	
		//������ �迭
		//1���� �迭�� 2�� ���̸� 2���� �迭
		//1���� �迭�� 3�� ���̸� 3���� �迭�̴�
		int[][] test = new int[2][3];
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
		
		test[1][0] = 400;
		test[1][1] = 500;
		test[1][2] = 600;
		
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				System.out.print(test[i][j] + " ");
			}//inner
		}//outer
	}//main
}







































