package ex1_control_statement;

public class Ex2_if_else {
	
	public static void main(String[] args) {
		
		//if-else�� : �ϳ��� ������ ������ �ΰ����� ����� ���� ���� if��
		
		//if(���ǽ�){
		//���ǽ��� ���� �� ����Ǵ� ����
		//}else{
		//���ǽ��� ������ �� ����Ǵ� ����
		//}
		int n =49;
		String str = "";
		
		if( ++n >= 50) {
			str = "50�̻��� ��";
		}else {
			str = "50�̸��� ��";
		}
		
		System.out.println(str);
		
		System.out.println("----------------------------");
		
		//���� age�� ���̸� �����ϰ�, 30�� �̻��̸� "��Ǹ�ŭ ��̱���"��,
		//�׷��� ������ "���� ��ٸ��ž� �ڳ׿�"�� ����ϴ� if���� ����ÿ�
		
		int age = 25;
		String a = "";
		
		if( age >= 30) {
			a = "��Ǹ�ŭ ��̱���";
		}else {
			a = "���� ��ٸ��ž� �ڳ׿�";
		}
		
		System.out.println(a);                         
		System.out.println("----------------------------");
		
		//�ٷ� ���� �����ڵ带 ���� �����ڷ� �ٲٽÿ�
		
		a = age >= 30 ? "��Ǹ�ŭ ��̱���" : "���� ��ٸ��ž� �ڳ׿�";
		System.out.println(a);
	}
}
