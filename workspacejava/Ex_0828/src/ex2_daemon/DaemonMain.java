package ex2_daemon;

public class DaemonMain {
	public static void main(String[] args) {
		//���󽺷���
		//���󽺷���� ���ν������� �۾��� ���� �������� ������ �����ϴ� ������
		//���� ȣ���� ���ν����尡 ����Ǹ� �������� ���󽺷��嵵 �Բ� ����ȴ�.
		DaemonTest dt = new DaemonTest();
		Thread t = new Thread(dt);
		
		//t��� �����尡 �������� ���������!!
		t.setDaemon(true);
		
		t.start();
		
		
		
		for (int i = 1; i <= 20; i++) {
			
			try {
				Thread.sleep(1000);
				System.out.println("������ " + i);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}//for
		
		System.out.println("���ν����� ����");
	}//main
}
