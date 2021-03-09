package ex4_array;

public class Ex3_single_array {
	public static void main(String[] args) {
		
		//배열 arr에 담긴 모든 값의 합을 출력
		int[] arr= {15, 22, 17, 30, 50};
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			sum += arr[i];
			
		}
		System.out.println("합 : " + sum);
		
		sum = 0;
		
		for(int a : arr) {
			sum += a;
		}
		
		System.out.println("합 : " + sum);
	}//main
}
