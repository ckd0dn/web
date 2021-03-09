package ex3_control_statemnet;

public class Ex1_multiFor {

	public static void main(String[] args) {
		
		//다중 for문 : for문 안에 for문이 포함되어 있는 경우
		//1 2 3 
		//1 2 3
		
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <=5 ; j++) {
				
				System.out.print(j + " ");
			}//inner
			System.out.println(); //줄바꿈
		}//outer
		
		System.out.println("--------------------------------------");
		
		//A B C D 
		//E F G H
		//I J K L
		
		char alpabet = 'A';
		
		for (int i = 1; i <= 3; i++) {
			
			for (int j = 1; j <=4 ; j++) {
			
				System.out.print(alpabet);
				alpabet+=1;
				
			}//inner
			System.out.println(); //줄바꿈
		}//outer
		
	}//main
}
