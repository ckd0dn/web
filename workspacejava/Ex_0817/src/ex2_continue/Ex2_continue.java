package ex2_continue;

public class Ex2_continue {
	public static void main(String[] args) {
		
		int n = 0;
		
		while(n < 10){
			n++;
			
			if ( n % 3 == 0) {
				//while�� �ȿ����� continue�� 
				//���� ����� while���� ���ǽ����� �̵��Ѵ�
				continue;
			}
			System.out.println(n);
			
			                    
		}//while
		
		System.out.println("--------------------------------");
		
		n = 1 ;
		
		while ( n < 5) {
			n++;
			
			switch (n) {
			case 2: 
				System.out.println("2�� ����");
				continue;
				//switch�������� continue�� �ݺ��� �ȿ����� ����� �� �ִ�.                                                                                           
			}//switch
			
			System.out.println(n);
			
		}//while
	}//main
}
