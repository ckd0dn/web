package ex5_sleep;

public class SleepMain {
	public static void main(String[] args) throws InterruptedException {
		
		SleepEx se = new SleepEx();
		se.start();
		
		Thread.sleep(11000);
		System.out.println("���α׷� ����");
		
	}//main
}














