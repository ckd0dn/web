package ex2_continue;

public class Ex1_continue {
	public static void main(String[] args) {
		
		//continue��: �ݺ��� ������ Ư�� �����̳� ����������
		//�����ϰ� �ǳʶٰ��� �� �� ����ϴ� Ű����
		for (int i = 1; i <= 2; i++) {
			
			for (int j = 1; j <= 5; j++) {
				
				if ( j % 2 == 0) {
					//continue�� ������ ���� ����� �ݺ���(for�� �� ���)��
					//���������� �̵��Ѵ�.
					//(for���� �������� ���ٸ� ���ǽ����� �̵��Ѵ�-         )
					System.out.println();
					continue;
					//System.out.println();
				}
				System.out.print(j + " ");
			}//inner
			
			System.out.println();
		}//outer
		
	}//main
}
