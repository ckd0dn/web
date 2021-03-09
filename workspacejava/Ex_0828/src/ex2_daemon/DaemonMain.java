package ex2_daemon;

public class DaemonMain {
	public static void main(String[] args) {
		//데몬스레드
		//데몬스레드는 메인스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드
		//나를 호출한 메인스레드가 종료되면 실행중인 데몬스레드도 함께 종료된다.
		DaemonTest dt = new DaemonTest();
		Thread t = new Thread(dt);
		
		//t라는 스레드가 데몬임을 명시해주자!!
		t.setDaemon(true);
		
		t.start();
		
		
		
		for (int i = 1; i <= 20; i++) {
			
			try {
				Thread.sleep(1000);
				System.out.println("게임중 " + i);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}//for
		
		System.out.println("메인스레드 종료");
	}//main
}
