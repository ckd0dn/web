package ex3_thread;

public class MyThread extends Thread{
	//������ : �������� �������
	//�ѹ��� �� ���� �̻��� ���μ����� ���ÿ� ���� �����ϰ� �� �ִ� Ŭ����
	
	@Override
	public void run() {
		//run()�޼��� �ȿ��� ���ǵ� �ڵ常 ���������� ����
		for( int i = 0; i < 10; i++ ) {
			
			System.out.println(i);
			
		}//for
	}
}






































