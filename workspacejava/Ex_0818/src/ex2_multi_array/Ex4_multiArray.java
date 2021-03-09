package ex2_multi_array;

public class Ex4_multiArray {
	public static void main(String[] args) {
		
		//2차원 뱌열 arr에 담긴 모든 값의 합과 평균을 화면에 출력하시오.
		
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
		
		System.out.println("합 : " + sum);
		System.out.println("평균 : " + avg);
	}//main
}
