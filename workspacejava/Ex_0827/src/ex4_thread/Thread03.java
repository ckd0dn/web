package ex4_thread;

public class Thread03 extends Thread{

	@Override
	public void run() {
		
		for( int i = 0; i < 100; i++ ) {
			
			System.out.print("3");
			
		}//for
		
	}
	
}
