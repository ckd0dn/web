package ex1_try_catch;

public class Ex1_Try_Catch {
	public static void main(String[] args) {

		int[] var = {10, 20, 30};

		for( int i = 0; i <= var.length; i++ ) {

			try {
				//i <= var.length <-- �� �κп��� �߻��ϴ� ������
				//���ߴܰ迡�� ����� ������ ������ �������� �Ǽ� �̹Ƿ�
				//try-catch������ ���� ������ �Ѿ���� �ϸ� �η�̰� ����!
				System.out.println( var[i] );
			}catch (Exception e) {
				// TODO: handle exception
			}

		}//for

		System.out.println("���α׷� ����");

	}//main
}






























