package ex2_continue;

public class Ex1_continue {
	public static void main(String[] args) {
		
		//continue문: 반복문 내에서 특정 문장이나 여러문장을
		//무시하고 건너뛰고자 할 때 사용하는 키워드
		for (int i = 1; i <= 2; i++) {
			
			for (int j = 1; j <= 5; j++) {
				
				if ( j % 2 == 0) {
					//continue를 만나면 가장 가까운 반복문(for문 일 경우)의
					//증감식으로 이동한다.
					//(for문애 증감식이 없다면 조건식으로 이동한다-         )
					System.out.println();
					continue;
					//System.out.println();
				}
				System.out.print(j + " ");
			}//inner
			
			System.out.println();
		}//outer
		
	}//main
}
