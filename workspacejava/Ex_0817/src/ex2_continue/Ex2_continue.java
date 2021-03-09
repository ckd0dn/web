package ex2_continue;

public class Ex2_continue {
	public static void main(String[] args) {
		
		int n = 0;
		
		while(n < 10){
			n++;
			
			if ( n % 3 == 0) {
				//while문 안에서의 continue는 
				//가장 가까운 while문의 조건식으로 이동한다
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
				System.out.println("2로 들어옴");
				continue;
				//switch문에서의 continue는 반복문 안에서만 사용할 수 있다.                                                                                           
			}//switch
			
			System.out.println(n);
			
		}//while
	}//main
}
