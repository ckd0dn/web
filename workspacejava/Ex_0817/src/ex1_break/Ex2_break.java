package ex1_break;

public class Ex2_break {
	public static void main(String[] args) {

		int n = 1;

		while( true) {

			System.out.println(n);
			n++;

			if(n > 5) {
				break;
			}
		}//while
		
		System.out.println("-----------------------------");
		
		n = 1 ;
		
		while(n < 10) {
			System.out.println(n);
			
			switch (n) {
			
			case 1:
				System.out.println("���� ");
				//break��� �ϴ��� switch������ ���� break���� 
				//������ �ݺ����� �ƴ� witch������ ���� ������!!!
				break;
			case 2:
				System.out.println("��� ");
				break;
			
			}//switch
			n++;
		}
	}//main
}
