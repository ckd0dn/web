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
				System.out.println("여기 ");
				//break라고 하더라도 switch문에서 사용된 break문은 
				//인접한 반복문이 아닌 witch문만을 빠져 나간다!!!
				break;
			case 2:
				System.out.println("요기 ");
				break;
			
			}//switch
			n++;
		}
	}//main
}
