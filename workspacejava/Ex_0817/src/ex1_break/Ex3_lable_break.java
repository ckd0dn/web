package ex1_break;

public class Ex3_lable_break {
	public static void main(String[] args) {
		
		//label : Ư�� �ݺ����� �̸�ǥ�� �ٿ� �ѹ��� �� �� �̻��� �ݺ�����
		//���� �� �� �ֵ��� �ϴ� Ű����

		out : for(int i = 1; i <= 3; i++ ) {
			
			for (int j = 1; j <= 5; j++) {
				
				if ( j % 3 == 0) {
					break out;
				}
				
				System.out.print(j + " ");
			}//inner
			
			System.out.println();
		}//outer
		
	}//main
}