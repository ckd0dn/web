package ex3_thread;

public class MyThread extends Thread{
	//스레드 : 독립적인 실행단위
	//한번에 두 가지 이상의 프로세스를 동시에 실행 가능하게 해 주는 클래스
	
	@Override
	public void run() {
		//run()메서드 안에서 정의된 코드만 독립적으로 수행
		for( int i = 0; i < 10; i++ ) {
			
			System.out.println(i);
			
		}//for
	}
}






































