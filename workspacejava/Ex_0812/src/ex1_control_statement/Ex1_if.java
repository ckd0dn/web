package ex1_control_statement;

public class Ex1_if {
	
	public static void main(String[] args) {
		
		//��� : ���α׷��� �帧�� �����ϴ� ����
		//�б⹮�� �ݺ������� ������.
		//�б⹮ : if, switch
		//�ݺ��� : for,while
		
		//�ܼ�if��
		//if(���ǽ�){
		//���ǽ��� ���� �� ����Ǵ� ����
		//}
		
		int n = 51;
		
		//String�� �� ����ǥ �ȿ� ��������(���ڿ�)�� ������ �� �ִ� �ڷ���
		String str = "";
		System.out.println(str);
		
		if(n==50) {
			//������ ���ΰ�� �Ʒ��� �ڵ带 �����Ѵ�.
			str = "n�� 50�Դϴ�.";
			
		}
		
		
		if(n!=50) {
			str = "n�� 50�� �ƴմϴ�";
		}
		System.out.println(str);
	}//main

}
