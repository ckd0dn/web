package ex3_thread;

public class ThreadMain {
	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		mt.start();//�������� run()�޼��带 ���������� �����Ű�� �޼���
		
		for( int i = 0; i < 5; i++ ) {
			System.out.println("���ν������� �۾�");
		}
		System.out.println("���α׷� ����");
		
	}//main
}
