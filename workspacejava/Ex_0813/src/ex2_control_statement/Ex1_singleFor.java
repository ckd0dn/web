package ex2_control_statement;

public class Ex1_singleFor {
	public static void main(String[] args) {
		
		//�ݺ��� : Ư�� ������ ������ �ݺ��� �� �ֵ��� ���ִ� ���
		
		//for( �ʱ��; ���ǽ�; ������){
		//���ǽ��� ���� �� ���� �Ǵ� ����
		//}
		
		//1���� 3���� �ڵ����� �ݺ��ϴ� for�� �����
		for(float i=1; i<100; i+=4.5f ) {
			
			System.out.println(i);
			
		}//for
		
		System.out.println("-----------------------------------------");
		//10���� 1���� �����ϴ� ���� ����ϴ� for�� ����
		for(int j=10; j>=1 ; j-- ) {
			
			System.out.println(j);
		
		}
		
		System.out.println("-----------------------------------------");
		
		for (int i = 0; i < 5; ) {
			
			System.out.println(i);
			i++;
		}
		
		System.out.println("-----------------------------------------");
		
		//1���� 100���� �ݺ��ϴ� for���� ����� 3�� ����� ȭ�鿡 ���! 
		
		for (int i = 1; i <= 100; i++) {
			
			if(i % 3 == 0) {
			System.out.println(i); 
			}
		}
		
		
	}//main
}
