package ex3_thread;

public class ThreadMain {
	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		mt.start();//스레드의 run()메서드를 독립적으로 실행시키는 메서드
		
		for( int i = 0; i < 5; i++ ) {
			System.out.println("메인스레드의 작업");
		}
		System.out.println("프로그램 종료");
		
	}//main
}
