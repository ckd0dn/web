package ex1_try_catch;

public class Ex1_Try_Catch {
	public static void main(String[] args) {

		int[] var = {10, 20, 30};

		for( int i = 0; i <= var.length; i++ ) {

			try {
				//i <= var.length <-- 이 부분에서 발생하는 오류는
				//개발단계에서 충분히 수정이 가능한 개발자의 실수 이므로
				//try-catch구문을 통해 적당히 넘어가려고 하면 두루미가 간다!
				System.out.println( var[i] );
			}catch (Exception e) {
				// TODO: handle exception
			}

		}//for

		System.out.println("프로그램 종료");

	}//main
}






























