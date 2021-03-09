package ex2_daemon;

public class DaemonTest implements Runnable{
	
	@Override
	public void run() {
		
		while(true) {
			
			try {
				Thread.sleep(3000);
				System.out.println("자동 저장중...");
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}//run()
}
