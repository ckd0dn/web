package ex3_control_statemnet;

public class Ex1_multiFor {

	public static void main(String[] args) {
		
		//���� for�� : for�� �ȿ� for���� ���ԵǾ� �ִ� ���
		//1 2 3 
		//1 2 3
		
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <=5 ; j++) {
				
				System.out.print(j + " ");
			}//inner
			System.out.println(); //�ٹٲ�
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
			System.out.println(); //�ٹٲ�
		}//outer
		
	}//main
}
